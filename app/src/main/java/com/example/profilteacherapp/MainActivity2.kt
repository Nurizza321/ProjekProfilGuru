package com.example.profilteacherapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       val btn = findViewById<ImageView>(R.id.ok)

        btn.setOnClickListener {

            val Intent = Intent( this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}