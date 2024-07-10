package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.coderus.codingchallenge.domain.repository.LauncherRepository
import com.coderus.codingchallenge.domain.repository.LauncherRepository_Impl
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class ListViewModelTest {


    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    private val repo = mockk<LauncherRepository>(relaxed = true)
    private lateinit var viewModel: ListViewModel



    @Before
    fun setup(){
        viewModel = ListViewModel(repo,dispatcher)
        Dispatchers.setMain(dispatcher)
    }

    @Test
    fun `Test loading state is shown before the content`(){
        var isLoading = true
        viewModel.isListLoading.observeForever{
            isLoading = it
        }
        viewModel.retrieveData()
        dispatcher.scheduler.advanceUntilIdle()
        assert(isLoading)
    }
}