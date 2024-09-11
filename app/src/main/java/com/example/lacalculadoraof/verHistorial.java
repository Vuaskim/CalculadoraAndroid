package com.example.lacalculadoraof;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class verHistorial extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_historial);

        ListView listView = findViewById(R.id.verHistorial);
        Button btnVolver = findViewById(R.id.btnAtras);

        ArrayList<String> historial = getIntent().getStringArrayListExtra("historial");

        if (historial != null) {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historial);
            listView.setAdapter(adapter);
        } else {
            Toast.makeText(this, "realiza primero un calculo por favor", Toast.LENGTH_SHORT).show();
        }

        btnVolver.setOnClickListener(v -> finish());
    }
}
