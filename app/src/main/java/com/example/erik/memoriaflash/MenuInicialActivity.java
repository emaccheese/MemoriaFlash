package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String unidad = intent.getStringExtra(PaginaPrincipalActivity.EXTRA);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void btnClick(View view){
        Intent intent = new Intent();

        if(view == findViewById(R.id.btnRepasar)){
            intent = new Intent(this,RepasarActivity.class);
        }
        if(view == findViewById(R.id.btnEvaluar)){
            intent = new Intent(this,RepasarActivity.class);
        }
        if(view == findViewById(R.id.btnResultadosUnidad)){
            intent = new Intent(this,RepasarActivity.class);
        }
        startActivity(intent);
    }
}
