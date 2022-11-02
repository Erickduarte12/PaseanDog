package com.example.app_paseandog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_paseandog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Apppaseandog)
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this,LogIn::class.java))
            Toast.makeText(this,"Clic en el botón Ingresar",Toast.LENGTH_LONG).show()
        }

        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
        }
    }
}