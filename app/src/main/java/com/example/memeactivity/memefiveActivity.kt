package com.example.memeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memefiveActivity : AppCompatActivity() {
    lateinit var but: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
        but = findViewById(R.id.but)

        but.setOnClickListener {
            val intent = Intent(this,memefourActivity::class.java)
            startActivity(intent)
        }
    }
}