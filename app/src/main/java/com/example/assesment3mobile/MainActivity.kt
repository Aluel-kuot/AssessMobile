package com.example.assesment3mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assesment3mobile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogIn.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }
        validate()
    }


    fun validate() {
        val name = binding.etUserName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()


        var error = false

        if (name.isBlank()) {
            binding.tilUserName.error = "name is required"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = "phoneNumber is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "email is required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "password is required"
            error = true
        }


    }

    fun clearErrors() {
        binding.tilUserName.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmail.error = null

    }
}

