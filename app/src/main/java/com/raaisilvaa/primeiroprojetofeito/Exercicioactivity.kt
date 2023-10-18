package com.raaisilvaa.primeiroprojetofeito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.projetoraaisilvaa.primeiroprojetofeito.R
import org.jetbrains.annotations.NotNull

class Exercicioactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercicio_activy)
    }
    val mensagemSucesso : TextView = findViewById(R.id.mensagemSucesso)
    val digiteEmail : TextView = findViewById(R.id.digiteEmail)
    val botaoSubmit : TextView = findViewById(R.id.botaoSubmit)



}