package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MenuInicialActivity extends AppCompatActivity {
    public int unidadInt =0;
    public final static String EXTRA = "com.example..erik.memoriaflash";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
        }

        Intent intent = getIntent();
        unidadInt = intent.getIntExtra(PaginaPrincipalActivity.EXTRA,0);
        Integer index = unidadInt;
        Toast.makeText(this, index.toString(), Toast.LENGTH_LONG).show();
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
        intent.putExtra(EXTRA,unidadInt);
        startActivity(intent);
    }
}
