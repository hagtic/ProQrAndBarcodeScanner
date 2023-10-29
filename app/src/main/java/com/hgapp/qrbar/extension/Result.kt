package com.hgapp.qrbar.extension

import com.hgapp.qrbar.model.Barcode
import com.google.zxing.Result

fun Result.equalTo(barcode: Barcode?): Boolean {
    return barcodeFormat == barcode?.format && text == barcode?.text
}