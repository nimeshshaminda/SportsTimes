package com.example.sportstimes

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.firstassignment.R
import com.example.firstassignment.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // References to views
        val username: EditText = findViewById(id.userName)
        val password: EditText = findViewById(id.password)
        val signInButton: Button = findViewById(R.id.sign_in_button)
        val googleIcon: ImageView = findViewById(id.iv_google)
        val facebookIcon: ImageView = findViewById(id.iv_facebook)
        val twitterIcon: ImageView = findViewById(id.iv_twitter)

        // Sign-In Button Logic
        signInButton.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            Toast.makeText(this, "Welcome $user!", Toast.LENGTH_SHORT).show()
        }

        // Google Sign-In Click Listener
        googleIcon.setOnClickListener {
            Toast.makeText(this, "Google Sign-In Selected", Toast.LENGTH_SHORT).show()
        }

        // Facebook Sign-In Click Listener
        facebookIcon.setOnClickListener {
            Toast.makeText(this, "Facebook Sign-In Selected", Toast.LENGTH_SHORT).show()
        }

        // Twitter Sign-In Click Listener
        twitterIcon.setOnClickListener {
            Toast.makeText(this, "Twitter Sign-In Selected", Toast.LENGTH_SHORT).show()
        }
    }
}
