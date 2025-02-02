package com.example.toasting

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.button)
        button.setOnClickListener {
            toast()
        }
    }
    fun toast(){
        Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
    }
}