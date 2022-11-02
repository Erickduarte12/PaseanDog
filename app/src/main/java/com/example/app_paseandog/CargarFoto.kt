package com.example.app_paseandog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.app_paseandog.databinding.ActivityCargarFotoBinding

class CargarFoto : AppCompatActivity() {
    private lateinit var binding: ActivityCargarFotoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCargarFotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImagen.setOnClickListener {

        }
    }

    val abrirCamara =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
            }
        }
}