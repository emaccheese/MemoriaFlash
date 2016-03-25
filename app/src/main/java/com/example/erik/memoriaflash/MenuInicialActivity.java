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
                arrayPreguntas[0] = new Preguntas("VitreosPregunta1U1", "VitreosRespuesta1U1",1);
                arrayPreguntas[1] = new Preguntas("VitreosPregunta2U1", "VitreosRespuesta2U1",1);
                arrayPreguntas[2] = new Preguntas("VitreosPregunta3U1", "VitreosRespuesta3U1",1);
                arrayPreguntas[3] = new Preguntas("VitreosPregunta4U1", "VitreosRespuesta4U1",1);
                arrayPreguntas[4] = new Preguntas("VitreosPregunta5U1", "VitreosRespuesta5U1",1);
                arrayPreguntas[5] = new Preguntas("VitreosPregunta6U1", "VitreosRespuesta6U1",1);
                arrayPreguntas[6] = new Preguntas("VitreosPregunta7U1", "VitreosRespuesta7U1",1);
                arrayPreguntas[7] = new Preguntas("VitreosPregunta8U1", "VitreosRespuesta8U1",1);
                arrayPreguntas[8] = new Preguntas("VitreosPregunta9U1", "VitreosRespuesta9U1",1);
                arrayPreguntas[9] = new Preguntas("VitreosPregunta10U1", "VitreosRespuesta10U1",1);
            }
            if(unidadInt == 2)
            {
                arrayPreguntas[0] = new Preguntas("VitreosPregunta1U2", "VitreosRespuesta1U2",2);
                arrayPreguntas[1] = new Preguntas("VitreosPregunta2U2", "VitreosRespuesta2U2",2);
                arrayPreguntas[2] = new Preguntas("VitreosPregunta3U2", "VitreosRespuesta3U2",2);
                arrayPreguntas[3] = new Preguntas("VitreosPregunta4U2", "VitreosRespuesta4U2",2);
                arrayPreguntas[4] = new Preguntas("VitreosPregunta5U2", "VitreosRespuesta5U2",2);
                arrayPreguntas[5] = new Preguntas("VitreosPregunta6U2", "VitreosRespuesta6U2",2);
                arrayPreguntas[6] = new Preguntas("VitreosPregunta7U2", "VitreosRespuesta7U2",2);
                arrayPreguntas[7] = new Preguntas("VitreosPregunta8U2", "VitreosRespuesta8U2",2);
                arrayPreguntas[8] = new Preguntas("VitreosPregunta9U2", "VitreosRespuesta9U2",2);
                arrayPreguntas[9] = new Preguntas("VitreosPregunta10U2", "VitreosRespuesta10U2",2);
            }
            if(unidadInt == 3)
            {
                //M3.1: Defectos; Inclusiones sólidas y vítreas, Burbujas, Reacciones incompletas.
                arrayPreguntas[0] = new Preguntas("Estequiométricos o intrínsecos:", "los defectos " +
                        "no modifican la composición",3);
                arrayPreguntas[1] = new Preguntas("Schottky:", "vacantes de la red o Frenkel: un átm se traslada a una posición intersticial creando una vacante.",3);
                arrayPreguntas[2] = new Preguntas("No-estequiométricos o extrínsecos:", "cambios en la composición ⇒ aparición de defectos o se crean cuando un atm. extraño se inserta dentro de la red ",3);
                arrayPreguntas[3] = new Preguntas("Inclusiones Solidas:", "Las inclusiones sólidas conocidas como devitrificaciones se deriva de las propiedades químicas de los compuestos que conforman el vidrio y las reacciones que tienen lugar cuando se mantiene el fundido un tiempo prolongado a una temperatura crítica, que demarca ni más ni menos el límite exacto entre la estructura molecular vítrea y la cristalización.",3);
                //M3.2: Propiedades; caracterización e  importancia, Químicas y Físicas Microestructurales, Térmicas y Mecánicas, Ópticas y Eléctricas.
                arrayPreguntas[4] = new Preguntas("Materiales cerámicos porosos o gruesos:", "No han sufrido vitrificación, es decir, no se llega a fundir el cuarzo con la arena debido a que la temperatura del horno es baja. Su fractura (al romperse) es terrosa, siendo totalmente permeables a los gases, líquidos y grasas",3);
                arrayPreguntas[5] = new Preguntas("Arcilla cocida:", "de color rojiza debido al óxido de hierro de las arcillas empleadas. La temperatura de cocción es de unos 800ºC. A veces, la pieza se recubre con esmalte de color blanco (óxido de estaño) y se denomina loza estannífera. Con ella se fabrican: baldosas, ladrillos, tejas, jarrones, cazuelas, etc.",3);
                arrayPreguntas[6] = new Preguntas("Loza italiana:", "Se fabrica con arcilla entre amarilla-rjiza mezclada con arena con arena, pudiendo recubrirse de barniez transparent. La temperatura de coccion ronda los 1,000C",3);
                arrayPreguntas[7] = new Preguntas("Loza inglesa:","HOLA",3);
                arrayPreguntas[8] = new Preguntas("Materiales cerámicos impermeables o finos:", "en los que se somenten a temperaturas suficientemente altas como para vitrificar completamente la arena de cuarzo. Así, se obtienen productos impermeables y más duros.",3);
                arrayPreguntas[9] = new Preguntas("Gres cerámico común:","obtenido a partir de arcillas ordinarias, sometidas a temperaturas de unos 1.300 °C. Es muy empleado en pavimentos y paredes.",3);
//                "Fabricada de arcilla arenosa a la cual se le ha eliminado el óxido de " +
//                        "hierro y se le ha añadido silex, yeso, feldespato (bajando el punto de fusión de la mezcla) y caolín para mejorar la " +
//                        "blancura de la pasta. Se emplea para vajillay objetos de decoración.",3);
            }
