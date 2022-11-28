package com.example.losowaniesortowanielach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

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

        //Buttons
        val sortButton = findViewById<Button>(R.id.sortButton)
        val randomButton = findViewById<Button>(R.id.randomButton)

        //Text view
        val sortedNumbersOutput = findViewById<TextView>(R.id.sortedNumbersText)

        //Sorting function
        fun sorting(arr:ArrayList<Int>)
        {
            var swap = true
            while(swap)
            {
                swap = false
                for(i in 0 until arr.size-1)
                {
                    if(arr[i] > arr[i+1])
                    {
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i + 1] = temp
                        swap = true
                    }
                }
            }
        }

        //Random button action
        randomButton.setOnClickListener {
            s1.text = Random.nextInt(0, 99).toString()
            s2.text = Random.nextInt(0, 99).toString()
            s3.text = Random.nextInt(0, 99).toString()
            s4.text = Random.nextInt(0, 99).toString()
            s5.text = Random.nextInt(0, 99).toString()
            s6.text = Random.nextInt(0, 99).toString()
            s7.text = Random.nextInt(0, 99).toString()
            s8.text = Random.nextInt(0, 99).toString()
            s9.text = Random.nextInt(0, 99).toString()
        }

        //Sort button action
        sortButton.setOnClickListener {
            val numbers = ArrayList<Int>()

            sortedNumbersOutput.text = ""

            if(s1.isChecked){
                numbers.add(s1.text.toString().toInt())
            }
            if(s2.isChecked){
                numbers.add(s2.text.toString().toInt())
            }
            if(s3.isChecked){
                numbers.add(s3.text.toString().toInt())
            }
            if(s4.isChecked){
                numbers.add(s4.text.toString().toInt())
            }
            if(s5.isChecked){
                numbers.add(s5.text.toString().toInt())
            }
            if(s6.isChecked){
                numbers.add(s6.text.toString().toInt())
            }
            if(s7.isChecked){
                numbers.add(s7.text.toString().toInt())
            }
            if(s8.isChecked){
                numbers.add(s8.text.toString().toInt())
            }
            if(s9.isChecked){
                numbers.add(s9.text.toString().toInt())
            }

            sorting(numbers)

            for(elem in numbers)
            {
                sortedNumbersOutput.text = sortedNumbersOutput.text.toString() + elem.toString() + ", "
            }
        }
    }
}