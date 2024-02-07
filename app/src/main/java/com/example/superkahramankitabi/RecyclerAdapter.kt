package com.example.superkahramankitabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.superkahramankitabi.databinding.RecyclerRowBinding

class RecyclerAdapter(val kahramanListesi: ArrayList<String>, val kahramanGorselleri:ArrayList<Int>):RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperKahramanVH(binding)
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.binding.recyclerViewTextView.text = kahramanListesi.get(position)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }


}