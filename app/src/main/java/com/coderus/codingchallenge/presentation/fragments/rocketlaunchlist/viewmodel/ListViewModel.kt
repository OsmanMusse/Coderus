package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coderus.codingchallenge.data.local.RocketLaunch
import com.coderus.codingchallenge.data.remote.APIService
import com.coderus.codingchallenge.domain.repository.LauncherRepository
import com.coderus.codingchallenge.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel class to expose data to the ListFragment that it is required to display.
 */
@HiltViewModel
class ListViewModel @Inject constructor(
    private val listRepository: LauncherRepository,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel() {

    /**
     * A [LiveData] that can be updated to provide a list of Rocket Launches from the [APIService]
     * or stored locally.
     */
    val rocketLaunchResults: LiveData<List<RocketLaunch>>
        get() = _rocketLaunchResults
    private val _rocketLaunchResults = MutableLiveData<List<RocketLaunch>>()

    val isListLoading: LiveData<Boolean>
            get() = _isListLoading

    private val _isListLoading = MutableLiveData(false)


    init {
        retrieveData()
    }

    /**
     * Request the list of [RocketLaunch] data.
     */


    fun retrieveData() {
        _isListLoading.postValue(true)
        viewModelScope.launch(dispatcher) {
            listRepository.getRocketList().collect{ result ->
                when(result){
                    is Resource.Error -> Unit
                    is Resource.Success -> {
                        result.data?.let { launcherList ->
                            _isListLoading.postValue(false)
                            _rocketLaunchResults.postValue(launcherList)
                        }
                    }
                }
            }

        }
    }
}
