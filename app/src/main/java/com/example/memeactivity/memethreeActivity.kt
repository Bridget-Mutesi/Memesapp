package com.example.memeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memethreeActivity : AppCompatActivity() {
    lateinit var button4: TextView
    lateinit var button5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        button4.setOnClickListener {
            val intent = Intent(this,twomemeActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, memefourActivity::class.java)
            startActivity(intent)
        }

    }
}




//class twomemeActivity : AppCompatActivity() {
//    lateinit var  button2: TextView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_twomeme)
//        button2 = findViewById(R.id.button2)
//
//        button2.setOnClickListener {
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
//    }
//
//}