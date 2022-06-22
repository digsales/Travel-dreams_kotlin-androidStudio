package com.example.pratica4

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.toolbarListagem))
        setTitle("Travel Dreams")

        val listView = findViewById<ListView>(R.id.recipe_list_view)
        val names = arrayOf( "Aracaju", "Bangkok", "Dubai", "Fortaleza", "Foz do Iguaçu", "Hong Kong", "Jalapão", "Lençois Maranhenses", "Londres", "Maceió", "Natal", "Nova York", "Paris", "Porto de Galinhas", "Rio de Janeiro", "Roma","Salvador")
        val ufs = arrayOf("Sergipe, Brasil", "Tailândia", "Emirados Árabes", "Ceará, Brasil", "Paraná, Brasil", "China", "Tocantis, Brasil", "Maranhão, Brasil", "Reino Unido", "Alagoas, Brasil", "Rio Grande do Norte, Brasil", "Estados Unidos da América (EUA)", "França", "Pernambuco, Brasil", "Rio de Janeiro, Brasil", "Itália", "Bahia, Brasil")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        listView.adapter= arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"Cidade: "+ names[i]+ "\nLocal: " + ufs[i], Toast.LENGTH_LONG)
                .show()
        }
    }
}
