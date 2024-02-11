package com.example.calcufacticm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Factorial : AppCompatActivity() {
    private var valor = 0
    private var tvResultado: TextView = findViewById(R.id.tvFact)
    private var etValor: EditText = findViewById(R.id.etValor)
    private var btnFact: Button = findViewById(R.id.btnFact)
    private var btnSalir: Button = findViewById(R.id.btnSalir)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial)

        btnFact.setOnClickListener(){
            valor = etValor.text.toString().toInt()
            try {

                val resultFact = calcularFactorial(valor)
                tvResultado.text = ("El factorial de ${valor} es ${resultFact}")

            }catch (e:Exception){

                tvResultado.text = "Valor invalido"

            }
        }

        btnSalir.setOnClickListener(){
            finish()
        }


    }
    fun calcularFactorial(n: Int): Long {
        if (n < 0) {
            return -1 // Factorial no está definido para números negativos
        }
        var factorial: Long = 1
        for (i in 1..n) {
            factorial *= i.toLong()
        }
        return factorial
    }

}