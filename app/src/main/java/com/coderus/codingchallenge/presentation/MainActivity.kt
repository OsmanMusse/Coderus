package com.coderus.codingchallenge.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coderus.codingchallenge.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        initViewModel()
    }


//    private fun initViewModel(){
//        val viewModelProviderFactory = ViewModelFactory(repository)
//        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(ListViewModel::class.java)
//    }
}
