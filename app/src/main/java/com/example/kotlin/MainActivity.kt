package com.example.kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deltaRelative.setBackgroundColor(Color.GREEN)
        imageView.setImageResource(R.drawable.caphesua)


       button.setOnClickListener {
           var so1: Int = (sothu1.text.toString()).toInt()
           var so2: Int = (sothu2.text.toString()).toInt()
           var ketqua: Int = so1 + so2
           textView.text = ketqua.toString()


       }

//        button.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(v: View?) {
//
//            }
//
//        })


    }
}