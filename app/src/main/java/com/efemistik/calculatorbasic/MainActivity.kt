package com.efemistik.calculatorbasic

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText
    lateinit var editText2 : EditText
    lateinit var button: Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText2)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        textView = findViewById(R.id.textView)


    }
    var x : Int? = null
    var y : Int? = null
    var result : Int? = null
    fun sumOp(view: View) {
        x = editText.text.toString().toIntOrNull()
        y = editText2.text.toString().toIntOrNull()

        if (x == null || y == null ) {
            textView.text = "Something went wrong."
        }
        else
        {
            result = x!! + y!!
            textView.text = "Result: $result"
        }
    }



    fun mulOp(view: View) {
        x = editText.text.toString().toIntOrNull()
        y = editText2.text.toString().toIntOrNull()

        if (x == null || y == null ) {
            textView.text = "Something went wrong."
        }
        else
        {
            result = x!! * y!!
            textView.text = "Result: $result"
        }

    }

    fun subOp(view: View) {
        x = editText.text.toString().toIntOrNull()
        y = editText2.text.toString().toIntOrNull()

        if (x == null || y == null ) {
            textView.text = "Something went wrong."
        }
        else
        {
            result = x!! - y!!
            textView.text = "Result: $result"
        }

    }
    fun divOp(view: View) {
        x = editText.text.toString().toIntOrNull()
        y = editText2.text.toString().toIntOrNull()

        if (x == null || y == null ) {
            textView.text = "Something went wrong."
        }
        else
        {
            result = x!! / y!!
            textView.text = "Result: $result"
        }

    }

}

