package com.example.app_paseandog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_paseandog.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding=ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFoto.setOnClickListener {
            startActivity(Intent(this,CargarFoto::class.java))
        }

        binding.btnInicio.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}