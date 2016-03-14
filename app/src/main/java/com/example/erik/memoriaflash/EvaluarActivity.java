package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class EvaluarActivity extends AppCompatActivity {
    public Preguntas [] preguntas;
    public TextView tvPregunta;
    public RadioButton opciones [] = new RadioButton[4];
    public int indexRespuesta;
    public int indexPregunta=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int unidad;
        setContentView(R.layout.activity_evaluar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Evaluar");
        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
        }
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
//****************************************************************
       Random r = new Random();
        preguntas= MenuInicialActivity.arrayPreguntas;
        tvPregunta = (TextView) findViewById(R.id.txtPreguntaEvaluar);
        opciones[0] = (RadioButton) findViewById(R.id.rdBtnRespuesta1);
        opciones[1] = (RadioButton) findViewById(R.id.rdBtnRespuesta2);
        opciones[2] = (RadioButton) findViewById(R.id.rdBtnRespuesta3);
        opciones[3] = (RadioButton) findViewById(R.id.rdBtnRespuesta4);

        tvPregunta.setText(preguntas[indexPregunta].getPregunta());
        indexRespuesta = r.nextInt(3);
        if(indexRespuesta <4){
            opciones[indexRespuesta].setText(preguntas[indexPregunta].getRespuesta());
            setTextRadioButtons(indexRespuesta);
            Integer integer = indexPregunta;
            Toast.makeText(this,integer.toString(),Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"indexRespuesta mayor a 4",Toast.LENGTH_SHORT).show();
        }

//****************************************************************
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void setTextRadioButtons(int index){
        int j = index+1;
        for(int i =0;i<4;i++){
            if(i != index && j <10){
                opciones[i].setText(preguntas[j].getRespuesta());
                j++;
            }
        }
    }
    public void evaluarRespuesta(View view){
        setRadioBtn(view);
        if(indexPregunta<10) {
            if (view.getId() == opciones[indexRespuesta].getId()) {
                Toast.makeText(this, "Respuesta Correcta", Toast.LENGTH_SHORT).show();
                siguientePregunta();
            } else {
                Toast.makeText(this, "Intenta de Nuevo", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this,"Terminaste la evaluacion",Toast.LENGTH_SHORT).show();

        }
    }
    public void siguientePregunta(){
        indexPregunta++;
        tvPregunta.setText(preguntas[indexPregunta].getPregunta());
        Integer integer = indexPregunta;
        Toast.makeText(this,integer.toString(),Toast.LENGTH_SHORT).show();
    }
    public void setRadioBtn(View view){
        if(view.getId() == opciones[0].getId()){
            opciones[0].setChecked(true);
            opciones[1].setChecked(false);
            opciones[2].setChecked(false);
            opciones[3].setChecked(false);
        }
        if(view.getId() == opciones[1].getId()){
            opciones[1].setChecked(true);
            opciones[0].setChecked(false);
            opciones[2].setChecked(false);
            opciones[3].setChecked(false);
        }
        if(view.getId() == opciones[2].getId()){
            opciones[2].setChecked(true);
            opciones[1].setChecked(false);
            opciones[0].setChecked(false);
            opciones[3].setChecked(false);
        }
        if(view.getId() == opciones[3].getId()){
            opciones[3].setChecked(true);
            opciones[1].setChecked(false);
            opciones[2].setChecked(false);
            opciones[0].setChecked(false);
        }
    }
}
