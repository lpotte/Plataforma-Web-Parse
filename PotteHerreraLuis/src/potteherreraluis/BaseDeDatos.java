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
class BaseDeDatos {

    private int cantidad_de_tablas;
    private ArrayList<Tabla> tablas = new ArrayList<>();

    public void printAll() {
    }

    public void addRegistro(ArrayList Registro) {
        String tabla = "";
        boolean b = true;
        for (Object object : Registro) {
            //tabla = tabla + object.getClass().getSimpleName();
            tabla = tabla + obtenerTipo(object) + ", ";
        }
        for (Tabla tab : tablas) {
            if (tab.getTipo_de_datos().equals(tabla)) {
                tab.agregar_registro(Registro);
                tablas.add(tab);
                b = false;
                break;
            }
        }
        if (b == true) {
            Tabla tab = new Tabla();
            tab.setTipo_de_datos(tabla);
            tab.agregar_registro(Registro);
            tablas.add(tab);
        }
    }

    private String obtenerTipo(Object ob) {
        if (ob instanceof java.lang.String) {
            return "STRING";
        } else {
            if (ob instanceof java.lang.Integer) {
                return "INT";
            } else {
                if (ob instanceof java.lang.Boolean) {
                    return "BOOLEAN";
                } else {
                    if (ob instanceof java.lang.Float) {
                        return "FLOAT";
                    } else {
                        if (ob instanceof java.lang.Long) {
                            return "LONG";
                        } else {
                            if (ob instanceof java.lang.Double) {
                                return "DOUBLE";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

}
