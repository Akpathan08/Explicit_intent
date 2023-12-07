package com.example.imee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profilebt = findViewById<Button>(R.id.Profilebtn)

        profilebt.setOnClickListener{
            val intent= Intent(this,Profileac::class.java)
            startActivity(intent)
        }
    }
}