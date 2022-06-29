package com.example.verlive.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.verlive.R
import com.example.verlive.model.plantas
import com.example.verlive.view.adapter.PlantaListener
import com.example.verlive.view.adapter.adapter_planta


class Fragment_plantas : Fragment(), PlantaListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_plantas, container, false)

        val reciclerplanta = view.findViewById<View>(R.id.rv_plantas) as RecyclerView
        val linearmanager = LinearLayoutManager(context)
        linearmanager.orientation = LinearLayoutManager.VERTICAL
        reciclerplanta.layoutManager = linearmanager

        val adapter = adapter_planta(this, GetPlanta(), R.layout.item_plantas, context)
        reciclerplanta.adapter = adapter
        return view
    }

    override fun OnPlantaClicked(Planta: plantas, position: Int) {
        NavHostFragment.findNavController(this).navigate(R.id.nfragment_plantasDet)
    }

    private fun GetPlanta(): MutableList<plantas>{
        var plantaList : MutableList<plantas> = ArrayList()
        plantaList.add(plantas("Mango","https://static.vecteezy.com/system/resources/previews/005/610/549/non_2x/fresh-mango-fruit-cartoon-illustration-vector.jpg"))
        plantaList.add(plantas("Limon","https://cdn5.dibujos.net/dibujos/pintados/201245/limon-ii-comida-frutas-pintado-por-vanesssssa-9780534.jpg"))
        plantaList.add(plantas("Tomate","https://static.vecteezy.com/system/resources/previews/003/111/598/non_2x/fresh-tomato-fruit-drawing-free-vector.jpg"))
        plantaList.add(plantas("Chile","https://www.bioenciclopedia.com/wp-content/uploads/2016/07/chile.jpg"))
        return plantaList
    }
}