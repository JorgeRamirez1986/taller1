package com.jr.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Conversor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);


        Button btnMillas = findViewById(R.id.btnMillas);
        Button btnKilometros = findViewById(R.id.btnKilometros);
        EditText editTextKilometros = (EditText) findViewById(R.id.editTextKilometros);
        EditText editTextMillas = (EditText) findViewById(R.id.editTextMillas);


        btnMillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skm = editTextKilometros.getText().toString();
                float km = Float.parseFloat(skm);
                float millas = km / 1.609f;
                String smillas =String.format("%f", millas);
                editTextMillas.setText(smillas);

            }
        });
        btnKilometros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smillas = editTextMillas.getText().toString();
                float millas = Float.parseFloat(smillas);
                float km = millas * 1.609f;
                String skm =String.format("%f", km);
                editTextKilometros.setText(skm);

            }
        });
    }
}