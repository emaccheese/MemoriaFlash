package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.erik.memoriaflash.PaginaPrincipalActivity;

public class RepasarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repasar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        if (PaginaPrincipalActivity.botonVitreos.isChecked()) {
            Preguntas lasPreguntas[] = {
                    new Preguntas("VitreosPregunta1", "VitreosRespuesta1",1), new Preguntas("VitreosPregunta2", "VitreosRespuesta2",1),
                    new Preguntas("VitreosPregunta3", "VitreosRespuesta3",2), new Preguntas("VitreosPregunta4", "VitreosRespuesta4",2),
                    new Preguntas("VitreosPregunta5", "VitreosRespuesta5",3), new Preguntas("VitreosPregunta6", "VitreosRespuesta6",3),
                    new Preguntas("VitreosPregunta7", "VitreosRespuesta7",4), new Preguntas("VitreosPregunta8", "VitreosRespuesta8",4),
                    new Preguntas("VitreosPregunta9", "VitreosRespuesta9",5), new Preguntas("VitreosPregunta10", "VitreosRespuesta10",5)};
        }else{
            if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
                Preguntas lasPreguntas[] = {
                        new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1",1), new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2",1),
                        new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3",2), new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4",2),
                        new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5",3), new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6",3),
                        new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7",4), new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8",4),
                        new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9",5), new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10",5)};
            }
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
