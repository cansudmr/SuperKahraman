package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superkahramankitabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)






        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")


/*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
*/


        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)




        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)
        binding.recyclerView.adapter = adapter





    }

}