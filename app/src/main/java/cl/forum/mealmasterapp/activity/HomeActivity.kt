package cl.forum.mealmasterapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.forum.mealmasterapp.R
import cl.forum.mealmasterapp.adapter.RecipeAdapter
import cl.forum.mealmasterapp.model.Recipe

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recipes = listOf(
            Recipe("Ensalada de Quinoa", "Una ensalada fresca y nutritiva con vegetales y semillas.", R.drawable.facebook),
            Recipe("Pechuga de Pollo al Limón", "Pollo al horno con hierbas y limón.", R.drawable.ic_launcher_foreground),
            Recipe("Salmón a la Plancha", "Salmón con guarnición de vegetales y salsa de soja.", R.drawable.ic_launcher_foreground),
            Recipe("Tacos de Pescado", "Tacos saludables con pescado y salsa de aguacate.", R.drawable.ic_launcher_foreground),
            Recipe("Batido de Frutas", "Batido energético para el desayuno con plátano y fresas.", R.drawable.ic_launcher_foreground),
            Recipe("Pizza Margarita", "Pizza clásica con tomate, mozzarella y albahaca fresca.", R.drawable.ic_launcher_foreground),
            Recipe("Pasta Carbonara", "Pasta con salsa cremosa de huevo, queso y panceta.", R.drawable.ic_launcher_foreground),
            Recipe("Hamburguesa Vegetariana", "Hamburguesa hecha con garbanzos y vegetales frescos.", R.drawable.ic_launcher_foreground),
            Recipe("Sopa de Tomate", "Sopa casera de tomate con albahaca y un toque de crema.", R.drawable.ic_launcher_foreground),
            Recipe("Brownies de Chocolate", "Brownies esponjosos con trozos de nuez y chocolate.", R.drawable.ic_launcher_foreground)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recipesRecyclerView)
        val closeButton = findViewById<Button>(R.id.closeButton)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(recipes)


        closeButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}