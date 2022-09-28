package com.example.login

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val confirm = findViewById<EditText>(R.id.confirmPassword)
        val login = findViewById<Button>(R.id.login)
        val message = findViewById<TextView>(R.id.message)
        message.text = ""

//        var usernamesAndPasswords = mutableListOf<mutableListOf<String>().isEmpty()



        fun isEmailValid(email: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        login.setOnClickListener {
            if (isEmailValid(email.getText().toString())) {
                if (password.getText().toString() == confirm.getText().toString() ) {
                    if (password.getText().toString() != ""){
                        message.text = "Welcome"
                        message.setTextColor(Color.GREEN)
                    }
                    else{
                        message.text = "Enter a password"
                        message.setTextColor(Color.RED)
                    }
                }
                else{
                    message.text = "Passwords are not the same"
                    message.setTextColor(Color.RED)
                }
            } else {
                message.text = "Email is not valid"
                message.setTextColor(Color.RED)
            }
        }
    }
}