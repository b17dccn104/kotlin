package com.example.kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val c = 0
    private val b =1
    private val a = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deltaRelative.setBackgroundColor(Color.GREEN)
        imageView.setImageResource(R.drawable.caphesua)




//        button.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(v: View?) {
//
//            }
//
//        })


    }
}