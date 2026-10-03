package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    public int contador;
    TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        textoResultado = findViewById(R.id.numContador);
        eventoTeclado teclado = new eventoTeclado();
        EditText numReseteo = (EditText) findViewById(R.id.numReseteo);
        numReseteo.setOnEditorActionListener(teclado);
    }

    class eventoTeclado implements TextView.OnEditorActionListener{

        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if(actionId== EditorInfo.IME_ACTION_DONE){
                resetearContador(null);
            }

            return false;
        }
    }

    public void incrementaContador(View vista){
        contador++;
        textoResultado.setText("" + contador);
    }

    public void decrementaContador(View vista) {
        contador--;
        if (contador<0){
            CheckBox negativos=(CheckBox) findViewById(R.id.negativos);

            if (!negativos.isChecked()){
                contador = 0;
            }

        }
        textoResultado.setText("" + contador);
    }

    public void resetearContador(View vista){
        //contador = 0;
        EditText numReset = (EditText) findViewById(R.id.numReseteo);
        try{
            contador=Integer.parseInt(numReset.getText().toString());
        } catch(Exception e){
            contador = 0;
        }

        numReset.setText("");
        textoResultado.setText("" + contador);
        InputMethodManager miTeclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miTeclado.hideSoftInputFromWindow(numReset.getWindowToken(), 0);
    }



/*    public void mostrarContador(){
        TextView textoResultado = (TextView) findViewById(R.id.numContador);
        textoResultado.setText("" + contador);
    }*/
}