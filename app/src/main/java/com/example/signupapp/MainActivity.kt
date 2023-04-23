package com.example.signupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signupapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Declare Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable Binding to Inflate Layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}