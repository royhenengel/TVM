package com.example.tvm.base.logging

import timber.log.Timber
import java.util.concurrent.atomic.AtomicBoolean

object TimberLogger : Logger {

    private val initialized = AtomicBoolean()

    @JvmStatic
    fun initialize(debug: Boolean) {
        if (!initialized.getAndSet(true)) {
            if (debug) {
                Timber.plant(Timber.DebugTree())
            }
        }
    }

    override fun v(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.v(message, *args)
        }
    }

    override fun v(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.v(t, message, *args)
        }
    }

    override fun v(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.v(t)
    }

    override fun d(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.d(message, *args)
        }
    }

    override fun d(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.d(t, message, *args)
        }
    }

    override fun d(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.d(t)
    }

    override fun i(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.i(message, *args)
        }
    }

    override fun i(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.i(t, message, *args)
        }
    }

    override fun i(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.i(t)
    }

    override fun w(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.w(message, *args)
        }
    }

    override fun w(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.w(t, message, *args)
        }
    }

    override fun w(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.w(t)
    }

    override fun e(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.e(message, *args)
        }
    }

    override fun e(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.e(t, message, *args)
        }
    }

    override fun e(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.e(t)
    }

    override fun wtf(message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.wtf(message, *args)
        }
    }

    override fun wtf(t: Throwable, message: String?, vararg args: Any?) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        if (!message.isNullOrEmpty()) {
            Timber.wtf(t, message, *args)
        }
    }

    override fun wtf(t: Throwable) {
        check(initialized.get()) { "TimberLogger is not initialized" }

        Timber.wtf(t)
    }
}