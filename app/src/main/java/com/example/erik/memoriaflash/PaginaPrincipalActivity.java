package com.example.erik.memoriaflash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class PaginaPrincipalActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    public final static String EXTRA = "com.example..erik   .memoriaflash";
    public static final String PREFS_NAME = "boolMateriaEscojida";
    //*****************************ANTES*****************************
//    public static RadioButton botonCeramicos;
//    public static RadioButton botonVitreos;
//    public static RadioButton botonAnd;


    //****************************DESPUES******************************

    public static Spinner spinnerMaterias;
    public static boolean boolCeramicos;
    public static boolean boolVitreos;
    public static boolean boolAnd;
    //**********************************************************


    public Button [] botones = new Button[5];
    public Toolbar toolbar;
    public static int intentoCorrecto =0;
    public static int intentoErroneo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        botonCeramicos = (RadioButton)findViewById(R.id.rdBtnCeramicos);
//        botonVitreos = (RadioButton)findViewById(R.id.rdBtnVitreos);
//        botonAnd = (RadioButton)findViewById(R.id.rdBtnAnd);
        spinnerMaterias = (Spinner) findViewById(R.id.spinnerOpcionesMateria);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.materias_array,R.layout.spinner_item); //Crear adaptador  usando el arreglo y un layout simple

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.materias_array,android.R.layout.simple_spinner_item); //Crear adaptador  usando el arreglo y un layout simple
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Especificar el layout de la lista de opciones
        spinnerMaterias.setAdapter(adapter); //Aplicar el adaptador al spinner

        spinnerMaterias.setOnItemSelectedListener(this);

    }
    @Override
    protected void onStart(){
        super.onStart();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolCeramicos = settings.getBoolean("estadoBtnCeramico",true);
        boolVitreos = settings.getBoolean("estadoBtnVitreos",false);
        boolAnd = settings.getBoolean("estadoBtnAnd",false);
        int spinnerValue = settings.getInt("materiaEscogida",-1);
        if(spinnerValue != -1) spinnerMaterias.setSelection(spinnerValue);

//        botonCeramicos.setChecked(settings.getBoolean("estadoBtnCeramico",true));
//        botonVitreos.setChecked(settings.getBoolean("estadoBtnVitreos",false));
//        botonAnd.setChecked(settings.getBoolean("estadoBtnAnd",false));

        botones[0] = (Button) findViewById(R.id.btnUnidad1);
        botones[1] = (Button) findViewById(R.id.btnUnidad2);
        botones[2] = (Button) findViewById(R.id.btnUnidad3);
        botones[3] = (Button) findViewById(R.id.btnResultadosGenerales);
        botones[4] = (Button) findViewById(R.id.btnInfoMateria);

        if(boolCeramicos){
            setColorBtns("azul");
            toolbar.setBackgroundResource(R.color.colorPrimaryDarkAzul);
        }
        if(boolVitreos){
            setColorBtns("verde");
            toolbar.setBackgroundResource(R.color.colorAccentVerde);
        }
        if(boolAnd){
            setColorBtns("rojo");
            toolbar.setBackgroundResource(R.color.colorAccentRojo);
        }
    }

    public void setColorBtns(String color){
        if(color.equals("verde")){
            for(int i = 0; i<5;i++){
                botones[i].setBackgroundResource(R.drawable.buttons_verde);
            }
        }
        if (color.equals("azul")) {
            for(int i = 0; i<5;i++){
                botones[i].setBackgroundResource(R.drawable.buttons_azul);
            }
        }
        if(color.equals("rojo")){
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

//    public void materiaSeleccionada(View view){
//
//            // Is the button now checked?
//            boolean checked = ((RadioButton) view).isChecked();
//
//            // Check which radio button was clicked
//            switch(view.getId()) {
//                case R.id.rdBtnCeramicos:
//                        if (checked){
//                            setColorBtns("azul");
//                            toolbar.setBackgroundResource(R.color.colorAccentAzul);
//                        }
//                        break;
//                case R.id.rdBtnVitreos:
//                        if (checked){
//                            setColorBtns("verde");
//                            toolbar.setBackgroundResource(R.color.colorAccentVerde);
//                        }
//                        break;
//                case R.id.rdBtnAnd:
//                    if (checked){
//                        setColorBtns("rojo");
//                        toolbar.setBackgroundResource(R.color.colorAccentRojo);
//                    }
//                    break;
//            }
//    }

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
        int materiaEscogida = spinnerMaterias.getSelectedItemPosition();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        editor.putBoolean("estadoBtnCeramico",boolCeramicos);
        editor.putBoolean("estadoBtnVitreos",boolVitreos);
        editor.putBoolean("estadoBtnAnd",boolAnd);
        editor.putInt("materiaEscogida",materiaEscogida);
//        editor.putBoolean("estadoBtnCeramico",botonCeramicos.isChecked());
//        editor.putBoolean("estadoBtnVitreos",botonVitreos.isChecked());
//        editor.putBoolean("estadoBtnAnd",botonAnd.isChecked());
        editor.commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position ==0){
            boolCeramicos = true;
            boolVitreos = false;
            boolAnd = false;
            setColorBtns("azul");
            toolbar.setBackgroundResource(R.color.colorAccentAzul);
        }
        if(position==1){
            boolCeramicos = false;
            boolVitreos = true;
            boolAnd = false;
            setColorBtns("verde");
            toolbar.setBackgroundResource(R.color.colorAccentVerde);
        }
        if(position==2){
            boolCeramicos = false;
            boolVitreos = false;
            boolAnd = true;
            setColorBtns("rojo");
            toolbar.setBackgroundResource(R.color.colorAccentRojo);
        }
//                parent.getItemAtPosition(position);
//                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ "Seleccionado",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
