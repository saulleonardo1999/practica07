package com.example.practica07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.boton) {
            String dato = editText.getText().toString();
            Intent next = new Intent(MainActivity.this, SecondActivity.class);
            next.putExtra("MENSAJE", dato);
            startActivity(next);
        }
    }
}