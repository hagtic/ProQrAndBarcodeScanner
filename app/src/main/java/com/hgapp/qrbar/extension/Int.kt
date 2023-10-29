package com.hgapp.qrbar.extension

fun Int?.orZero(): Int {
    return this ?: 0
}