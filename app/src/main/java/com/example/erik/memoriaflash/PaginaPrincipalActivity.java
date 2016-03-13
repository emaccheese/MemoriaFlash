package com.example.erik.memoriaflash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;

public class PaginaPrincipalActivity extends AppCompatActivity {
    public final static String EXTRA = "com.example..erik.memoriaflash";
    public static final String PREFS_NAME = "boolMateriaEscojida";

    public static RadioButton botonCeramicos;
    public static RadioButton botonVitreos;
    public boolean boolCeramicos;
    public boolean boolVitreos;
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
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
    }
    @Override
    protected void onStart(){
        super.onStart();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        botonCeramicos.setChecked(settings.getBoolean("estadoBtnCeramico",true));
        botonVitreos.setChecked(settings.getBoolean("estadoBtnVitreos",false));

        b1 = (Button) findViewById(R.id.btnUnidad1);
        b2 = (Button) findViewById(R.id.btnUnidad2);
        b3 = (Button) findViewById(R.id.btnUnidad3);
        b4 = (Button) findViewById(R.id.btnResultadosGenerales);
        b5 = (Button) findViewById(R.id.btnInfoMateria);

        if(botonCeramicos.isChecked()){
            b1.setBackgroundResource(R.drawable.buttons_azul);
            b2.setBackgroundResource(R.drawable.buttons_azul);
            b3.setBackgroundResource(R.drawable.buttons_azul);
            b4.setBackgroundResource(R.drawable.buttons_azul);
            b5.setBackgroundResource(R.drawable.buttons_azul);
            toolbar.setBackgroundResource(R.color.colorPrimaryDarkAzul);
        }
        if(botonVitreos.isChecked()){
            b1.setBackgroundResource(R.drawable.buttons_verde);
            b2.setBackgroundResource(R.drawable.buttons_verde);
            b3.setBackgroundResource(R.drawable.buttons_verde);
            b4.setBackgroundResource(R.drawable.buttons_verde);
            b5.setBackgroundResource(R.drawable.buttons_verde);
            toolbar.setBackgroundResource(R.color.colorAccentVerde);
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

        if(view == botonCeramicos){
            if(botonVitreos.isChecked()){
                boolVitreos = false;
                botonVitreos.setChecked(false);
            }
            if(!botonCeramicos.isChecked()){
                boolCeramicos = true;
                botonCeramicos.setChecked(true);
            }
            b1.setBackgroundResource(R.drawable.buttons_azul);
            b2.setBackgroundResource(R.drawable.buttons_azul);
            b3.setBackgroundResource(R.drawable.buttons_azul);
            b4.setBackgroundResource(R.drawable.buttons_azul);
            b5.setBackgroundResource(R.drawable.buttons_azul);
            toolbar.setBackgroundResource(R.color.colorPrimaryDarkAzul);
        }
        if(view == botonVitreos){
            if(botonCeramicos.isChecked()){
                boolCeramicos = false;
                botonCeramicos.setChecked(false);
            }
            if(!botonVitreos.isChecked()){
                boolVitreos = true;
                botonVitreos.setChecked(true);
            }
            b1.setBackgroundResource(R.drawable.buttons_verde);
            b2.setBackgroundResource(R.drawable.buttons_verde);
            b3.setBackgroundResource(R.drawable.buttons_verde);
            b4.setBackgroundResource(R.drawable.buttons_verde);
            b5.setBackgroundResource(R.drawable.buttons_verde);
            toolbar.setBackgroundResource(R.color.colorAccentVerde);
        }
    }

    public void opcionSeleccionada(View view){

        Intent intent = new Intent(this,MenuInicialActivity.class);
        if(view == findViewById(R.id.btnInfoMateria)){
            intent = new Intent(this,InformacionActivity.class);
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
/*
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putBoolean("estadoBtnCeramico", botonCeramicos.isChecked());
        savedInstanceState.putBoolean("estadoBtnVitreos", botonVitreos.isChecked());
    }*/

    @Override
    protected void onStop(){
        super.onStop();

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("estadoBtnCeramico",botonCeramicos.isChecked());
        editor.putBoolean("estadoBtnVitreos",botonVitreos.isChecked());

        editor.commit();
    }
}
