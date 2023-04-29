package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var button4: TextView
        lateinit var button5: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button4 = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, meme2::class.java)
            startActivity(intent)


        }
        button5 = findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)

        }
    }
}
