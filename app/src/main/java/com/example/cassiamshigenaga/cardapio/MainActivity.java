package com.example.cassiamshigenaga.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "cam.example.cardapio.MENSAGEMTITULO";
    public static final String ITEM1 = "cam.example.cardapio.MENSAGEMITEM1";
    public static final String ITEM2 = "cam.example.cardapio.MENSAGEMITEM2";
    public String tituloDaActivity;
    public String textoItem1;
    public String textoItem2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoHamburguer(View view) {
        tituloDaActivity = "Hamburguer";
        textoItem1 = "X-Salada";
        textoItem2 = "X-Bacon";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(textoItem1, tituloDaActivity);
        intent.putExtra(textoItem2, tituloDaActivity);

        startActivity(intent);
    }

    public void botaoPratosQuentes(View view) {
        tituloDaActivity = "Beringela";
        textoItem1 = "Sopa";
        textoItem2 = "Arroz";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(textoItem1, tituloDaActivity);
        intent.putExtra(textoItem2, tituloDaActivity);
        startActivity(intent);
    }

    public void botaoBebidas(View view) {
        tituloDaActivity = "Drinks";
        textoItem1 = "Cerveja";
        textoItem2 = "Caipirinha";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(textoItem1, tituloDaActivity);
        intent.putExtra(textoItem2, tituloDaActivity);
        startActivity(intent);
    }

    public void botaoDoces(View view) {
        tituloDaActivity = "Doces";
        textoItem1 = "Brigadeiro";
        textoItem2 = "Bolo";
        Intent intent = new Intent(this, Cardapio2.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(textoItem1, tituloDaActivity);
        intent.putExtra(textoItem2, tituloDaActivity);
        startActivity(intent);
    }
}