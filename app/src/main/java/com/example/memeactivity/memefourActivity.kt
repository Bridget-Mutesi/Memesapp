package com.example.memeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memefourActivity : AppCompatActivity() {
    lateinit var but6: TextView
    lateinit var but7: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        but6 = findViewById(R.id.but6)
        but7 = findViewById(R.id.but7)

        but6.setOnClickListener {
            val  intent = Intent(this,memethreeActivity::class.java)
            startActivity(intent)
        }
        but7.setOnClickListener {
            val intent = Intent(this,memefiveActivity::class.java)
            startActivity(intent)
        }
    }
}




//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_memethree)
//    button4 = findViewById(R.id.button4)
//    button5 = findViewById(R.id.button5)
//
//    button4.setOnClickListener {
//        val intent = Intent(this,twomemeActivity::class.java)
//        startActivity(intent)
//    }
//    button5.setOnClickListener {
//        val intent = Intent(this, memefourActivity::class.java)
////        startActivity(intent)