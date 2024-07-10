package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.coderus.codingchallenge.R
import androidx.navigation.fragment.findNavController
import com.coderus.codingchallenge.presentation.MainActivity
import com.coderus.codingchallenge.adapters.RocketLaunchListAdapter
import com.coderus.codingchallenge.databinding.FragmentListBinding
import com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.viewmodel.ListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Fragment to display the list of Rocket Launches.
 */

@AndroidEntryPoint
class ListFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()
    private lateinit var adapter: RocketLaunchListAdapter

    private var _binding: FragmentListBinding? = null
    private val binding: FragmentListBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        observeViewmodel()
        handleClickEvents()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Setup the list adapter and give it it's data to be displayed.
    private fun setupAdapter() {
        adapter = RocketLaunchListAdapter(requireContext()).apply {
            binding.rocketLaunchList.adapter = this
            binding.rocketLaunchList.addItemDecoration(ListItemDecoration(20))
        }
    }

    private fun observeViewmodel(){
        // Observing the list of rocket launchers
            viewModel.rocketLaunchResults.observe(viewLifecycleOwner){ list ->
                println("Retrieved data == ${list}")
                adapter.submitList(list)
        }


        // Observing the Loading state of the list of ships
        viewModel.isListLoading.observe(viewLifecycleOwner){ isLoading ->
            val visibility = if (isLoading) View.VISIBLE else View.GONE
            binding.progressCircular.visibility = visibility
        }
    }

    private fun handleClickEvents(){
        adapter.setupOnClickListener { rocketLaunch ->
            val bundle = Bundle().apply {
                putSerializable("rocketdetails",rocketLaunch.details?: "NO DETAILS ASSIGNED")
            }

            // Navigate to the details screen
            findNavController().navigate(R.id.action_listFragment_to_detailFragment,bundle)
        }
    }
}
