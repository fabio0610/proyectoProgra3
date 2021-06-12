package Controlador;

import Modelo.*;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ControllerMenu implements DataManagement {
    public static int posicion = 0;
    public ToggleButton generarFactura;
    public CheckBox lecheAlvapor;
    public CheckBox lecheBatida;
    public CheckBox moca;
    public CheckBox soya;
    public ToggleButton nuevaOrden;
    public ToggleGroup Cafes;
    public ToggleButton houseBlend;
    public ToggleButton decaffeinated;
    public ToggleButton darkRoast;
    public ToggleButton expresso;
    public final Orden orden = new Orden();
    public ToggleGroup factura;
    public ToggleButton agregarOrden;
    public Label notificaAgregado;
    public Label alertaCafe;
    public Button ordenFinalizada;
    public Button actualizar;
    public Label ordenes = new Label();
    public static ArrayList<String> ListaPrueba = new ArrayList<>();
    public CheckBox caramel;
    public TextField empleadoNombre=new TextField();
    public Label estadoDeOrden=new Label();
    public ListView listView=new ListView();
    private int listViewContador=0;

    public void articuloAgre() throws InterruptedException {
        notificaAgregado.setText("Artículo agregado");
        notificaAgregado.setVisible(true);
    }


    public void addToOrder() throws InterruptedException {
        if (listViewContador==0)
            listView.getItems().add(orden);
        generarFactura.setDisable(false);
        notificaAgregado.setText("");
        nuevaOrden.setDisable(false);
        if (Cafes.getSelectedToggle() == houseBlend) {
            HouseBlend houseBlend1 = new HouseBlend();
            if (lecheAlvapor.isSelected()) {
                houseBlend1.addDecorator(new SteamedMilk(houseBlend1));
            }
            if (lecheBatida.isSelected()) {
                houseBlend1.addDecorator(new ButterMilk(houseBlend1));
            }
            if (moca.isSelected()) {
                houseBlend1.addDecorator(new Moca(houseBlend1));
            }
            if (soya.isSelected()) {
                houseBlend1.addDecorator(new Soy(houseBlend1));
            }
            if (caramel.isSelected()) {
                houseBlend1.addDecorator(new Caramel(houseBlend1));
            }
            orden.addCoffee(houseBlend1);

        }

        if (Cafes.getSelectedToggle() == decaffeinated) {
            Decaffeinated decaffeinated1 = new Decaffeinated();
            if (lecheAlvapor.isSelected()) {
                decaffeinated1.addDecorator(new SteamedMilk(decaffeinated1));
            }
            if (lecheBatida.isSelected()) {
                decaffeinated1.addDecorator(new ButterMilk(decaffeinated1));
            }
            if (moca.isSelected()) {
                decaffeinated1.addDecorator(new Moca(decaffeinated1));
            }
            if (soya.isSelected()) {
                decaffeinated1.addDecorator(new Soy(decaffeinated1));
            }
            if (caramel.isSelected()) {
                decaffeinated1.addDecorator(new Caramel(decaffeinated1));
            }

            orden.addCoffee(decaffeinated1);
        }

        if (Cafes.getSelectedToggle() == darkRoast) {
            DarkRoast darkRoast1 = new DarkRoast();
            if (lecheAlvapor.isSelected()) {
                darkRoast1.addDecorator(new SteamedMilk(darkRoast1));
            }
            if (lecheBatida.isSelected()) {
                darkRoast1.addDecorator(new ButterMilk(darkRoast1));
            }
            if (moca.isSelected()) {
                darkRoast1.addDecorator(new Moca(darkRoast1));
            }
            if (soya.isSelected()) {
                darkRoast1.addDecorator(new Soy(darkRoast1));
            }
            if (caramel.isSelected()) {
                darkRoast1.addDecorator(new Caramel(darkRoast1));
            }
            orden.addCoffee(darkRoast1);
        }
        if (Cafes.getSelectedToggle() == expresso) {
            Expresso expresso1 = new Expresso();
            if (lecheAlvapor.isSelected()) {
                expresso1.addDecorator(new SteamedMilk(expresso1));
            }
            if (lecheBatida.isSelected()) {
                expresso1.addDecorator(new ButterMilk(expresso1));
            }
            if (moca.isSelected()) {
                expresso1.addDecorator(new Moca(expresso1));
            }
            if (soya.isSelected()) {
                expresso1.addDecorator(new Soy(expresso1));
            }
            if (caramel.isSelected()) {
                expresso1.addDecorator(new Caramel(expresso1));
            }
            orden.addCoffee(expresso1);
        }
        if (darkRoast.isSelected() || expresso.isSelected() || decaffeinated.isSelected() || houseBlend.isSelected()) {
            articuloAgre();
            clean();

        }
        listView.refresh();
        agregarOrden.setDisable(true);

    }

    public void facturar() {
        if(empleadoNombre.getText()==null || empleadoNombre.getText().equals(""))
            empleadoNombre.setText("Vendedor");
        orden.contador = orden.contador + 1;
        System.out.println("Factura: ");
        String pedido=orden.print() +"Vendedor: "+ empleadoNombre.getText()+"\n"+"----------------------\n";
        System.out.println(pedido);
        Path path = Paths.get("Factura.txt");
        try {
            ListaPrueba.add(orden.print() +"Vendedor: "+ empleadoNombre.getText()+"\n"+"----------------------\n");
            Files.writeString(path, pedido, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        generarFactura.setDisable(true);
        agregarOrden.setDisable(true);
        decaffeinated.setDisable(true);
        expresso.setDisable(true);
        darkRoast.setDisable(true);
        houseBlend.setDisable(true);
        notificaAgregado.setText("");
    }


    public void ordenLista() throws IOException {
        estadoDeOrden.setText("Estado de orden: Listo");
        if (posicion < ListaPrueba.size()) {
            String leerArchivo = readOrdenes();
            leerArchivo = leerArchivo + ListaPrueba.get(posicion);
            writeOrdenes(leerArchivo);
            posicion++;
            ordenFinalizada.setDisable(true);
        }
        actualizar.setDisable(false);
    }

    public void clean() {
        lecheBatida.setSelected(true);
        lecheAlvapor.setSelected(false);
        moca.setSelected(false);
        soya.setSelected(false);
        houseBlend.setSelected(false);
        decaffeinated.setSelected(false);
        expresso.setSelected(false);
        darkRoast.setSelected(false);
        caramel.setSelected(false);
    }

    public void newOrder() {
        clean();
        agregarOrden.setDisable(true);
        generarFactura.setDisable(true);
        nuevaOrden.setDisable(true);
        decaffeinated.setDisable(false);
        expresso.setDisable(false);
        darkRoast.setDisable(false);
        houseBlend.setDisable(false);
        orden.eraseAll();
    }

    public void refresh() throws IOException {
        if(ListaPrueba.size()<=0){
            estadoDeOrden.setText("Esperando Ordenes...");
        }
        else{
        ordenFinalizada.setDisable(false);
        if (posicion < ListaPrueba.size()) {
                estadoDeOrden.setText("Estado de orden: Pendiente...");
            ordenes.setText(ListaPrueba.get(posicion));
            if(posicion>=0)
                actualizar.setDisable(true);

        } else{
            ordenFinalizada.setDisable(true);
            estadoDeOrden.setText("");
            ordenes.setText("No hay mas pedidos en proceso");}}
    }

    @Override
    public String readOrdenes() throws IOException {
        String mensaje = "";
        String ruta = "OrdenesListas.txt";
        Path path = Paths.get(ruta);
        if (Files.exists(path)) {
            List<String> x = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (int i = 0; i < x.size(); i++) {
                mensaje = mensaje + x.get(i) + "\n";
            }
            return mensaje;
        } else
            writeOrdenes("");
        return "";
    }

    @Override
    public void writeOrdenes(String mensaje) throws IOException {
        String ruta = "OrdenesListas.txt";
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f);
        BufferedWriter escritura = new BufferedWriter(fw);
        escritura.write(mensaje);
        escritura.newLine();
        escritura.close();
    }

    public void DecaffeinatedAction(ActionEvent actionEvent) {
        if(decaffeinated.isSelected())
            agregarOrden.setDisable(false);
        else
            if(!decaffeinated.isSelected())
                agregarOrden.setDisable(true);
    }

    public void DarkroastAction(ActionEvent actionEvent) {
        if(darkRoast.isSelected())
            agregarOrden.setDisable(false);
        else
        if(!darkRoast.isSelected())
            agregarOrden.setDisable(true);
    }

    public void ExpressoAction(ActionEvent actionEvent) {
        if(expresso.isSelected())
            agregarOrden.setDisable(false);
        else
        if(!expresso.isSelected())
            agregarOrden.setDisable(true);
    }

    public void houseBlendAction(ActionEvent actionEvent) {
        if(houseBlend.isSelected())
            agregarOrden.setDisable(false);
        else
        if(!houseBlend.isSelected())
            agregarOrden.setDisable(true);
    }
}

