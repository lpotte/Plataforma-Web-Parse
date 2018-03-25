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

    private static ArrayList Contenido = new ArrayList();

    public Registro() {
        Contenido.add(1);
    }

    public static ArrayList crearRegistro(Object... Objects) {
        return Contenido;
    }

    public ArrayList getContenido() {
        return Contenido;
    }
    
    public void Print_Registro(){
    }
}
