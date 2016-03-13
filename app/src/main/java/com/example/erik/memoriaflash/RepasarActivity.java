package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.erik.memoriaflash.PaginaPrincipalActivity;

import java.io.Serializable;
import java.util.Random;

public class RepasarActivity extends AppCompatActivity {

    public int unidadString = 0;

    public Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se inserta el layout activity_repasar al contenido
        setContentView(R.layout.activity_repasar);
        //Asignar el toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Cambio de color dependiendo de la materia
        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
        }

        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        unidadString = intent.getIntExtra(MenuInicialActivity.EXTRA,0);

//        Random r = new Random();

        Integer index = 1;

        Toast.makeText(this,index.toString(),Toast.LENGTH_SHORT).show();
        mostrarPregunta(MenuInicialActivity.arrayPreguntas[index]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void mostrarSiguiente(View view){


    }
    public void mostrarPregunta(Preguntas pregunta){

        TextView textPregunta = (TextView) findViewById(R.id.tvPregunta);
        TextView textRespuesta = (TextView) findViewById(R.id.tvRespuesta);


        textPregunta.setText(pregunta.getPregunta());
        textRespuesta.setText(pregunta.getRespuesta());

    }

    public void siguientePregunta(Integer index){

    }



}
