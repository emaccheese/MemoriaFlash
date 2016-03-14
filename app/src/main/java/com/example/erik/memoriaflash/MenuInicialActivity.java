package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

public class MenuInicialActivity extends AppCompatActivity {
    public int unidadInt =0;
    public final static String EXTRA = "com.example..erik.memoriaflash";

    public static int MAX = 10;
    public static Preguntas arrayPreguntas[] = new Preguntas[MAX];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Menu");

        Intent intent = getIntent();
        unidadInt = intent.getIntExtra(PaginaPrincipalActivity.EXTRA,0);

        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
        }
//****************************************************
        if (PaginaPrincipalActivity.botonVitreos.isChecked()) {

            if(unidadInt == 1)
            {
                arrayPreguntas[0] = new Preguntas("VitreosRespuesta3", "VitreosRespuesta3",1);
                arrayPreguntas[1] = new Preguntas("VitreosRespuesta3","VitreosRespuesta3",1);
                arrayPreguntas[2] = new Preguntas("VitreosRespuesta3", "VitreosRespuesta3",1);
                arrayPreguntas[3] = new Preguntas("VitreosPregunta4", "VitreosRespuesta4",1);
                arrayPreguntas[4] = new Preguntas("VitreosPregunta5", "VitreosRespuesta5",1);
                arrayPreguntas[5] = new Preguntas("VitreosPregunta6", "VitreosRespuesta6",1);
                arrayPreguntas[6] = new Preguntas("VitreosPregunta7", "VitreosRespuesta7",1);
                arrayPreguntas[7] = new Preguntas("VitreosPregunta8", "VitreosRespuesta8",1);
                arrayPreguntas[8] = new Preguntas("VitreosPregunta9", "VitreosRespuesta9",1);
                arrayPreguntas[9] = new Preguntas("VitreosPregunta10", "VitreosRespuesta10",1);
            }
            if(unidadInt == 2)
            {
                arrayPreguntas[0] = new Preguntas("VitreosPregunta2", "VitreosPregunta2",2);
                arrayPreguntas[1] = new Preguntas("VitreosPregunta2", "VitreosRespuesta2",2);
                arrayPreguntas[2] = new Preguntas("VitreosPregunta3", "VitreosRespuesta3",2);
                arrayPreguntas[3] = new Preguntas("VitreosPregunta4", "VitreosRespuesta4",2);
                arrayPreguntas[4] = new Preguntas("VitreosPregunta5", "VitreosRespuesta5",2);
                arrayPreguntas[5] = new Preguntas("VitreosPregunta6", "VitreosRespuesta6",2);
                arrayPreguntas[6] = new Preguntas("VitreosPregunta7", "VitreosRespuesta7",2);
                arrayPreguntas[7] = new Preguntas("VitreosPregunta8", "VitreosRespuesta8",2);
                arrayPreguntas[8] = new Preguntas("VitreosPregunta9", "VitreosRespuesta9",2);
                arrayPreguntas[9] = new Preguntas("VitreosPregunta10", "VitreosRespuesta10",2);
            }
            if(unidadInt == 3)
            {
                //M3.1: Defectos; Inclusiones sólidas y vítreas, Burbujas, Reacciones incompletas.
                arrayPreguntas[0] = new Preguntas("Estequiométricos o intrínsecos:", "los defectos " +
                        "no modifican la composición",3);
                arrayPreguntas[1] = new Preguntas("Schottky:", "vacantes de la red o Frenkel: un átm se " +
                        "traslada a una posición intersticial creando una vacante.",3);
                arrayPreguntas[2] = new Preguntas("No-estequiométricos o extrínsecos:", "cambios en la " +
                        "composición ⇒ aparición de defectos o se crean cuando un atm. extraño se " +
                        "inserta dentro de la red ",3);
                arrayPreguntas[3] = new Preguntas("Inclusiones Solidas:", "Las inclusiones sólidas conocidas como " +
                        "devitrificaciones se deriva de las propiedades químicas de los compuestos que conforman " +
                        "el vidrio y las reacciones que tienen lugar cuando se mantiene el fundido un tiempo prolongado a " +
                        "una temperatura crítica, que demarca ni más ni menos el límite exacto entre la estructura molecular " +
                        "vítrea y la cristalización.",3);
                //M3.2: Propiedades; caracterización e  importancia, Químicas y Físicas Microestructurales, Térmicas y Mecánicas, Ópticas y Eléctricas.
                arrayPreguntas[4] = new Preguntas("Materiales cerámicos porosos o gruesos:", "No han sufrido vitrificación, " +
                        "es decir, no se llega a fundir el cuarzo con la arena debido a que la temperatura del horno es baja. " +
                        "Su fractura (al romperse) es terrosa, siendo totalmente permeables a los gases, líquidos y grasas",3);
                arrayPreguntas[5] = new Preguntas("Arcilla cocida:", "de color rojiza debido al óxido de hierro de las arcillas " +
                        "empleadas. La temperatura de cocción es de unos 800ºC. A veces, la pieza se recubre con esmalte de color " +
                        "blanco (óxido de estaño) y se denomina loza estannífera. Con ella se fabrican: baldosas, ladrillos, tejas, " +
                        "jarrones, cazuelas, etc.",3);
                arrayPreguntas[6] = new Preguntas("Loza italiana:", "Se fabrica con arcilla entre amarilla-rjiza mezclada con arena" +
                        "con arena, pudiendo recubrirse de barniez transparent. La temperatura de coccion ronda los 1,000C",3);
                arrayPreguntas[7] = new Preguntas("Loza inglesa:","HOLA",3);
                arrayPreguntas[8] = new Preguntas("Materiales cerámicos impermeables o finos:", "en los que se somenten a temperaturas suficientemente " +
                        "altas como para vitrificar completamente la arena de cuarzo. Así, se obtienen productos impermeables y más duros.",3);
                arrayPreguntas[9] = new Preguntas("Gres cerámico común:","obtenido a partir de arcillas ordinarias, sometidas a temperaturas de unos 1.300 °C. Es muy empleado en pavimentos y paredes.",3);
//                "Fabricada de arcilla arenosa a la cual se le ha eliminado el óxido de " +
//                        "hierro y se le ha añadido silex, yeso, feldespato (bajando el punto de fusión de la mezcla) y caolín para mejorar la " +
//                        "blancura de la pasta. Se emplea para vajillay objetos de decoración.",3);
            }
//            Toast.makeText(this,"Vitreos is checked",Toast.LENGTH_LONG).show();
        }else {
            if (PaginaPrincipalActivity.botonCeramicos.isChecked()) {
                if(unidadInt ==1){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1", 1);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2", 1);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3", 1);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4", 1);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5", 1);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6", 1);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7", 1);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8", 1);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9", 1);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10", 1);
                }
                if(unidadInt == 2){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1", 2);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2", 2);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3", 2);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4", 2);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5", 2);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6", 2);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7", 2);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8", 2);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9", 2);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10", 2);
                }
                if(unidadInt == 3){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1", 3);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2", 3);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3", 3);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4", 3);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5", 3);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6", 3);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7", 3);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8", 3);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9", 3);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10", 3);
                }
//                Toast.makeText(this,"Ceramicos is checked",Toast.LENGTH_SHORT).show();
            }
        }
//*****************************************************

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }

    public void btnClick(View view){
        Intent intent = new Intent();

        if(view == findViewById(R.id.btnRepasar)){
            intent = new Intent(this,RepasarActivity.class);
        }
        if(view == findViewById(R.id.btnEvaluar)){
            intent = new Intent(this,EvaluarActivity.class);
        }
        if(view == findViewById(R.id.btnResultadosUnidad)){
            intent = new Intent(this,ResultadosActivity.class);
        }
        if(view == findViewById(R.id.btnInformacionUnidad)){
            intent = new Intent(this,InformacionUnidadActivity.class);
        }
        intent.putExtra(EXTRA,unidadInt);
        Serializable preguntas = arrayPreguntas;
        intent.putExtra("array",preguntas);
        startActivity(intent);
    }
}
