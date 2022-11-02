package com.example.app_paseandog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_paseandog.databinding.ActivityRegistroBinding

class Register : AppCompatActivity() {
    private lateinit var binding:ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding.btnInicio.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}