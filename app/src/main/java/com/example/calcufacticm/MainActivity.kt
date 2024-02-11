package com.example.calcufacticm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcu : Button = findViewById(R.id.btnCalcu)
        val btnFactorial : Button = findViewById(R.id.btnFactorial)
        val btnImc : Button = findViewById(R.id.btnIcm)
        val btnLinear : Button = findViewById(R.id.btnLinear)
        val btnFrame : Button = findViewById(R.id.btnFrame)
        val btnConstraint : Button = findViewById(R.id.btnConstraint)

        btnCalcu.setOnClickListener(){
            val ventCalcu = Intent(this, Calculadora::class.java)
            startActivity(ventCalcu)
        }

        btnFactorial.setOnClickListener(){
            val ventFact = Intent(this, Factorial::class.java)
            startActivity(ventFact)
        }

        btnImc.setOnClickListener(){
            val ventImc = Intent(this, IMC::class.java)
            startActivity(ventImc)
        }

        btnLinear.setOnClickListener(){
            val ventLinear = Intent(this, LinearActivity::class.java)
            startActivity(ventLinear)
        }

        btnFrame.setOnClickListener(){
            val ventFrame = Intent(this, FrameActivity::class.java)
            startActivity(ventFrame)
        }

        btnConstraint.setOnClickListener(){
            val ventConstraint = Intent(this, ConstraintActivity::class.java)
            startActivity(ventConstraint)
        }


    }
}