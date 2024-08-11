package cl.forum.mealmasterapp.activity

import android.os.Bundle
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

        // Lista de recetas con imágenes placeholder
        val recipes = listOf(
            Recipe("Ensalada de Quinoa", "Una ensalada fresca y nutritiva.", R.drawable.ic_launcher_foreground),
            Recipe("Pechuga de Pollo", "Pollo al horno con hierbas.", R.drawable.ic_launcher_foreground),
            Recipe("Salmón a la Plancha", "Salmón con guarnición de vegetales.", R.drawable.ic_launcher_foreground),
            Recipe("Tacos de Pescado", "Tacos saludables con pescado.", R.drawable.ic_launcher_foreground),
            Recipe("Batido de Frutas", "Batido energético para el desayuno.", R.drawable.ic_launcher_foreground)
        )

        // Configurar la RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recipesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(recipes)
    }
}