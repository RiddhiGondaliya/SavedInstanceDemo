package com.example.savedinstancedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var string: String
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.edt_type)
        string = editText.toString()

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var dot :String = "."
        var mydata :String = string + dot
        print(mydata)


    }
}