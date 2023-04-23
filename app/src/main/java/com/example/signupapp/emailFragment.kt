package com.example.signupapp

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.signupapp.databinding.FragmentEmailBinding

class emailFragment : Fragment() {

    private lateinit var binding: FragmentEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailBinding.inflate(inflater,container,false)
        val inputName = requireArguments().getString("user_input")


        binding.btnSubmit.setOnClickListener {
            if(!TextUtils.isEmpty(binding.etEmail.text.toString())) {
                val bundle = bundleOf("user_input" to inputName, "user_email" to binding.etEmail.text.toString())
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
            }else{
                Toast.makeText(activity,"Please enter an email", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

}