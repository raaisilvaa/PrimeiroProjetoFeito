package com.projetoraaisilvaa.primeiroprojetofeito

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Encontrar os elementos de interface
        //findViewById
        //<> -> Tipo da informação (TextView, EditText, Button, etc
        //() -> ID da informação (R.id.tvResult, etc)
        //val -> variáveis que não mudam de valor
        //var -> variáveis que podem mudar de valor
        val btSend = findViewById<Button>(R.id.btSend)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etName = findViewById<TextView>(R.id.etName)
        //Declarar um Listener
        btSend.setOnClickListener {
            //tvResult.text = "Raí Silva" -> dessa forma coloco o texto direto.
            //nessa caso toString() serviu para parar de sublinhar o texto, transformando-o em String. d
            tvResult.text = etName.text.toString() // o que digitar no etName é o que irá aparecer no tvResult.

        }
    }
}