package com.example.tvm.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tvm.domain.interactor.UseCase
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel()
