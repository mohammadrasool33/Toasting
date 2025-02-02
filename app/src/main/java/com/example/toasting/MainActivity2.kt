package com.example.toasting

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
    }
    override fun onStart(){
        super.onStart()
        Log.d("MainActivity 2","onStart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity2","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity2","onResume")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity2","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity2","onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity2","onRestart")
    }
}