package com.cdp.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtnumero1, txtnumero2;
    private Button btnsuma, btnresta, btnmultiplicacion, btndivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumero1 = (EditText) findViewById(R.id.txtnumero1);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
        btndivision = (Button) findViewById(R.id.btndivision);

    }
    // Partimos de la operacion Suma
    public void Suma(View view)
    {
        String num1 = txtnumero1.getText().toString();
        String num2 = txtnumero2.getText().toString();
        // Iniciamos verificando si tenemos campos vacios
        if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2))
        {
            error("Upps, has dejado campos vacios");
        }else{
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            Operacion(String.valueOf(numero1+numero2));
        }
    }


    // Operacion Resta
    public void Resta(View view)
    {
        String num1 = txtnumero1.getText().toString();
        String num2 = txtnumero2.getText().toString();
        // Iniciamos verificando si tenemos campos vacios
        if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2))
        {
            error("Upps, has dejado campos vacios");
        }else{
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            Operacion(String.valueOf(numero1-numero2));
        }
    }


    // Operacion Multiplicacion
    public void Multiplicacion(View view)
    {
        String num1 = txtnumero1.getText().toString();
        String num2 = txtnumero2.getText().toString();
        // Iniciamos verificando si tenemos campos vacios
        if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2))
        {
            error("Upps, has dejado campos vacios");
        }else{
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            Operacion(String.valueOf(numero1*numero2));
        }
    }

    public void Division(View view)
    {
        String num1 = txtnumero1.getText().toString();
        String num2 = txtnumero2.getText().toString();
        // Iniciamos verificando si tenemos campos vacios
        if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2))
        {
            error("Upps, has dejado campos vacios");
        }else{
            // Convertimos a double debido a que algunos numeros pueden ser punto decimal
            Double numero1 = Double.parseDouble(num1);
            Double numero2 = Double.parseDouble(num2);
            // Evaluamos si el numero es igual a 0 (cero)
            if (numero2 == 0)
            {
                error("El valor 2 debe de ser distinto de cero (0)");
            }else {
                Operacion(String.valueOf(numero1/numero2));
            }
        }

    }

    // Metodo de Error
    private void error(String error)
    {
        Intent resultado = new Intent(getApplicationContext(), MainActivity3.class);
        resultado.putExtra("Error", error);
        startActivity(resultado);
    }

    // Metodo de operacion
    private  void Operacion(String resu)
    {
        Intent resultado = new Intent(getApplicationContext(), MainResultado.class);
        resultado.putExtra("Resultado", resu);
        startActivity(resultado);
    }
}