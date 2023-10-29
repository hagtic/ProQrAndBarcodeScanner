package com.hgapp.qrbar.feature.tabs.settings.camera

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.hgapp.qrbar.R
import com.hgapp.qrbar.di.settings
import com.hgapp.qrbar.extension.applySystemWindowInsets
import com.hgapp.qrbar.feature.BaseActivity
import kotlinx.android.synthetic.main.activity_choose_camera.*

class ChooseCameraActivity : BaseActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ChooseCameraActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_camera)
        supportEdgeToEdge()
        handleToolbarBackClicked()
    }

    override fun onResume() {
        super.onResume()
        showSelectedCamera()
        handleBackCameraButtonChecked()
        handleFrontCameraButtonChecked()
    }

    private fun showSelectedCamera() {
        val isBackCamera = settings.isBackCamera
        button_back_camera.isChecked = isBackCamera
        button_front_camera.isChecked = isBackCamera.not()
    }

    private fun supportEdgeToEdge() {
        root_view.applySystemWindowInsets(applyTop = true, applyBottom = true)
    }

    private fun handleToolbarBackClicked() {
        toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun handleBackCameraButtonChecked() {
        button_back_camera.setCheckedChangedListener { isChecked ->
            if (isChecked) {
                button_front_camera.isChecked = false
            }
            settings.isBackCamera = isChecked
        }
    }

    private fun handleFrontCameraButtonChecked() {
        button_front_camera.setCheckedChangedListener { isChecked ->
            if (isChecked) {
                button_back_camera.isChecked = false
            }
            settings.isBackCamera = isChecked.not()
        }
    }
}