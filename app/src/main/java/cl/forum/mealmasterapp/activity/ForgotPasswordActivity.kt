package cl.forum.mealmasterapp.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import cl.forum.mealmasterapp.R

class ForgotPasswordActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val submitButton = findViewById<Button>(R.id.submitButton)

        emailEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val emailInput = emailEditText.text.toString().trim()
                submitButton.isEnabled = emailInput.isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        submitButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            Toast.makeText(this, "Solicitud de recuperación enviada a $email", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}