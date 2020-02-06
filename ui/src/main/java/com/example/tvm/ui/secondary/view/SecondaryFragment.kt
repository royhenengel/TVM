package com.example.tvm.ui.secondary.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tvm.ui.databinding.SecondaryFragmentBinding
import com.example.tvm.ui.secondary.viewmodel.SecondaryFragmentViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SecondaryFragment : DaggerFragment() {

    companion object {
        fun newInstance() = SecondaryFragment()
    }

    @Inject
    lateinit var viewModel: SecondaryFragmentViewModel

    private lateinit var binding: SecondaryFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return SecondaryFragmentBinding.inflate(inflater, container, false).let {
            this.binding = it

            it.root
        }
    }

}
