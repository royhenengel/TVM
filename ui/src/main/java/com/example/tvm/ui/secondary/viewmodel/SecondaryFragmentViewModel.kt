package com.example.tvm.ui.secondary.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tvm.shared.result.Event
import javax.inject.Inject

class SecondaryFragmentViewModel @Inject constructor() : ViewModel() {

    private val _actionShare = MutableLiveData<Event<String>>()
    val actionShare: LiveData<Event<String>>
        get() = _actionShare

    fun actionShare(): Boolean {
        _actionShare.value = Event("Share clicked")

        return true
    }
}
