package com.jorge.mycalcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText base, altura;

    TextView resultado;

    Button calculo;

    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = findViewById(R.id.sideOne);
        altura = findViewById(R.id.sideTwo);
        resultado = findViewById(R.id.resultado);
        calculo = findViewById(R.id.calcular);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valueOne = Float.parseFloat(base.getText().toString());
                float valueTow = Float.parseFloat(altura.getText().toString());
                result = ((valueOne*valueTow)/2);
                resultado.setText("el resultado es:"+String.valueOf(result));
            }
        });
    }
}