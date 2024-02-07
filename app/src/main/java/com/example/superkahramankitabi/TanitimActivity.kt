package com.example.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superkahramankitabi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val secilenKahraman = intent.getStringExtra("superKahramanIsmi")
        binding.textView.text = secilenKahraman

        val secilenKahramanGorseli = intent.getIntExtra("superKahramanGorseli", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)



    }
}