//            Toast.makeText(this,"Vitreos is checked",Toast.LENGTH_LONG).show();
        }else {
            if (PaginaPrincipalActivity.botonCeramicos.isChecked()) {
                if(unidadInt ==1){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1U1", "CeramicosRespuesta1U1", 1);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2U1", "CeramicosRespuesta2U1", 1);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3U1", "CeramicosRespuesta3U1", 1);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4U1", "CeramicosRespuesta4U1", 1);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5U1", "CeramicosRespuesta5U1", 1);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6U1", "CeramicosRespuesta6U1", 1);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7U1", "CeramicosRespuesta7U1", 1);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8U1", "CeramicosRespuesta8U1", 1);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9U1", "CeramicosRespuesta9U1", 1);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10U1", "CeramicosRespuesta10U1", 1);
                }
                if(unidadInt == 2){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1U2", "CeramicosRespuesta1U2", 2);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2U2", "CeramicosRespuesta2U2", 2);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3U2", "CeramicosRespuesta3U2", 2);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4U2", "CeramicosRespuesta4U2", 2);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5U2", "CeramicosRespuesta5U2", 2);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6U2", "CeramicosRespuesta6U2", 2);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7U2", "CeramicosRespuesta7U2", 2);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8U2", "CeramicosRespuesta8U2", 2);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9U2", "CeramicosRespuesta9U2", 2);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10U2", "CeramicosRespuesta10U2", 2);
                }
                if(unidadInt == 3){
                    arrayPreguntas[0] = new Preguntas("CeramicosPregunta1U3", "CeramicosRespuesta1U3", 3);
                    arrayPreguntas[1] = new Preguntas("CeramicosPregunta2U3", "CeramicosRespuesta2U3", 3);
                    arrayPreguntas[2] = new Preguntas("CeramicosPregunta3U3", "CeramicosRespuesta3U3", 3);
                    arrayPreguntas[3] = new Preguntas("CeramicosPregunta4U3", "CeramicosRespuesta4U3", 3);
                    arrayPreguntas[4] = new Preguntas("CeramicosPregunta5U3", "CeramicosRespuesta5U3", 3);
                    arrayPreguntas[5] = new Preguntas("CeramicosPregunta6U3", "CeramicosRespuesta6U3", 3);
                    arrayPreguntas[6] = new Preguntas("CeramicosPregunta7U3", "CeramicosRespuesta7U3", 3);
                    arrayPreguntas[7] = new Preguntas("CeramicosPregunta8U3", "CeramicosRespuesta8U3", 3);
                    arrayPreguntas[8] = new Preguntas("CeramicosPregunta9U3", "CeramicosRespuesta9U3", 3);
                    arrayPreguntas[9] = new Preguntas("CeramicosPregunta10U3", "CeramicosRespuesta10U3", 3);
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
