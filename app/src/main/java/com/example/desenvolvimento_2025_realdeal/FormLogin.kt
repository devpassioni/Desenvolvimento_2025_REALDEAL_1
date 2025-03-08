package com.example.desenvolvimento_2025_realdeal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView  // Importando TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

public class FormLogin : AppCompatActivity() {

    private lateinit var botao_cadastro_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
        iniciar_componentes()
        supportActionBar?.hide()

    }
        private fun iniciar_componentes() {
            botao_cadastro_login = findViewById(R.id.botao_cadastro_login)

            botao_cadastro_login.setOnClickListener {
                // Cria o Intent para abrir a Activity de cadastro
                val intent = Intent(this, FormCadastro::class.java)
                startActivity(intent)
            }
        }

}



