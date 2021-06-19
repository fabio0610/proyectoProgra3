package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!
public class toMySQL {
    public void generarFactura(String fecha, String vendedor, double total, String detalle) {
        Connection conn;
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
            String x = "INSERT INTO ordenes (Fecha, Vendedor, Total, Detalle) VALUES ('" + fecha + "', '" + vendedor + "', " + total + ", '" + detalle + "' )";
            statement.executeUpdate(x);

        } catch (SQLException ec) {
            System.out.println("No ejecuta el comando");
        }
    }

    public static void main(String[] args) {
        // generarFactura("2/2/2", "Sebas", 8000);
       /* Connection conn = null;

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
            System.out.println("SQLException: " + ex.getMessage());
        }
       // jdbc:mysql://127.0.0.1:3306/?user=root

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?" +
                            "user=root&password=1234");
            // Do something with the Connection



        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }


        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM ordenes;");
            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
            if (stmt.execute("SELECT * FROM ordenes;")) {
                rs = stmt.getResultSet();
            }
            // Now do something with the ResultSet ....

            while (rs.next()) {
                long codigo = rs.getInt("Codigo");
               String fecha = rs.getString("Fecha");
               float total = rs.getFloat("Total");
               String vendedor = rs.getString("Vendedor");
               String estado = rs.getString("Estado");
                System.out.println(codigo);
                System.out.println(fecha);
                System.out.println(total);
                System.out.println(vendedor);
                System.out.println(estado);

            }

        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) { } // ignore
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignored) { } // ignore
                stmt = null;
            }
        }*/


    }
}



