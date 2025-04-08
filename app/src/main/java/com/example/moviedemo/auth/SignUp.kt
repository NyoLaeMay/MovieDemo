package com.example.moviedemo.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviedemo.R
import com.example.moviedemo.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        binding.lbLogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        binding.btnSignUp.setOnClickListener{
            var name = binding.etName.text.toString()
            var email = binding.etEmail.text.toString()
            var password = binding.etPassword.text.toString()
            if(TextUtils.isEmpty(name))
            {
                binding.etName.error="Name is required"
                binding.etName.requestFocus()
            }
            else if(TextUtils.isEmpty(email))
            {
                binding.etEmail.error="Email is required"
                binding.etEmail.requestFocus()
            }
            else if(TextUtils.isEmpty(password))
            {
                binding.etPassword.error="Password is required"
                binding.etPassword.requestFocus()
            }
            else
            {
                Log.e("SignUp", "Name: $name, Email: $email, Password: $password")
            }
        }

        setContentView(binding.root)

    }
}