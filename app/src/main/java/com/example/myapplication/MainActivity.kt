package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hello = "Hello World"

        val a = 1
        val b = 2
        val result = a + b

        val maybe = "Maybe in the future"

        val cause = hello + maybe

        val helloWorld = "Hello World ya, tambahan lagi"
    }
}
