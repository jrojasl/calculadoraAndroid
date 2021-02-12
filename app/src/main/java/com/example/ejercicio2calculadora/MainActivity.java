package com.example.ejercicio2calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero1;
    private EditText etNumero2;
    private TextView tvResultado;

    private Double numero1;
    private Double numero2;
    private Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casteo();
    }

    private void casteo(){
        etNumero1 = (EditText) findViewById(R.id.etNumero1);
        etNumero2 = (EditText) findViewById(R.id.etNumero2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void asignarNumeros(){
        numero1 = Double.parseDouble(etNumero1.getText().toString());
        numero2 = Double.parseDouble(etNumero2.getText().toString());
    }

    public boolean validarCampos(){
        if( etNumero1.getText().toString().isEmpty() || etNumero2.getText().toString().isEmpty() ){
            return false;
        }

        return true;

    }

    public void sumar(View view){
        boolean camposValidados = validarCampos();
        if(camposValidados == false){
            tvResultado.setText("Todos los campos son requeridos");
            return;
        }

        asignarNumeros();
        resultado = numero1 + numero2;
        tvResultado.setText("El resultado de la suma es " + resultado);

    }

    public void restar(View view){

        boolean camposValidados = validarCampos();
        if(camposValidados == false){
            tvResultado.setText("Todos los campos son requeridos");
            return;
        }
        asignarNumeros();
        resultado = numero1 - numero2;
        tvResultado.setText("El resultado de la resta es " + resultado);

    }

    public void multiplicar(View view){

        boolean camposValidados = validarCampos();
        if(camposValidados == false){
            tvResultado.setText("Todos los campos son requeridos");
            return;
        }
        asignarNumeros();
        resultado = numero1 * numero2;
        tvResultado.setText("El resultado de la multiplicación es " + resultado);

    }

    public void dividir(View view){

        boolean camposValidados = validarCampos();
        if(camposValidados == false){
            tvResultado.setText("Todos los campos son requeridos");
            return;
        }

        asignarNumeros();
        if(numero2 == 0){
            tvResultado.setText("No se puede dividir sobre cero");
            return;
        }
        resultado = numero1 / numero2;
        tvResultado.setText("El resultado de la división es " + resultado);

    }



}