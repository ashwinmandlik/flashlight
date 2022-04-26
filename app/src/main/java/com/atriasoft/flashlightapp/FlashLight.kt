package com.atriasoft.flashlightapp

import android.content.Context
import android.content.Context.CAMERA_SERVICE
import android.hardware.camera2.CameraManager

class FlashLigth(var context: Context) {
    private var flashStatus: Boolean = false
    private var blinkStatus: Boolean = false

    fun flashOn() {
        var cameraManager: CameraManager = context.getSystemService(CAMERA_SERVICE) as CameraManager
        val cameraId = cameraManager.cameraIdList[0]
        cameraManager.setTorchMode(cameraId, true)
        flashStatus = true

    }

    fun flashOff() {
        var cameraManager: CameraManager = context.getSystemService(CAMERA_SERVICE) as CameraManager
        val cameraId = cameraManager.cameraIdList[0]
        cameraManager.setTorchMode(cameraId, false)
        flashStatus = false

    }

    fun isFlashStatus(): Boolean {
        return flashStatus
    }
}