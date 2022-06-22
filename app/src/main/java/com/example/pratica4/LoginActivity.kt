package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        findViewById<Button>(R.id.buttonEntrar).setOnClickListener {
            IrParaLista()
        }
        findViewById<TextView>(R.id.textViewCadastrese).setOnClickListener {
            IrParaCadastro()
        }
    }
    fun IrParaLista(){
        val listagem = Intent(this, ListaActivity::class.java)
        startActivity(listagem)
    }
    fun IrParaCadastro(){
        val cadastro = Intent(this, CadastroActivity::class.java)
        startActivity(cadastro)
    }
}