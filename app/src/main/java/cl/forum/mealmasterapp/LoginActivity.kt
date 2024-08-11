package cl.forum.mealmasterapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        val userNametext: EditText = findViewById(R.id.editTextTextPersonName)
        val passwordtext: EditText = findViewById(R.id.editTextTextPassword)

        val loginButton: Button = findViewById(R.id.button)

        loginButton.setOnClickListener{

            val user = userNametext.text.toString()
            val pass = passwordtext.text.toString()


            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)

        }



    }
}