package com.carlyle.cosplaycompanion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRandom = Random()
        val buttonGenerate =
            findViewById<View>(R.id.generate) as Button
        val textGenerateNumber =
            findViewById<View>(R.id.generatenumber) as TextView
        buttonGenerate.setOnClickListener {
            // TODO Auto-generated method stub
            textGenerateNumber.text = myRandom.nextInt(100).toString()
        }
    }
}