package com.jr.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button  btnCalculadoraIMC;
    private Button  btnConversorUnidades;
    private Button  btnCalculadoragGeneral;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnCalculadoraIMC = findViewById(R.id.btnCalcularIMC);
        btnConversorUnidades = findViewById(R.id.btnConversor);
        btnCalculadoragGeneral = findViewById(R.id.btnCalculadora);
        btnCalculadoragGeneral.setOnClickListener(this);
        btnConversorUnidades.setOnClickListener(this);
        btnCalculadoraIMC.setOnClickListener(this);
        txtNombre = findViewById(R.id.txtNombreUsuario);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnCalcularIMC:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("Nombre", txtNombre.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnCalculadora:
                intent = new Intent(this, Calculadora.class);
                intent.putExtra("Nombre", txtNombre.getText().toString());
                startActivity(intent);
                //Toast.makeText(this, "Ingreso Por Medio de La calculadora", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnConversor:
                intent = new Intent(this, Conversor.class);
                intent.putExtra("Nombre Usuario", txtNombre.getText().toString());
                startActivity(intent);
                //Toast.makeText(this, "Ingreso por Medio del Conversor", Toast.LENGTH_LONG).show();
        }
    }
}