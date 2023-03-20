package com.example.wanghao_test

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv = findViewById<TextView>(R.id.tv1)
        val bt1 = findViewById<Button>(R.id.bt1)
        val bt2 = findViewById<Button>(R.id.bt2)
        val bt3 = findViewById<Button>(R.id.bt3)
        val bt4 = findViewById<Button>(R.id.bt4)


        bt1.setOnClickListener {
            val number1 = et1.text.toString().toDouble()
            val number2 = et2.text.toString().toDouble()
            val result_puls = number1 + number2
            tv.text = "${result_puls}"
        }
        bt2.setOnClickListener {
            val number1 = et1.text.toString().toDouble()
            val number2 = et2.text.toString().toDouble()
            val result_minus = number1 - number2
            tv.text = "${result_minus}"
        }
        bt3.setOnClickListener {
            val number1 = et1.text.toString().toDouble()
            val number2 = et2.text.toString().toDouble()
            val result_multiple = number1 * number2
            tv.text = "${result_multiple}"
        }
        bt4.setOnClickListener {
            val number1 = et1.text.toString().toDouble()
            val number2 = et2.text.toString().toDouble()
            val result_divide = number1 / number2
            tv.text = "${result_divide}"
        }
    }
}