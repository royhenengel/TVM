package com.example.tvm.ui.secondary.view

import android.os.Bundle
import android.view.*
import com.example.tvm.shared.result.EventObserver
import com.example.tvm.ui.R
import com.example.tvm.ui.databinding.SecondaryFragmentBinding
import com.example.tvm.ui.secondary.viewmodel.SecondaryFragmentViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SecondaryFragment : DaggerFragment() {

    companion object {
        fun newInstance() = SecondaryFragment()
    }

    @Inject
    lateinit var viewModel: SecondaryFragmentViewModel

    private lateinit var binding: SecondaryFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_secondary, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.actionShare -> viewModel.actionShare()

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return SecondaryFragmentBinding.inflate(inflater, container, false).let {
            this.binding = it

            it.root
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        observe()
    }

    private fun observe() {
        viewModel.actionShare.observe(viewLifecycleOwner, EventObserver {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
        })
    }
}
