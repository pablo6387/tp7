/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author Pablo
 */
public class Colegio {
    public static void main(String[] args) {
        
        //a)
        Materia ingles = new Materia(100,"Ingles",1);
        Materia matematicas = new Materia(101,"Matematicas",1);
        Materia laboratorio1 = new Materia(102,"Laboratorio 1",1);
        
        //b)
        Alumno mlopez = new Alumno(1001,"López","Martin");
        Alumno bmartinez = new Alumno(1002,"Martínez","Brenda");
        
        //c)
        mlopez.agregarMateria(ingles);
        mlopez.agregarMateria(matematicas);
        mlopez.agregarMateria(laboratorio1);
        
        //d)
        bmartinez.agregarMateria(ingles);
        bmartinez.agregarMateria(matematicas);
        bmartinez.agregarMateria(laboratorio1);
        bmartinez.agregarMateria(new Materia(102,"Laboratorio 1",1));
        
        //e)
        System.out.println("Cantidad de materias en las que esta inscrito en alumno Martin López: "+mlopez.cantidadMaterias());
        System.out.println("Cantidad de materias en las que esta inscrito en alumno Brenda Martínez: "+bmartinez.cantidadMaterias());
            //a. Ambos tiene la misma cantidad de materias porque la coleccion Set no contiene elementos duplicados
            //b. Se implemento la coleccion HashSet. Se modificaron los metodos hashCode y equals en la clase Materia
            
        
    }
}
