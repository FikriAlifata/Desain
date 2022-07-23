package com.example.desain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.desain.databinding.FragmentOneBinding


class OneFragment : Fragment() {
    private lateinit var  binding: FragmentOneBinding
    private val id = "saklon"
    private val pass = "1234"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.login.setOnClickListener{
            if (binding.editTextTextPersonName.text.toString() == id && binding.editTextTextPassword.text.toString() == pass){
                view.findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
            }else{
                Toast.makeText(activity, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

}