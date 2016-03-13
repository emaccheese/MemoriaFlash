package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EvaluarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
