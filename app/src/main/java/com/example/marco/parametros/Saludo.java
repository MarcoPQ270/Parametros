package com.example.marco.parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
        private TextView tvsaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        tvsaludo = (TextView)findViewById(R.id.tvsaludo);
        String dato = getIntent().getStringExtra("dato");
        tvsaludo.setText("Hola, "+dato);
    }
    public void regresar(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
