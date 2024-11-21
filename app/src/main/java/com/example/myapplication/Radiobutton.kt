package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Radiobutton : AppCompatActivity() {
    lateinit var radiodownload : RadioButton
    lateinit var radioMango : RadioButton
    lateinit var radioGrape : RadioButton
    lateinit var imageViewRadio : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radiobutton)
        radiodownload = findViewById(R.id.btndownload)
        radioMango = findViewById(R.id.btnrose)
        radioGrape = findViewById(R.id.btntillip)
        imageViewRadio = findViewById(R.id.imageView2)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}