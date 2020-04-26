package com.example.tvm.ui.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelProviderFactoryImpl @Inject constructor(
    private val providers: Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
            try {
                val provider = requireNotNull(providers[modelClass] as Provider<T>) {
                    "No ViewModel of type $modelClass is bound with this provider"
                }

                requireNotNull(provider.get()) {
                    "$modelClass is Null..."
                }
            } catch (e: Exception) {
                // do some logs here
                error("ViewModel type for this provider is wrong: $modelClass")
            }
}
