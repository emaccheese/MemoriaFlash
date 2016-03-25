package com.example.erik.memoriaflash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;

public class PaginaPrincipalActivity extends AppCompatActivity {
    public final static String EXTRA = "com.example..erik.memoriaflash";
    public static final String PREFS_NAME = "boolMateriaEscojida";
    public static RadioButton botonCeramicos;
    public static RadioButton botonVitreos;
    public static RadioButton botonAnd;
    public boolean boolCeramicos;
    public boolean boolVitreos;
    public Button [] botones = new Button[5];
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Memoria Flash");
        setSupportActionBar(toolbar);
        botonCeramicos = (RadioButton)findViewById(R.id.rdBtnCeramicos);
        botonVitreos = (RadioButton)findViewById(R.id.rdBtnVitreos);
        botonAnd = (RadioButton)findViewById(R.id.rdBtnAnd);
    }
    @Override
    protected void onStart(){
        super.onStart();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        botonCeramicos.setChecked(settings.getBoolean("estadoBtnCeramico",true));
        botonVitreos.setChecked(settings.getBoolean("estadoBtnVitreos",false));
        botonAnd.setChecked(settings.getBoolean("estadoBtnAnd",false));

        botones[0] = (Button) findViewById(R.id.btnUnidad1);
        botones[1] = (Button) findViewById(R.id.btnUnidad2);
        botones[2] = (Button) findViewById(R.id.btnUnidad3);
        botones[3] = (Button) findViewById(R.id.btnResultadosGenerales);
        botones[4] = (Button) findViewById(R.id.btnInfoMateria);
        if(botonCeramicos.isChecked()){
            setColorBtns("azul");
            toolbar.setBackgroundResource(R.color.colorPrimaryDarkAzul);
        }
        if(botonVitreos.isChecked()){
            setColorBtns("verde");
            toolbar.setBackgroundResource(R.color.colorAccentVerde);
        }
        if(botonAnd.isChecked()){
            setColorBtns("rojo");
            toolbar.setBackgroundResource(R.color.colorAccentRojo);
        }
    }

    public void setColorBtns(String color){
        if(color == "verde"){
            for(int i = 0; i<5;i++){
                botones[i].setBackgroundResource(R.drawable.buttons_verde);
            }
        }
        if (color == "azul") {
            for(int i = 0; i<5;i++){
                botones[i].setBackgroundResource(R.drawable.buttons_azul);
            }
        }
        if(color == "rojo"){
            for(int i = 0; i<5;i++){
                botones[i].setBackgroundResource(R.drawable.buttons_rojo);
            }
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void materiaSeleccionada(View view){

            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.rdBtnCeramicos:
                        if (checked){
                            setColorBtns("azul");
                            toolbar.setBackgroundResource(R.color.colorAccentAzul);
                        }
                        break;
                case R.id.rdBtnVitreos:
                        if (checked){
                            setColorBtns("verde");
                            toolbar.setBackgroundResource(R.color.colorAccentVerde);
                        }
                        break;
                case R.id.rdBtnAnd:
                    if (checked){
                        setColorBtns("rojo");
                        toolbar.setBackgroundResource(R.color.colorAccentRojo);
                    }
                    break;
            }
    }

    public void opcionSeleccionada(View view){

        Intent intent = new Intent(this,MenuInicialActivity.class);
        if(view == findViewById(R.id.btnInfoMateria)){
            intent = new Intent(this,InformacionGeneralActivity.class);
            intent.putExtra(EXTRA,0);
        }
        if(view == findViewById(R.id.btnUnidad1)){
            intent.putExtra(EXTRA,1);
        }
        if(view == findViewById(R.id.btnUnidad2)){
            intent.putExtra(EXTRA,2);
        }
        if(view == findViewById(R.id.btnUnidad3)){
            intent.putExtra(EXTRA,3);
        }
        if(view == findViewById(R.id.btnResultadosGenerales)){
            intent = new Intent(this,ResultadosActivity.class);
        }
        startActivity(intent);
    }
    @Override
    protected void onStop(){
        super.onStop();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("estadoBtnCeramico",botonCeramicos.isChecked());
        editor.putBoolean("estadoBtnVitreos",botonVitreos.isChecked());
        editor.putBoolean("estadoBtnAnd",botonAnd.isChecked());
        editor.commit();
    }
}
