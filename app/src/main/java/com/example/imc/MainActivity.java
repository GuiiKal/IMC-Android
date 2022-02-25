package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText)findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText)findViewById(R.id.txtAltura);

        double peso = Double.parseDouble(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());

        double resultado = peso / (altura * altura);
        if(resultado < 18.5){
            lblResultado.setText("Abaixo do peso!");
        }
        else if(resultado > 18.5 && resultado < 24.4){
            lblResultado.setText("Peso ideal, parabéns!");
        }
        else if(resultado < 24.5 && resultado < 29.9){
            lblResultado.setText("Pré obesidade, cuidado!");
        }
        else if(resultado < 30 && resultado < 34.9){
            lblResultado.setText("Obesidade classe I, cuidado!");
        }
        else if(resultado < 35 && resultado < 39.9){
            lblResultado.setText("Obesidade classe II, cuidado!");
        }
        else{
            lblResultado.setText("Obesidade classe III, muito cuidado!");
        }
    }
}