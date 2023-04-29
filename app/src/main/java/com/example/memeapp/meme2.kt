package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme2 : AppCompatActivity() {
    lateinit var button3: TextView
    lateinit var button2:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this,meme3::class.java)
            startActivity(intent)


            }
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val backward=Intent(this,MainActivity::class.java)
            startActivity(backward)
        }



        }
    }
