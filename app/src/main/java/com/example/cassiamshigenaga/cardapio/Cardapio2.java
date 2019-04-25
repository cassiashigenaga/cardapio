package com.example.cassiamshigenaga.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cassiamshigenaga.cardapio.modelos.Produto;

import java.util.ArrayList;


public class Cardapio2 extends AppCompatActivity {

    public ArrayList<Produto> produtos = new ArrayList<>();
    public LinearLayout layoutlinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio2);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        textViewTitulo.setText(titulo);


        if (titulo.equals("Berinjela")) {
            produtos.add(new Produto("Antepasto", 12.99, "Berinjela", "Berinjela, pimentão, arroz"));
            produtos.add(new Produto("Parmegiana", 17.99, "Berinjela", "Berinjela, pimentão, arroz"));
            produtos.add(new Produto("Recheada", 14.99, "Berinjela", "Berinjela, pimentão, carne moída"));
        }

        else if (titulo.equals("Hamburguer")) {
            produtos.add(new Produto("X-Salada", 20.99, "Hamburguer", "Hamburguer, queijo, alface, tomate"));
            produtos.add(new Produto("X-Tudo", 27.99, "Hamburguer", " Dois hamburguers, queijo, tomate, molho, ovo"));
            produtos.add(new Produto("Cheddar", 19.99, "Hamburguer", " Hamburguer, queijo cheddar, tomate, molho "));
        }

        else if (titulo.equals("Drinks")) {
            produtos.add(new Produto("Refrigerante", 4.99, "Drinks", "Coca-Cola, Guaraná, Sprite, Fanta"));
            produtos.add(new Produto("Suco", 3.99, "Drinks", "Suco natural: Uva, limão, laranja"));
            produtos.add(new Produto("Água", 2.99, "Drinks", "Garrafa"));
        }

        else if (titulo.equals("Doces")) {
            produtos.add(new Produto("Brigadeiro", 3.99, "Doces", "Brigadeiro de colher"));
            produtos.add(new Produto("Pão de mel", 4.99, "Doces", "Pão de mel caseiro"));
            produtos.add(new Produto("Sorvete", 5.99, "Doces", "Picolé: Magnum, Kibom, Beijo"));
        }

        listaProdutos(produtos);

    }

    //Método onCreate

    public void listaProdutos(ArrayList<Produto> lista) {

        layoutlinear = findViewById(R.id.lVertical);

        for (int i=0; i<lista.size(); i++) {

            TextView textViewItem1 = new TextView(this);
            TextView textViewDesc1 = new TextView(this);
            TextView textViewPreco1 = new TextView(this);

            textViewItem1.setText(lista.get(i).getNome());
            textViewItem1.setTextSize(18);
            textViewDesc1.setText(lista.get(i).getDescricao());
            textViewPreco1.setText("R$" + lista.get(i).getPreco().toString());

            layoutlinear.addView(textViewItem1);
            layoutlinear.addView(textViewDesc1);
            layoutlinear.addView(textViewPreco1);

        }

    }//Método listaProdutos

}//Lista da Classe

