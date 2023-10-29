package com.hgapp.qrbar.extension

fun Long?.orZero(): Long {
    return this ?: 0L
}