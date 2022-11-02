package com.example.app_paseandog;

import android.content.Intent
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app_paseandog.databinding.ActivityLoginBinding

class LogIn : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnInicio.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding=ActivityLoginBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.btnLogin.setOnClickListener {
            val user=binding.email.text.toString()
            val pass=binding.password.text.toString()

            if(user.isEmpty()&&pass.isEmpty()){
                Toast.makeText(this,"Por favor completar todos los datos",Toast.LENGTH_LONG).show()
                print("Datos inválidos")
            }
            else if(user.toString().length>3){
                println("El usuario debe tener más de 2 caractéres")
            }
            else if (user=="pepe"&&pass=="123"){
                startActivity(Intent(this,Email::class.java))
                println("Correo y contraseña correctos")
            }
            else{
                Toast.makeText(this,"Datos incorrectos",Toast.LENGTH_LONG).show()
            }
        }
    }
}
