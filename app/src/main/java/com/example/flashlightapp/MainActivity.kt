package com.example.flashlightapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flashlightapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var flashLight = FlashLigth(this)
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.lightButton.setOnClickListener {
            onClickFlash()
        }

    }

    private fun onClickFlash() {
        when(flashLight.isFlashStatus()) {
            true -> {
                flashLight.flashOff()
                binding.lightButton.text = "ON"
                binding.lightButton.setBackgroundResource(R.drawable.circle_off)
            }
            false -> {
                flashLight.flashOn()
                binding.lightButton.text = "OFF"

                binding.lightButton.setBackgroundResource(R.drawable.circle_on)
            }
        }
    }
}