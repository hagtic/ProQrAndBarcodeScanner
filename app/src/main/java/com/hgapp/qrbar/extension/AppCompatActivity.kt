package com.hgapp.qrbar.extension

import androidx.appcompat.app.AppCompatActivity
import com.hgapp.qrbar.feature.common.dialog.ErrorDialogFragment

fun AppCompatActivity.showError(error: Throwable?) {
    val errorDialog =
        ErrorDialogFragment.newInstance(
            this,
            error
        )
    errorDialog.show(supportFragmentManager, "")
}