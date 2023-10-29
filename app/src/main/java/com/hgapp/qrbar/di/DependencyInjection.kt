package com.hgapp.qrbar.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hgapp.qrbar.App
import com.hgapp.qrbar.usecase.*


val com.hgapp.qrbar.App.settings
    get() = Settings.getInstance(applicationContext)


val AppCompatActivity.barcodeParser
    get() = BarcodeParser

val AppCompatActivity.barcodeImageScanner
    get() = BarcodeImageScanner

val AppCompatActivity.barcodeImageGenerator
    get() = BarcodeImageGenerator

val AppCompatActivity.barcodeSaver
    get() = BarcodeSaver

val AppCompatActivity.barcodeImageSaver
    get() = BarcodeImageSaver

val AppCompatActivity.wifiConnector
    get() = WifiConnector

val AppCompatActivity.otpGenerator
    get() = OTPGenerator

val AppCompatActivity.barcodeDatabase
    get() = BarcodeDatabase.getInstance(this)

val AppCompatActivity.settings
    get() = Settings.getInstance(this)

val AppCompatActivity.contactHelper
    get() = ContactHelper

val AppCompatActivity.permissionsHelper
    get() = PermissionsHelper

val AppCompatActivity.rotationHelper
    get() = RotationHelper


val Fragment.scannerCameraHelper
    get() = ScannerCameraHelper

val Fragment.barcodeParser
    get() = BarcodeParser

val Fragment.barcodeDatabase
    get() = BarcodeDatabase.getInstance(requireContext())

val Fragment.settings
    get() = Settings.getInstance(requireContext())

val Fragment.permissionsHelper
    get() = PermissionsHelper