package com.example.signupapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.signupapp.databinding.FragmentWelcomeBinding

class welcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)
        val input = requireArguments().getString("user_input")
        val email = requireArguments().getString("user_email")
        binding.apply {
            tvName.text = input
            tvEmail.text = email

            btnViewTerms.setOnClickListener {
                it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
            }
        }
        return binding.root

    }


}