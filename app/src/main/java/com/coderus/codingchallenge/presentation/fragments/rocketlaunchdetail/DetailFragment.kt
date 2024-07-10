package com.coderus.codingchallenge.presentation.fragments.rocketlaunchdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.coderus.codingchallenge.databinding.FragmentDetailBinding

/**
 * A Fragment to display details of specific launches.
 */
class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val args: DetailFragmentArgs by navArgs()
    private val binding: FragmentDetailBinding
        get() = _binding!!
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI(){
        binding?.launcherDetails?.text = args.rocketdetails
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}