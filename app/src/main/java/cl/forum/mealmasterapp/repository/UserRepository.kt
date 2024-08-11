package cl.forum.mealmasterapp.repository

import cl.forum.mealmasterapp.model.User

object UserRepository {


    private val users = listOf(
        User("Matias", "Fuentes", "matias.fuentes.vasquez@gmail.com", "1234", 29),
        User("Constanza", "Mundaca", "cmundaca@gmail.com", "admin123", 24),
        User("Catalina", "Arriagada", "carriagada@gmail.com", "password2", 30),
        User("Pedro", "Martinez", "pmartinez@gmail.com", "password3", 28)
    )


    fun validateUser(email: String, password: String): Boolean {
        return users.any { it.getEmail() ==email && it.getPassword() == password }
    }
}