package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String rutaFichero = "C:\\dev\\Workspace\\Acceso a Datos\\AD_importCSV\\src\\main\\resources\\alumnos.csv";

        ArrayList<Alumno> Alumnnos = new ArrayList<>();
        ArrayList<String[]> CSVDatos = new Lector(rutaFichero).lectorPorLinea();
        for (String[] datosAlumno : CSVDatos){
            //el array de strings que nos devuelve CSVDatos, son los valores obtenidos en el csv, asique instanciaremos nuevos
            //alumnos con esos datos y los añadiremos a la lista de Alumnos para luego recorrerla
            Alumnnos.add(new Alumno(datosAlumno[0], Integer.parseInt(datosAlumno[1]), datosAlumno[2], Double.parseDouble(datosAlumno[3])));
        }
        //Creamos un alumno base para ordenar el array de alumnos y sacar el de mayor nota
        Alumno alumnnoTop = new Alumno("",0,"", -1);

        //Imprimimos y comparamos los alumnos para obtener el de mayor nota
        System.out.println("NOMBRE | EDAD | CURSO | NOTA MEDIA");
        for(Alumno alumno : Alumnnos){
            System.out.println(alumno);
            if(alumno.getNotaMedia()>alumnnoTop.getNotaMedia()){
                alumnnoTop = alumno;
            }
        }

        System.out.println("El alumno con la mayor nota es: " + alumnnoTop);

    }

}