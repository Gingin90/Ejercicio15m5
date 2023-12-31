package com.example.ejercicio15m5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ejercicio15m5.databinding.ItemBinding

/* definiendo clase adapter
*hereda la clase recycler view
* creacion de metodos
* crear clase anidada view holder hereda de la clase view holder
* crear costructor
* crear lista
* **/

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
   var pokemones = mutableListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val binding= ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
   return ViewHolder (binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
    this.pokemones = pokedex.toMutableList()
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
        binding.nombrePokemon.text= pokemon.nombre
            binding.tipoPokemon.text= pokemon.tipo
            binding.imageViewPok.load(pokemon.imgUrl)
        }

    }
}



