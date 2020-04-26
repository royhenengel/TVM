package com.example.tvm.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tvm.base.fragment.BaseFragment
import com.example.tvm.ui.databinding.MainFragmentBinding
import com.example.tvm.ui.main.viewmodel.MainMoviesFragmentViewModel
import javax.inject.Inject

class MainMoviesFragment: BaseFragment() {

    @Inject
    lateinit var viewModel: MainMoviesFragmentViewModel

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return MainFragmentBinding.inflate(inflater, container, false).let {
            binding = it

            it.root
        }
    }

}
