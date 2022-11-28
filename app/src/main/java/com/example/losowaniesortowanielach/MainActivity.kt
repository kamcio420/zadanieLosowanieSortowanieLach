package com.example.losowaniesortowanielach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Switches
        val s1 = findViewById<Switch>(R.id.switch1)
        val s2 = findViewById<Switch>(R.id.switch2)
        val s3 = findViewById<Switch>(R.id.switch3)
        val s4 = findViewById<Switch>(R.id.switch4)
        val s5 = findViewById<Switch>(R.id.switch5)
        val s6 = findViewById<Switch>(R.id.switch6)
        val s7 = findViewById<Switch>(R.id.switch7)
        val s8 = findViewById<Switch>(R.id.switch8)
        val s9 = findViewById<Switch>(R.id.switch9)
    }
}