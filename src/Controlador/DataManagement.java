package Controlador;

import java.io.IOException;

public interface DataManagement {
    void writeOrdenes(String mensaje) throws IOException;

    String readOrdenes() throws IOException;
}
