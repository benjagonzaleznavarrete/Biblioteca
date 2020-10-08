package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libros;

public class github_act extends AppCompatActivity {

    private Spinner sp1;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        sp1=(Spinner)findViewById(R.id.spinner);
        tv=(TextView) findViewById(R.id.mensaje);

        ArrayList<String> listalibros=(ArrayList<String>)getIntent().getSerializableExtra("listalibros");
        ArrayAdapter adapt =new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listalibros);

        sp1.setAdapter(adapt);

    }

    public void mostrar(View view)
    {
        Libros libros = new Libros();
        String libro= sp1.getSelectedItem().toString();

        int farenheit= Integer.parseInt(libros.getFarenheit());
        int revival= Integer.parseInt(libros.getRevival());
        int elalquimista= Integer.parseInt(libros.getElalquimista());


        if(libro.equals("farenheit"))
        {
            tv.setText("El valor de Farenheit es: "+farenheit);
        }
        else if(libro.equals("revival"))
        {
            tv.setText("El valor de revival es: "+revival);
        }
        else
        {
            tv.setText("El valor de alquimista es: "+elalquimista);
        }

    }
}