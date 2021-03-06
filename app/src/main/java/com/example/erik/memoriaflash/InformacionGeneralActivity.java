package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class InformacionGeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int unidadInt;
        setContentView(R.layout.activity_informacion_general);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        unidadInt = intent.getIntExtra(PaginaPrincipalActivity.EXTRA,0);
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
//        if(PaginaPrincipalActivity.botonCeramicos.isChecked() && !PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryRojo);
            toolbar.setTitle("Informacion Vitreos y Ceramicos");
        }

            TextView texto1= (TextView) findViewById(R.id.txt1);
        texto1.setText(R.string.title_activity_info1);
        TextView texto2= (TextView) findViewById(R.id.txt2);
        texto2.setText(R.string.title_activity_info2);
        TextView texto3= (TextView) findViewById(R.id.txt3);
        texto3.setText(R.string.title_activity_info3);
        TextView texto4= (TextView) findViewById(R.id.txt4);
        texto4.setText(R.string.title_activity_info4);
        TextView texto5= (TextView) findViewById(R.id.txt5);
        texto5.setText(R.string.title_activity_info5);
        TextView texto6= (TextView) findViewById(R.id.txt6);
        texto6.setText(R.string.title_activity_info6);
        TextView texto7= (TextView) findViewById(R.id.txt7);
        texto7.setText(R.string.title_activity_info7);
        TextView texto8= (TextView) findViewById(R.id.txt8);
        texto8.setText(R.string.title_activity_info8);
        TextView texto9= (TextView) findViewById(R.id.txt9);
        texto9.setText(R.string.title_activity_info9);
        TextView texto10= (TextView) findViewById(R.id.txt10);
        texto10.setText(R.string.title_activity_info10);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
