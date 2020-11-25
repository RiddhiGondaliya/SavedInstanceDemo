package com.example.savedinstancedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import java.util.stream.DoubleStream.concat

class MainActivity : AppCompatActivity() {


    val KEY_VALUE = "value"
    lateinit var string: String
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.edt_type)
        val text = editText.text.toString()

        if (savedInstanceState != null) {
            string = savedInstanceState.getString(KEY_VALUE, text)
            Log.i("message","data not modified")
        }

        fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
           // var dot :String = "."
           //var mydata : String = data + dot
            outState.putString(KEY_VALUE, string)
            Log.i("message","saved data")


        }
    }
}