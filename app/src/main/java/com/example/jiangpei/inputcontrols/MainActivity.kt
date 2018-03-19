package com.example.jiangpei.inputcontrols

import android.app.Activity
import android.content.Context
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.mickey)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        //rounded.isCircular = true
        rounded.cornerRadius = 50f
        imageButton.setImageDrawable(rounded)
    }

    fun onButtonClicked(view: View) {
        when (view.id) {
            R.id.button -> toast("Button Clicked!")
            R.id.button2 -> toast("Icon Button Clicked!")
            R.id.imageButton -> toast("Image Button Clicked!")
            R.id.button3 -> toast("Borderless Button Clicked!")
        }
    }

    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, message, duration).show()
}
