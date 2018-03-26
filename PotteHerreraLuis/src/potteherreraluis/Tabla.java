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

    public void print_tabla() {
        System.out.println("*************************************");
        System.out.println("Tabla "+Numero_de_tabla);
        System.out.println(Tipo_de_datos);
        System.out.println("Registros:");
        for (Object registro : registros) {
            System.out.println(registro);
        }
    }

    public String getTipo_de_datos() {
        return Tipo_de_datos;
    }

    void agregar_registro(ArrayList Registro) {
        registros.add(tipo_original(Registro));
    }

    public void setTipo_de_datos(String Tipo_de_datos) {
        this.Tipo_de_datos = Tipo_de_datos;
    }

    private ArrayList tipo_original(ArrayList Registro) {
        ArrayList aux = new ArrayList();
        for (Object ob : Registro) {
            if (ob instanceof java.lang.String) {
                aux.add((String) ob);
            } else {
                if (ob instanceof java.lang.Integer) {
                    aux.add((Integer) ob);
                } else {
                    if (ob instanceof java.lang.Boolean) {
                        aux.add((Boolean) ob);
                    } else {
                        if (ob instanceof java.lang.Float) {
                            aux.add((Float) ob);
                        } else {
                            if (ob instanceof java.lang.Long) {
                                aux.add((Long) ob);
                            } else {
                                if (ob instanceof java.lang.Double) {
                                    aux.add((Double) ob);
                                }
                            }
                        }
                    }
                }
            }
        }
        return aux;
    }
}
