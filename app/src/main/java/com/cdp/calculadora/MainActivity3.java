package com.cdp.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView txError;
    private Button btnvolver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txError = (TextView) findViewById(R.id.txError);
        btnvolver2 = (Button) findViewById(R.id.btnvolver2);

        // Utilizamos bundle para enviar objetos  entre actividades.
        Bundle bundle = getIntent().getExtras();
        txError.setText(bundle.getString("Error"));
    }

    public void Volver(View view)
    {
        Intent calculadora = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(calculadora);
    }
}