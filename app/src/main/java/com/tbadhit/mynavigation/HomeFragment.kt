package com.tbadhit.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.tbadhit.mynavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // (1)
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    //-----

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // (1)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        //-----
    }

    // (1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // (1)
        binding.btnCategory.setOnClickListener { view ->
            // Call action
            view.findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
        }

        // (1)
        binding.btnProfile.setOnClickListener { view ->
            // Call action
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
    }

    // (1)
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}