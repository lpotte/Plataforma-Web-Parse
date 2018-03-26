/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potteherreraluis;

import java.util.ArrayList;

/**
 *
 * @author LUIS POTTE
 */
public class Tabla {
    private int Numero_de_tabla;
    private String Tipo_de_datos;
    private ArrayList registros = new ArrayList();

    public Tabla() {
    }

    public void print_tabla(){
    }

    public String getTipo_de_datos() {
        return Tipo_de_datos;
    }

    void agregar_registro(ArrayList Registro) {
        registros.add(Registro);
    }

    public void setTipo_de_datos(String Tipo_de_datos) {
        this.Tipo_de_datos = Tipo_de_datos;
    }
    
    
}
