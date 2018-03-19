package com.example.spinnerdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weekdays: Array<String> = resources.getStringArray(R.array.weekdays)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, weekdays)
        spinner2.adapter = adapter

        spinner.onItemSelectedListener = listener
        spinner2.onItemSelectedListener = listener
    }


    val listener: AdapterView.OnItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {
        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val msg = (parent as Spinner).selectedItem.toString()
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show();
        }

    }
}
