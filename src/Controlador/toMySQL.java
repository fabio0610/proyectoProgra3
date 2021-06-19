package Controlador;


import Modelo.Orden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!
public class toMySQL {
    public void generarFactura(String codigo,String fecha, String vendedor, double total, String detalle) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?" +
                    "user=root&password=1234");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        try {
            int cod= Integer.parseInt(codigo);
            String x = "INSERT INTO ordenes (Codigo, Fecha, Vendedor, Total) VALUES ("+cod+", '" + fecha + "', '" +
                    vendedor + "', " + total + " )";
            statement.executeUpdate(x);

        } catch (SQLException ec) {
            System.out.println("No ejecuta el comando");
        }
        finally {
            conn.close();
        }
    }

    public void annadircafes(Orden orden, String codigo) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?" +
                    "user=root&password=1234");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        try {
            for(int i=0; i<orden.cafelist.size(); i++){
            String x = "INSERT INTO tabledetalle (Codigo, Producto, Precio) VALUES (" + codigo + ", '" +
                    orden.cafelist.get(i).getTipo() + "', "+ orden.cafelist.get(i).getPrecio()+")";
            statement.executeUpdate(x);}

        } catch (SQLException ec) {
            System.out.println("No ejecuta el comando tabledetalle");
        }
        finally {
            conn.close();
        }
    }
    public void ordenLista(int codigo) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?" +
                    "user=root&password=1234");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        try {

                String x = "UPDATE ordenes SET Estado ='Listo' WHERE Codigo = "+codigo+";";
                statement.executeUpdate(x);

        } catch (SQLException ec) {
            System.out.println("No ejecuta el comando tabledetalle");
        }
        finally {
            conn.close();
        }
    }
    public void delete (int codigo, double precio) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?" +
                    "user=root&password=1234");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        try {

            String x = "DELETE FROM tabledetalle WHERE tabledetalle.Precio="+precio+" AND tabledetalle.Codigo="+codigo+";";
            statement.executeUpdate(x);

        } catch (SQLException ec) {
            System.out.println("No ejecuta el comando tabledetalle");
        }
        finally {
            conn.close();
        }
    }
    }







