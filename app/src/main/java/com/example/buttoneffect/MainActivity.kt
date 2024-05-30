package com.example.buttoneffect

import android.media.MediaPlayer
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val lightningButton: Button = findViewById(R.id.lightning_button)

        val lightningEffect = AnimationUtils.loadAnimation(this, R.anim.lightning_effect)

        lightningButton.setOnClickListener {
            it.startAnimation(lightningEffect)



            }
        }
    }

