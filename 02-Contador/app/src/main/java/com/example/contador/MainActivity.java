package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    public int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }

    public void incrementaContador(View vista){
        contador++;
        mostrarContador();
    }

    public void decrementaContador(View vista) {
        contador--;
        mostrarContador();
    }

    public void resetearContador(View vista){
        contador = 0;
        mostrarContador();
    }

    public void mostrarContador(){
        TextView textoResultado = (TextView) findViewById(R.id.numContador);
        textoResultado.setText("" + contador);
    }
}