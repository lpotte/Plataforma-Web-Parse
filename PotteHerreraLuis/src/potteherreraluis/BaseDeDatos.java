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
    private ArrayList registro = new ArrayList();

    public void printAll() {
    }

    public void addRegistro(ArrayList Registro) {
        String tabla = "";
        boolean b = true;
        for (Object object : Registro) {
            obtenerTipo(object, tabla);
        }
        for (Tabla tab : tablas) {
            if (tab.getTipo_de_datos().equals(tabla)) {
                tab.agregar_registro(Registro);
                b = false;
            }
        }
        if (b == true) {
            Tabla tab = new Tabla();
            tab.setTipo_de_datos(tabla);
            tab.agregar_registro(Registro);
            tablas.add(tab);
        }
    }

    private void obtenerTipo(Object ob, String tabla) {
        if (ob instanceof java.lang.String) {
            registro.add((String) ob);
            tabla = tabla + "STRING" + ", ";
        } else {
            if (ob instanceof java.lang.Integer) {
                registro.add((Integer) ob);
                tabla = tabla + "INTEGER" + ", ";
            } else {
                if (ob instanceof java.lang.Boolean) {
                    registro.add((Boolean) ob);
                    tabla = tabla + "BOOLEAN" + ", ";
                } else {
                    if (ob instanceof java.lang.Float) {
                        registro.add((Float) ob);
                        tabla = tabla + "FLOAT" + ", ";
                    } else {
                        if (ob instanceof java.lang.Long) {
                            registro.add((Long) ob);
                            tabla = tabla + "LONG" + ", ";
                        } else {
                            if (ob instanceof java.lang.Double) {
                                registro.add((Double) ob);
                                tabla = tabla + "DOUBLE" + ", ";
                            }
                        }
                    }
                }
            }
        }
    }

}
