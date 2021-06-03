package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    String texto;
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> user = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int cant = 1;

    public String leer(String ruta) {
        try {
            Scanner input = new Scanner(new File(ruta));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
                texto = line;
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return texto;
    }

    public List<Usuario> leerArchivo() {
        Usuario usuario;
        File archivo = new File("C:\\Users\\teres\\Documents\\Progra III\\Contraseñas.txt");
        FileReader lector = null;
        try {
            lector = new FileReader(archivo);
            BufferedReader bfReader = new BufferedReader(lector);

            String lineaFichero;
            StringBuilder contenidoFichero = new StringBuilder();

            while ((lineaFichero = bfReader.readLine()) != null) {
                contenidoFichero.append(lineaFichero);
                contenidoFichero.append("\n");
                if (cant % 2 != 0) {
                    user.add(lineaFichero);
                } else {
                    password.add(lineaFichero);
                }
                cant++;
            }
            for (int i = 0; i < user.size(); i++) {
                usuario = new Usuario(user.get(i), password.get(i));
                usuarios.add(usuario);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }
}