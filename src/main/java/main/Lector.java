package main;

import java.io.*;
import java.util.ArrayList;

public class Lector {

    private File ruta;

    public Lector(String ruta) {
        this.ruta = new File(ruta);
    }

    public ArrayList<String[]> lectorPorLinea() {
        String line;
        ArrayList<String[]> out = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader(ruta))) {

            while ((line = br.readLine()) != null) {

                // Separaremos la linea meidante el uso de la , y obtendremos un array de String con los datos de cada alumno
                String[] split = line.split(",");
                out.add(split);
            }
            //Retornamos el arraylist con los datos de los alumnos
            return out;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
