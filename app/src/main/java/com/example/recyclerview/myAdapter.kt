package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class myAdapter(var context : Activity, var newsArrayList : ArrayList<News>) :
RecyclerView.Adapter<myAdapter.MyViewHolder>(){
//to create a new view instance
    //when lauout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
            return newsArrayList.size
    }

    //populate items with data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsArrayList[position]
        holder.hTitle.text= currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImage)
    }

    //it holds the view so views are not created everytime ,so memory can be saved
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val hTitle = itemView.findViewById<TextView>(R.id.headingTitle)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)


    }

}