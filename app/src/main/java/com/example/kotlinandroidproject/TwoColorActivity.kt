package com.example.kotlinandroidproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)
        settingButtons()
    }

    fun settingButtons(){
        val redButton = findViewById<Button>(R.id.button_red_fragment)
        val blueButton = findViewById<Button>(R.id.button_blue_fragment)

        redButton.setOnClickListener{
            val fragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, RedFragment())
            fragmentTransaction.commit()
        }
        blueButton.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, BlueFragment())
            fragmentTransaction.commit()
        }
    }
}

