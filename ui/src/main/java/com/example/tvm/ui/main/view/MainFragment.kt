package com.example.tvm.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tvm.shared.result.EventObserver
import com.example.tvm.ui.databinding.MainFragmentBinding
import com.example.tvm.ui.main.viewmodel.MainFragmentViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var viewModel: MainFragmentViewModel

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return MainFragmentBinding.inflate(inflater, container, false).let {
            binding = it

            binding.viewModel = viewModel

            it.root
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        observe()
    }

    private fun observe() {
        viewModel.navSecondary.observe(viewLifecycleOwner, EventObserver {
            val navAction = MainFragmentDirections.actionDestMainToDestSecondary(it)

            findNavController().navigate(navAction)
        } )
    }

}
