package com.example.erik.memoriaflash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupWindow;
import android.widget.RadioButton;

public class PaginaPrincipalActivity extends AppCompatActivity {
    public final static String EXTRA = "com.example..erik.memoriaflash";
    public static final String PREFS_NAME = "boolMateriaEscojida";

    public static RadioButton botonCeramicos;
    public static RadioButton botonVitreos;
    public boolean boolCeramicos;
    public boolean boolVitreos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Memoria Flash");
        setSupportActionBar(toolbar);

        botonCeramicos = (RadioButton)findViewById(R.id.rdBtnCeramicos);
        botonVitreos = (RadioButton)findViewById(R.id.rdBtnVitreos);

        /*if( savedInstanceState != null){
            boolCeramicos = savedInstanceState.getBoolean("estadoBtnCeramico");
            boolVitreos = savedInstanceState.getBoolean("estadoBtnVitreos");
        }*/


       // boolCeramicos = settings.getBoolean("estadoBtnCeramico", true);
       // boolVitreos = settings.getBoolean("estadoBtnVitreos",false);

        //Resources resources = getResources();

        //Estado inicial de materia escojida:
        //botonCeramicos.setChecked(boolCeramicos);//resources.getBoolean(R.bool.boolMateriaCeramicos));
        //botonVitreos.setChecked(boolVitreos);//resources.getBoolean(R.bool.boolMateriaVitreos));
    }
    @Override
    protected void onStart(){
        super.onStart();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        botonCeramicos.setChecked(settings.getBoolean("estadoBtnCeramico",true));
        botonVitreos.setChecked(settings.getBoolean("estadoBtnVitreos",false));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pagina_principal, menu);
        return true;
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
        }
    }

    public void opcionSeleccionada(View view){

        Intent intent = new Intent(this,MenuInicialActivity.class);
        if(view == findViewById(R.id.btnInfoMateria)){
            intent = new Intent(this,InformacionActivity.class);
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
