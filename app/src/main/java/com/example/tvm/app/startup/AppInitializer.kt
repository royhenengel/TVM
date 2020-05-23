package com.example.tvm.app.startup

import android.content.Context
import com.example.tvm.app.startup.component.TimberLoggerInitializer
import com.example.tvm.base.module.APPLICATION_CONTEXT
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class AppInitializer @Inject constructor(
    @Named(APPLICATION_CONTEXT) private val context: Context
) {

    private val initializedComponents =
        mutableMapOf<Class<out ComponentInitializer<out Any>>, Any>()

    private val componentDependencies =
        listOf<Class<out ComponentInitializer<out Any>>>(
            TimberLoggerInitializer::class.java
        )

    fun discoverAndInit() {
        componentDependencies.forEach {
            if (ComponentInitializer::class.java.isAssignableFrom(it)) {
                initializeAll<Any>(it)
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(NoSuchMethodException::class, SecurityException::class)
    private fun <T> initializeAll(
        componentInitializer: Class<out ComponentInitializer<out Any>>
    ): T? {
        val result: Any?

        if (!initializedComponents.containsKey(componentInitializer)) {
            val componentInitializerInstance =
                componentInitializer.getDeclaredConstructor().newInstance() as ComponentInitializer<out Any>

            val listOfComponentInitializerDependencies = componentInitializerInstance.dependencies()

            listOfComponentInitializerDependencies?.forEach {
                if (!initializedComponents.containsKey(it)) {
                    initializeAll<T>(componentInitializer = it)
                }
            }

            result = componentInitializerInstance.create(context)

            initializedComponents[componentInitializer] = result
        } else {
            result = initializedComponents[componentInitializer]
        }

        return result as T
    }
}