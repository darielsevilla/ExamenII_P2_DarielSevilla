/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_darielsevilla;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Partidos implements Serializable  {
    private String[] equipos = new String[2];
    private int puntaje1;
    private int puntaje2;
    public final int SerialVersionUID = 113;
    public Partidos() {
    }

    
    public Partidos(int puntaje1, int puntaje2) {
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
    }

    public String[] getEquipos() {
        return equipos;
    }

    public void setEquipos(String[] equipos) {
        this.equipos = equipos;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    @Override
    public String toString() {
        return equipos[0] + " - " + puntaje1 + " : " + equipos[1] + " - " + puntaje2;
    }
    
    
}
