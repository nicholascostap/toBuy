package com.example.tobuy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.tobuy.models.dao.UserDao as UserDao
import com.example.tobuy.models.entities.User


class MainActivity : ComponentActivity() {

    private lateinit var btnSignIn: Button
    private lateinit var btnSignUp: Button
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<TextView>(R.id.password)

        val btnSignIn = findViewById<Button>(R.id.btnSignIn)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)


        btnSignIn.setOnClickListener {
            val userEmail = email.text.toString()
            val userPassword = password.text.toString()

            if (userEmail.isNotEmpty() && userPassword.isNotEmpty()) {
                TODO()
            }
        }

    btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}
