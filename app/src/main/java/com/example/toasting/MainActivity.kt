package com.example.toasting

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toasting.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(){
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.d("MainActivity","onStart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart")
    }


}