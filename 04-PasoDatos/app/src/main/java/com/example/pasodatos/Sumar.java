package com.example.pasodatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Sumar extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Bundle datos =getIntent().getExtras();

        int num1 = datos.getInt("numero1");
        int num2 = datos.getInt("numero2");
        int resultado = num1+num2;

        TextView valorResultado = (TextView) findViewById(R.id.textResultado);

        valorResultado.setText("El resultado es: " + resultado);
    }


}
