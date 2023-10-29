package com.hgapp.qrbar.extension

fun <T> unsafeLazy(initializer: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)