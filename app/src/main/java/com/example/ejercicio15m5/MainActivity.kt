package com.example.ejercicio15m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio15m5.databinding.ActivityMainBinding

/*pasos para craer recicler view
*[]Adapter+ view holder
* [] item layout
* cambiar altura de constrains layout en item wrapt content
* agregar constrains
* ingresar id
*[] layoaut con recicler view
*[] layout manager
* [] obtener lista de datos
* */

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
    val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.RecyclerView.adapter= adapter

    }
}

