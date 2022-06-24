package com.example.verlive.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.verlive.R
import com.example.verlive.model.plantas
import com.squareup.picasso.Picasso

class adapter_planta(
    val PlantaListener:PlantaListener,
    Planta:MutableList<plantas>,
    resource:Int,
    context: Context?
):
    RecyclerView.Adapter<adapter_planta.ViewHolder>(){

    private val planta:MutableList<plantas>
    private val resource:Int
    private val context: Context?

    init {
        this.planta = Planta
        this.resource = resource
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(resource, parent,false)
        return ViewHolder(view)
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgplanta: ImageView
        val nombrePlanta: TextView
        init {
            imgplanta = itemView.findViewById(R.id.imgPlanta)
            nombrePlanta = itemView.findViewById(R.id.tvNombrePlanta)
        }
    }

    override fun onBindViewHolder(Holder: ViewHolder, position: Int) {

        val Planta:plantas = planta[position]
        Picasso.get().load(Planta.UrlPlanta).into(Holder.imgplanta)
        Holder.nombrePlanta.text = Planta.nombrePlantas
        Holder.imgplanta.setOnClickListener{
            PlantaListener.OnPlantaClicked(Planta,position)
        }
    }

    override fun getItemCount():Int{
        return planta.size
    }
}