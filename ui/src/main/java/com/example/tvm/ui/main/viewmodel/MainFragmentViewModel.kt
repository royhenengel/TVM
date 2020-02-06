package com.example.tvm.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tvm.domain.interactor.UseCase
import com.example.tvm.shared.result.Event
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    private val _navSecondary = MutableLiveData<Event<Int>>()
    val navSecondary: LiveData<Event<Int>> = _navSecondary

    fun onClicked() {
        _navSecondary.value = Event(0)
    }
}
