package com.example.erik.memoriaflash;

import java.io.Serializable;

/**
 * Created by Erik on 2/27/2016.
 */
public class Preguntas implements Serializable{
    String pregunta;
    String respuesta;
    int unidad;

    public Preguntas(String pregunta, String respuesta, int unidad) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.unidad = unidad;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
