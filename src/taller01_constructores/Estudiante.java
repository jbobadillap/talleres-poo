package taller01_constructores;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    Estudiante(){
        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin curso";
    }
    Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        curso = "Sin curso";
    }
    Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCurso: " + curso;
    }
}