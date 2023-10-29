package com.hgapp.qrbar.feature.tile

import android.content.Intent
import android.os.Build
import android.service.quicksettings.TileService
import androidx.annotation.RequiresApi
import com.hgapp.qrbar.feature.tabs.BottomTabsActivity

@RequiresApi(api = Build.VERSION_CODES.N)
class QuickSettingsTileService : TileService() {

    override fun onClick() {
        super.onClick()
        val intent = Intent(applicationContext, BottomTabsActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }
        startActivityAndCollapse(intent)
    }
}