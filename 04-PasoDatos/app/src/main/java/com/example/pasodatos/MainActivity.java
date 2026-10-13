package com.example.pasodatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void aSumar (View view) {

        EditText cuadro1 = (EditText) findViewById(R.id.num1);
        EditText cuadro2 = (EditText) findViewById(R.id.num2);

        int n1 = Integer.parseInt(cuadro1.getText().toString());
        int n2 = Integer.parseInt(cuadro2.getText().toString());



        Intent i = new Intent(this, Sumar.class);

        i.putExtra("numero1",n1);
        i.putExtra("numero2",n2);

        startActivity(i);

    }
}