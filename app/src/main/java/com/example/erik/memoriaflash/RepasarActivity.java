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

import java.util.Random;

public class RepasarActivity extends AppCompatActivity {
    public int unidadString = 0;
    public int MAX = 10;
    public Preguntas arrayPreguntas[] = new Preguntas[MAX];

    public Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repasar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        unidadString = intent.getIntExtra(MenuInicialActivity.EXTRA,0);


        if (PaginaPrincipalActivity.botonVitreos.isChecked()) {
            arrayPreguntas[0] = new Preguntas("VitreosPregunta1", "VitreosRespuesta1",1);
            arrayPreguntas[1] = new Preguntas("VitreosPregunta2", "VitreosRespuesta2",1);
            arrayPreguntas[2] = new Preguntas("VitreosPregunta3", "VitreosRespuesta3",2);
            arrayPreguntas[3] = new Preguntas("VitreosPregunta4", "VitreosRespuesta4",2);
            arrayPreguntas[4] = new Preguntas("VitreosPregunta5", "VitreosRespuesta5",3);
            arrayPreguntas[5] = new Preguntas("VitreosPregunta6", "VitreosRespuesta6",3);
            arrayPreguntas[6] = new Preguntas("VitreosPregunta7", "VitreosRespuesta7",4);
            arrayPreguntas[7] = new Preguntas("VitreosPregunta8", "VitreosRespuesta8",4);
            arrayPreguntas[8] = new Preguntas("VitreosPregunta9", "VitreosRespuesta9",5);
            arrayPreguntas[9] = new Preguntas("VitreosPregunta10", "VitreosRespuesta10",5);
            Toast.makeText(this,"Vitreos is checked",Toast.LENGTH_LONG).show();
        }else {
            if (PaginaPrincipalActivity.botonCeramicos.isChecked()) {
                arrayPreguntas[0] = new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1", 1);
                arrayPreguntas[1] = new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2", 1);
                arrayPreguntas[2] = new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3", 2);
                arrayPreguntas[3] = new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4", 2);
                arrayPreguntas[4] = new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5", 3);
                arrayPreguntas[5] = new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6", 3);
                arrayPreguntas[6] = new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7", 4);
                arrayPreguntas[7] = new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8", 4);
                arrayPreguntas[8] = new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9", 5);
                arrayPreguntas[9] = new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10", 5);
                Toast.makeText(this,"Ceramicos is checked",Toast.LENGTH_SHORT).show();
                }
            }

        Random r = new Random();
        Integer index = r.nextInt(arrayPreguntas.length);
        Toast.makeText(this,index.toString(),Toast.LENGTH_LONG).show();
        mostrarPregunta(arrayPreguntas[index]);

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

}
