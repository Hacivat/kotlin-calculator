package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        var numberOne : Int? = number1.text.toString().toInt()
        var numberTwo : Int? = number2.text.toString().toInt()

        if (numberOne !== null && numberTwo !== null ) {
            var result = (numberOne + numberTwo).toInt().toString()
            textView.text = "Result: $result"
        }
    }

    fun sub(view: View) {
        var numberOne: Int? = number1.text.toString().toInt()
        var numberTwo: Int? = number2.text.toString().toInt()

        if (numberOne !== null && numberTwo !== null) {
            var result = (numberOne - numberTwo).toInt().toString()
            textView.text = "Result: $result"
        }
    }

    fun times(view: View) {
        var numberOne : Int? = number1.text.toString().toInt()
        var numberTwo : Int? = number2.text.toString().toInt()

        if (numberOne !== null && numberTwo !== null ) {
            var result = (numberOne * numberTwo).toInt().toString()
            textView.text = "Result: $result"
        }
    }

    fun div(view: View) {
        var numberOne : Int? = number1.text.toString().toInt()
        var numberTwo : Int? = number2.text.toString().toInt()

        if (numberOne !== null && numberTwo !== null ) {
            var result = (numberOne / numberTwo).toDouble().toString()
            textView.text = "Result: $result"
        }
    }
}