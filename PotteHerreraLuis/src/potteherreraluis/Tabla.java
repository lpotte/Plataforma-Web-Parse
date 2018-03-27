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
            for (Object obj : (ArrayList)registro) {
                print_tipo_original(obj);
                System.out.print(", ");
            }
            System.out.print("\n");
        }
    }

    public void setNumero_de_tabla(int Numero_de_tabla) {
        this.Numero_de_tabla = Numero_de_tabla;
    }

    public String getTipo_de_datos() {
        return Tipo_de_datos;
    }

    void agregar_registro(ArrayList Registro) {
        registros.add((Registro));
    }

    public void setTipo_de_datos(String Tipo_de_datos) {
        this.Tipo_de_datos = Tipo_de_datos;
    }

    private void print_tipo_original(Object ob) {
            if (ob instanceof java.lang.String) {
                System.out.print((String) ob);
            } else {
                if (ob instanceof java.lang.Integer) {
                    System.out.print((Integer) ob);
                } else {
                    if (ob instanceof java.lang.Boolean) {
                        System.out.print((Boolean) ob);
                    } else {
                        if (ob instanceof java.lang.Float) {
                            System.out.print((Float) ob);
                        } else {
                            if (ob instanceof java.lang.Long) {
                                System.out.print((Long) ob);
                            } else {
                                if (ob instanceof java.lang.Double) {
                                    System.out.print((Double) ob);
                                }
                            }
                        }
                    }
                }
            }
        }
}
