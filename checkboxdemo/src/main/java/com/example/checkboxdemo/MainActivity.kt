package com.example.checkboxdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCheckboxClicked(view: View) {
        when (view.id) {
            R.id.checkBox -> if ((view as CheckBox).isChecked) Toast.makeText(this, "闹钟开启", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "闹钟关闭", Toast.LENGTH_SHORT).show()
            R.id.checkBox2 -> if ((view as CheckBox).isChecked) Toast.makeText(this, "吃饭", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "不吃饭", Toast.LENGTH_SHORT).show()
        }
    }

    fun onRadioClicked(view: View) {

        when (view.id) {
            R.id.radioButton2 -> if ((view as RadioButton).isChecked) Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show()
            R.id.radioButton3 -> if ((view as RadioButton).isChecked) Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show()
        }
    }

    fun onSwitchClicked(view: View) {
        when (view.id) {
            R.id.toggleButton -> if ((view as ToggleButton).isChecked) Toast.makeText(this, "门打开", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "门关闭", Toast.LENGTH_SHORT).show()
            R.id.switch1 -> if ((view as Switch).isChecked) Toast.makeText(this, "门打开", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "门关闭", Toast.LENGTH_SHORT).show()
        }
    }
}
