package com.example.calcufacticm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LinearActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        val imgAtras : ImageView = findViewById(R.id.imgAtras)

        imgAtras.setOnClickListener(){
            finish()
        }
    }
}