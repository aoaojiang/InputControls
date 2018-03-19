package com.example.textfielddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var names: Array<String> = resources.getStringArray(R.array.names)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names)
        autoCompleteTextView.setAdapter(adapter)

    }
}
