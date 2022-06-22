package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.toolbarCadastro))
        setTitle("Cadastro")

        findViewById<Button>(R.id.buttonCadastrar).setOnClickListener {
            IrParaLogin()
            Toast.makeText(this,"Usuário cadastrado com sucesso!", Toast.LENGTH_LONG)
                .show()
        }
        findViewById<Button>(R.id.buttonCancelar).setOnClickListener {
            this.finish()
        }
    }
    fun IrParaLogin(){
        val login = Intent(this, LoginActivity::class.java)
        startActivity(login)
    }
}