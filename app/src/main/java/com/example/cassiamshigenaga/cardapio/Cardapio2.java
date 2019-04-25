package com.example.cassiamshigenaga.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cassiamshigenaga.cardapio.modelos.Produto;


public class Cardapio2 extends AppCompatActivity {

    public Produto produto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio2);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        textViewTitulo.setText(titulo);

        TextView textViewItem1 = findViewById(R.id.tvItem1);
        TextView textViewDesc1 = findViewById(R.id.tvDesc1);
        TextView textViewPreco1 = findViewById(R.id.tvPreco1);

        if (titulo.equals("Beringela")){
            produto1 = new Produto("Antepasto", 12.99, "Berinjela", "Berinjela, pimentão, arroz");
            textViewItem1.setText(produto1.getNome());
            textViewDesc1.setText(produto1.getDescricao());
            textViewPreco1.setText("R$" + produto1.getPreco().toString());

        }

        else if (titulo.equals("Hamburguer")){
            textViewItem1.setText("X-Salada");
        }

    }
}

