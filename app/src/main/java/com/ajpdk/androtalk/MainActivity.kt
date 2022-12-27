package com.ajpdk.androtalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.ajpdk.androtalk.databinding.ActivityMainBinding


import com.ajpdk.androtalk.ml.GPT2Client

class MainActivity : AppCompatActivity() {
    private val gpt2: GPT2Client by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Bind layout with ViewModel
        binding.vm = gpt2

        // LiveData needs the lifecycle owner
        binding.lifecycleOwner = this
    }
}