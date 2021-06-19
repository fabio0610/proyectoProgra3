package Modelo;

import Controlador.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> user = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int cant = 1;

    public List<Usuario> leerArchivo() {
        Usuario usuario;
        File archivo = new File("Contraseñas.txt");
        FileReader lector = null;
        try {
            lector = new FileReader(archivo);
            BufferedReader bfReader = new BufferedReader(lector);

            String lineaFichero;

            while ((lineaFichero = bfReader.readLine()) != null) {
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
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                assert lector != null;
                lector.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }
}

