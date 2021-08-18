package com.tbadhit.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.tbadhit.mynavigation.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    // (1)
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    //-----

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // (1)
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        //-----
    }

    // (1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // (1)
        binding.btnCategoryLifestyle.setOnClickListener { view ->
            // USE BUNDLE
//            val mBundle = Bundle()
//            mBundle.putString(EXTRA_NAME, "Lifestyle")
//            mBundle.putLong(EXTRA_STOCK, 7)
//            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle)

            // USE SafeArgs
            // (SafeArgs)
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Lifestyle"
            toDetailCategoryFragment.stock = 7
            view.findNavController().navigate(toDetailCategoryFragment)
        }
    }

    // (1)
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    // (1)
    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_STOCK = "extra_stock"
    }
}