package cl.forum.mealmasterapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import cl.forum.mealmasterapp.R
import cl.forum.mealmasterapp.repository.UserRepository

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        val usernameEditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val loginButton = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener{

            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (UserRepository.validateUser(username, password)) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }

        }






    }
}