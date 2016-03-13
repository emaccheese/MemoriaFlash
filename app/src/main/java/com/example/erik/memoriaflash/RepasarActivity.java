package com.example.erik.memoriaflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.erik.memoriaflash.PaginaPrincipalActivity;

import java.util.Random;

public class RepasarActivity extends AppCompatActivity {

    public int unidadString = 0;
    public int MAX = 10;
    public Preguntas arrayPreguntas[] = new Preguntas[MAX];

    public Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repasar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(PaginaPrincipalActivity.botonVitreos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryVerde);
        }
        if(PaginaPrincipalActivity.botonCeramicos.isChecked()){
            toolbar.setBackgroundResource(R.color.colorPrimaryAzul);
        }

        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        unidadString = intent.getIntExtra(MenuInicialActivity.EXTRA,0);


        if (PaginaPrincipalActivity.botonVitreos.isChecked()) {

            if(unidadString == 1)
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
            if(unidadString == 2)
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
            if(unidadString == 3)
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
                arrayPreguntas[0] = new Preguntas("CeramicosPregunta1", "CeramicosRespuesta1", 1);
                arrayPreguntas[1] = new Preguntas("CeramicosPregunta2", "CeramicosRespuesta2", 1);
                arrayPreguntas[2] = new Preguntas("CeramicosPregunta3", "CeramicosRespuesta3", 2);
                arrayPreguntas[3] = new Preguntas("CeramicosPregunta4", "CeramicosRespuesta4", 2);
                arrayPreguntas[4] = new Preguntas("CeramicosPregunta5", "CeramicosRespuesta5", 3);
                arrayPreguntas[5] = new Preguntas("CeramicosPregunta6", "CeramicosRespuesta6", 3);
                arrayPreguntas[6] = new Preguntas("CeramicosPregunta7", "CeramicosRespuesta7", 4);
                arrayPreguntas[7] = new Preguntas("CeramicosPregunta8", "CeramicosRespuesta8", 4);
                arrayPreguntas[8] = new Preguntas("CeramicosPregunta9", "CeramicosRespuesta9", 5);
                arrayPreguntas[9] = new Preguntas("CeramicosPregunta10", "CeramicosRespuesta10", 5);
//                Toast.makeText(this,"Ceramicos is checked",Toast.LENGTH_SHORT).show();
                }
            }

//        Random r = new Random();

        Integer index = 1;

        Toast.makeText(this,index.toString(),Toast.LENGTH_SHORT).show();
        mostrarPregunta(arrayPreguntas[index]);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void mostrarSiguiente(View view){


    }
    public void mostrarPregunta(Preguntas pregunta){

        TextView textPregunta = (TextView) findViewById(R.id.tvPregunta);
        TextView textRespuesta = (TextView) findViewById(R.id.tvRespuesta);


        textPregunta.setText(pregunta.getPregunta());
        textRespuesta.setText(pregunta.getRespuesta());

    }

    public void siguientePregunta(Integer index){

    }



}
