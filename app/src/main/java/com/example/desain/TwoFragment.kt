package com.example.desain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.desain.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentTwoBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false)

        binding.button3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_twoFragment_to_threeFragment)
        )

        binding.button4.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_twoFragment_to_fourFragment)
        )

        binding.button5.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_twoFragment_to_fiveFragment)
        )

        return binding.root
    }

}