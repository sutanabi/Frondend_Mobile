package com.example.project_eventvox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newList: ArrayList<News>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.my_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newList[position]
        holder.title_image.setImageResource(currentItem.title_image)
        holder.judul.text = currentItem.judul
        holder.keterangan.text = currentItem.keterangan
        holder.tanggal.text = currentItem.tanggal
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title_image : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val judul : TextView = itemView.findViewById(R.id.judul)
        val keterangan : TextView = itemView.findViewById(R.id.keterangan)
        val tanggal : TextView = itemView.findViewById(R.id.tanggal)

    }


}