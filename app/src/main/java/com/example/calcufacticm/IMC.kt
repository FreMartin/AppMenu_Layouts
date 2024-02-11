package com.example.calcufacticm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class IMC : AppCompatActivity() {
    private val etEstatura: EditText = findViewById(R.id.etEstatura)
    private val etPeso: EditText = findViewById(R.id.etPeso)
    private val tvImc: TextView = findViewById(R.id.tvFact)
    private val btnImc: Button = findViewById(R.id.btnImc)
    private var estatura = 0.0
    private var peso = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        btnImc.setOnClickListener(){
            estatura = etEstatura.text.toString().toDouble()
            peso = etPeso.text.toString().toInt()
            var imc = calcImc(estatura, peso)
            tvImc.text = "Su índice de masa corporal es $imc"
        }

    }


    private fun calcImc (estatura: Double, peso: Int) :Double{
        return peso/(estatura*estatura)
    }
}