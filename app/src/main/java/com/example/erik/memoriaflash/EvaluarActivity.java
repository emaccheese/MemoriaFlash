package com.example.erik.memoriaflash;

import android.content.Intent;
import android.content.res.Resources;
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
    private int indexPregunta=0;
    public int resourcesColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int unidad;
        setContentView(R.layout.activity_evaluar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set color for toolbar
        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            resourcesColor = R.color.colorPrimaryVerde;
            toolbar.setBackgroundResource(resourcesColor);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            resourcesColor = R.color.colorPrimaryAzul;
            toolbar.setBackgroundResource(resourcesColor);
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
        indexPregunta=siguientePregunta(indexPregunta);
//        tvPregunta.setText(preguntas[indexPregunta].getPregunta());
//        indexRespuesta = r.nextInt(3);
//        opciones[indexRespuesta].setText(preguntas[indexPregunta].getRespuesta());
//        setTextRadioButtons(indexRespuesta);

//****************************************************************
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setTextRadioButtons(int index){
        Random r = new Random();
        int auxRandom;

        for(int i =0;i<4;i++){
            if(i != index){
                do{
                    auxRandom = r.nextInt(9);
                }while(auxRandom == indexPregunta);
                opciones[i].setText(preguntas[auxRandom].getRespuesta());
            }
            opciones[index].setText(preguntas[indexPregunta].getRespuesta()); // Pone la respuesta correcta en el lugar de index
        }
    }
    public void evaluarRespuesta(View view){
        setRadioBtn(view);
        if(indexPregunta<10) {
            if (view.getId() == opciones[indexRespuesta].getId()) {
                Toast.makeText(this, "Respuesta Correcta", Toast.LENGTH_SHORT).show();
               indexPregunta =  siguientePregunta(indexPregunta);
            } else {
                Toast.makeText(this, "Intenta de Nuevo", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this,"Terminaste la evaluacion",Toast.LENGTH_SHORT).show();

        }
    }
    public int siguientePregunta(int preguntaIndex){
        Random r = new Random();
        tvPregunta.setText(preguntas[preguntaIndex].getPregunta());
        indexRespuesta = r.nextInt(3);
        setTextRadioButtons(indexRespuesta);
        preguntaIndex++;

        return preguntaIndex;
    }

    public void setRadioBtn(View view){
        if(view.getId() == opciones[0].getId()){
            setCheckedRadioBtn(0);
        }
        if(view.getId() == opciones[1].getId()){
            setCheckedRadioBtn(1);
        }
        if(view.getId() == opciones[2].getId()){
            setCheckedRadioBtn(2);
        }
        if(view.getId() == opciones[3].getId()){
            setCheckedRadioBtn(3);
        }
    }
    public void setCheckedRadioBtn(int btnEscojido){
        opciones[btnEscojido].setChecked(true);
//        opciones[btnEscojido].setBackgroundResource(resourcesColor);

        for(int i = 0; i <4;i++){
            if(i!= btnEscojido){
                opciones[i].setChecked(false);
//                opciones[i].setBackgroundResource(R.color.white);
            }
        }
    }
}
