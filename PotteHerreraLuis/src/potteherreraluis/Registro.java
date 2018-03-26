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
class Registro {

    private static ArrayList Contenido;

    public Registro() {
        Contenido = new ArrayList();
    }

    public static ArrayList crearRegistro(Object... Objects) {
        new Registro();
        for (Object Object1 : Objects) {
            Contenido.add(Object1);
        }
        return Contenido;
    }

    public ArrayList getContenido() {
        return Contenido;
    }
    
    public void Print_Registro(){
        for (Object object : Contenido) {
            System.out.print(object+",");
        }
    }
}
