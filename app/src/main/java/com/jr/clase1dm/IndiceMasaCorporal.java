package com.jr.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IndiceMasaCorporal extends AppCompatActivity implements View.OnClickListener {

    ImageView ImagenEstado;
    EditText txtAltura;
    EditText txtPeso;
    Button btnCalcularIMC;
    TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indice_masa_corporal);
        ImagenEstado = findViewById(R.id.imageView);
        txtPeso = findViewById(R.id.editTextPeso);
        txtAltura = findViewById(R.id.editTextAltura);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcularIMC = findViewById(R.id.btnCalcularIMC);
        btnCalcularIMC.setOnClickListener(this);
        txtPeso.setOnClickListener(this);
        txtAltura.setOnClickListener(this);

    }

    public Double calcularImc(double peso, double altura){
        double imc = 0;
        imc = peso / (altura*altura);
        return imc;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcularIMC:{
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = calcularImc(peso, altura);
                Toast.makeText(this, "Su IMC es: "+ imc, Toast.LENGTH_LONG).show();
                txtResultado.setText("Su IMC es: "+ imc);

            }
        }

    }
}