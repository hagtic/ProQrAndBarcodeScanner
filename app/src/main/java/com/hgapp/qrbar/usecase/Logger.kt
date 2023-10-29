package com.hgapp.qrbar.usecase

import com.hgapp.qrbar.BuildConfig

object Logger {
    var isEnabled = com.hgapp.qrbar.BuildConfig.ERROR_REPORTS_ENABLED_BY_DEFAULT

    fun log(error: Throwable) {
        if (isEnabled) {
        }
    }
}