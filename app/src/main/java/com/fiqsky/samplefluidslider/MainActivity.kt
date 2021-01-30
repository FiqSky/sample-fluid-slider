package com.fiqsky.samplefluidslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSlider()
    }

    private fun setSlider() {
        fluid.position = 0f

        fluid.positionListener = {
            pos -> textView.text = (pos * 100).toString()
        }

        fluid.beginTrackingListener = {
            Log.i("MainActivity", "setSlider: Started")
        }

        fluid.endTrackingListener = {
            Log.i("MainActivity", "setSlider: Ended")
        }
    }
}