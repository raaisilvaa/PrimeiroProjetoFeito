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
        //Declarar um Listener
        btSend.setOnClickListener {
            //Tudo que eu escrever dentro das chaves, será executado quando clicar no botão
            tvResult.text = "Raí Silva"


        }
    }
}