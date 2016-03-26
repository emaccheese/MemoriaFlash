package com.example.erik.memoriaflash;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InformacionUnidadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_unidad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(PaginaPrincipalActivity.boolVitreos){
//        if(PaginaPrincipalActivity.botonVitreos.isChecked() && !PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
            toolbar.setTitle("Informacion Vitreos");
        }
        if(PaginaPrincipalActivity.boolCeramicos){
//        if(PaginaPrincipalActivity.botonCeramicos.isChecked() && !PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
            toolbar.setTitle("Informacion Ceramicos");
        }
        if(PaginaPrincipalActivity.boolAnd){
//        if(PaginaPrincipalActivity.botonCeramicos.isChecked() && PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryRojo);
            toolbar.setTitle("Informacion Vitreos y Ceramicos");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
