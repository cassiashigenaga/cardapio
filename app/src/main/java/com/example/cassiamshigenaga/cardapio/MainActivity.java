package com.example.cassiamshigenaga.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public String tituloDaActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoHamburguer(View view) {
        tituloDaActivity = "Hamburguer";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void botaoPratosQuentes(View view) {
        tituloDaActivity = "Berinjela";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void botaoBebidas(View view) {
        tituloDaActivity = "Drinks";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void botaoDoces(View view) {
        tituloDaActivity = "Doces";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
}