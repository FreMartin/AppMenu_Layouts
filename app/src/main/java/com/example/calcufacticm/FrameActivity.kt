package com.example.calcufacticm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame)
        val imgAtrasF : ImageView = findViewById(R.id.imgAtrasF)

        imgAtrasF.setOnClickListener(){
            finish()
        }
    }
}