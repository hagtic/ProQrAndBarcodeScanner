package com.hgapp.qrbar.extension

fun Boolean?.orFalse(): Boolean {
    return this ?: false
}