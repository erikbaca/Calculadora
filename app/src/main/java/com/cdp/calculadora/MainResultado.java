package com.cdp.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainResultado extends AppCompatActivity {
    private EditText txtresultado;
    private Button btnvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);

        txtresultado = (EditText) findViewById(R.id.txtresultado);
        btnvolver = (Button) findViewById(R.id.btnvolver);
        Bundle bundle=getIntent().getExtras();
        txtresultado.setText(bundle.getString("Resultado"));
    }

    //Boton volver para retornar al activity principal
    public void Volver(View view)
    {
        Intent calculadora = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(calculadora);
    }

}