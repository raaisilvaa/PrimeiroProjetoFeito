package com.projetoraaisilvaa.primeiroprojetofeito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ExerciseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
    }
    val btSend = findViewById<Button>(R.id.btSend)
    val etEmail = findViewById<TextView>(R.id.etEmail)
    val tvResult = findViewById<TextView>(R.id.tvResult)

    btSend.setOnClickListener {

    }
}