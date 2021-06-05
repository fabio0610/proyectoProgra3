package Controlador;

import java.io.IOException;

public interface DataManagement {
    public void writeOrdenes(String mensaje) throws IOException;
    public String readOrdenes() throws IOException;
}
