package com.example.practica07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        texto = (TextView) findViewById(R.id.texto);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null){
            String dato = extras.getString("MENSAJE");
            texto.setText(dato);
        }
    }
}