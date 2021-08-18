package com.tbadhit.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tbadhit.mynavigation.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {

    // (1)
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!
    //-----

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        // (1)
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
        //-----
    }

    // (1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // USE BUNDLE
        // (1)
        // val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
        // val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)
        //----

        // USE SafeArgs
        // (SafeArgs)
        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDescription = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock
        //-----

        // (1)
        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock : $dataDescription"
        //-----

        // (2)
        binding.btnProfile.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment)
        )
        //-----
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}