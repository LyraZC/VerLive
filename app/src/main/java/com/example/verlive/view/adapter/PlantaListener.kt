package com.example.verlive.view.adapter

import com.example.verlive.model.plantas

interface PlantaListener {
    fun OnPlantaClicked(Planta: plantas, position: Int)
}