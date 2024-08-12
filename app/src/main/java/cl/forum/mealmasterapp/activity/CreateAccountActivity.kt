package cl.forum.mealmasterapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import cl.forum.mealmasterapp.R
import cl.forum.mealmasterapp.model.User
import cl.forum.mealmasterapp.repository.UserRepository

class CreateAccountActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val firstNameInput = findViewById<EditText>(R.id.firstNameInput)
        val lastNameInput = findViewById<EditText>(R.id.lastNameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)

        createAccountButton.setOnClickListener {
            val user = User(
                firstName = firstNameInput.text.toString(),
                lastName = lastNameInput.text.toString(),
                email = emailInput.text.toString(),
                password = passwordInput.text.toString(),
                age = ageInput.text.toString().toInt()
            )

            UserRepository.createUser(user)
            Toast.makeText(this, "Usuario creado correctamente", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}