package com.example.tvm.ui.main.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tvm.ui.databinding.MainFragmentBinding
import com.example.tvm.ui.ext.uiDaggerComponent
import com.example.tvm.ui.main.viewmodel.MainMoviesFragmentViewModel
import javax.inject.Inject

class MainMoviesFragment: Fragment() {

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

    override fun onAttach(context: Context) {
        super.onAttach(context)

        uiDaggerComponent(this)
            .inject(this)
    }
}
