package com.jr.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private Button btnSuma;
    private Button btnResta;
    private Button btnDivision;
    private Button btnMultiplicacion;

    private TextView txtRespuesta;

    private EditText editTextNumero1;
    private EditText editTextNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        txtRespuesta = findViewById(R.id.txtRespuesta);
        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);



        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               txtRespuesta.setText(suma(Integer.parseInt(editTextNumero1.getText().toString()),Integer.parseInt(editTextNumero2.getText().toString())) +"");
            }
        });
        btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRespuesta.setText(resta(Integer.parseInt(editTextNumero1.getText().toString()),Integer.parseInt(editTextNumero2.getText().toString())) +"");
            }
        });
        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRespuesta.setText(division(Integer.parseInt(editTextNumero1.getText().toString()),Integer.parseInt(editTextNumero2.getText().toString())) +"");
            }
        });
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRespuesta.setText(multiplicacion(Integer.parseInt(editTextNumero1.getText().toString()),Integer.parseInt(editTextNumero2.getText().toString())) +"");
            }
        });



    }

    public  double suma( int a, int b ){

        return  a+b;

    }

    public  double resta( int a, int b ){

        return  a-b;

    }

    public  double division( int a, int b ){
        int respuesta = 0;

        if(b != 0){
            respuesta = a/b;
        }
        return respuesta;

    }

    public  double multiplicacion( int a, int b ){

        return  a*b;

    }
}