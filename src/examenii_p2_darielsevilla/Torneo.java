/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_darielsevilla;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class Torneo implements Serializable {
    private String nombre, periodo;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partidos> partidos = new ArrayList();
    public final int SerialVersionUID = 2133;
    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void sortTeams(){
        for (int i = 0; i < equipos.size(); i++) {
          
            for (int j = i; j < equipos.size(); j++) {
                if(equipos.get(i).getPuntos() < equipos.get(j).getPuntos()){
                    
                    Collections.swap(equipos, i, j);
                }
            }
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidos> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
