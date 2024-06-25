package com.example.languagesdemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.*

/**
 * Filename: NewActivity
 * Author: GG
 * Date: 2024/6/25
 * Description:
 */
class NewActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.w("AppCompatActivity", "onCreate: NewActivity", )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("AppCompatActivity", "onDestroy: NewActivity", )

    }
}