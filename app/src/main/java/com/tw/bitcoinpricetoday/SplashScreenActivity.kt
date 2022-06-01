package com.tw.bitcoinpricetoday

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import com.rommansabbir.animationx.*
import com.rommansabbir.animationx.Slide
import com.rommansabbir.animationx.animationXSlide
import com.tw.bitcoinpricetoday.views.Bitcoin.BitcoinActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    lateinit var bitcoin: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        bitcoin= findViewById(R.id.bitcoin)

        bitcoin.animationXZoom(Zoom.ZOOM_IN_DOWN)
        Handler().postDelayed({

            GlobalScope.launch(Dispatchers.Main) {

                        val intent = Intent(this@SplashScreenActivity, BitcoinActivity::class.java)
                        this@SplashScreenActivity.startActivity(intent)
                        finish()
            }

        }, 3000)

    }
}