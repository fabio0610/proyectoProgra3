package Controlador;

import Modelo.*;
import javafx.scene.control.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ControllerMenu {
    public static int posicion=0;
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
    public Label ordenes=new Label();
    public static ArrayList<String> ListaPrueba=new ArrayList<>();
    public CheckBox caramel;

    public void articuloAgre() throws InterruptedException {
       notificaAgregado.setText("Artículo agregado");
        notificaAgregado.setVisible(true);
    }
    public void alertCafe() throws InterruptedException {
        alertaCafe.setText("Seleccione un tipo de cafe");
        alertaCafe.setVisible(true);
    }

    public void addToOrder() throws InterruptedException {
        alertaCafe.setText("");
        notificaAgregado.setText("");
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
            if (caramel.isSelected()){
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
            if (caramel.isSelected()){
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
            if(caramel.isSelected()){
                expresso1.addDecorator(new Caramel(expresso1));
            }
            orden.addCoffee(expresso1);
        }
        if(darkRoast.isSelected() || expresso.isSelected()|| decaffeinated.isSelected() ||houseBlend.isSelected()) {
            articuloAgre();
            clean();

        }else{
            alertCafe();
        }
    }

    public void facturar() {
        orden.contador = orden.contador + 1;
        System.out.println(orden.print());
        Path path = Paths.get("Factura.txt");
        try {
            ListaPrueba.add(orden.print() + "\n");
            Files.writeString(path, orden.print(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void ordenLista() throws IOException{
        if(posicion < ListaPrueba.size()){
            ordenes.setText(ListaPrueba.get(posicion));
            String leerArchivo = readOrdenes();
            leerArchivo = leerArchivo +ListaPrueba.get(posicion);
            writeOrdenes(leerArchivo);
           posicion ++;
        }
        else
            ordenes.setText("No hay mas pedidos en proceso");
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
        orden.eraseAll();
    }

    public void refresh() throws IOException {
        ordenLista();
        //  ordenes.setText(orders.print());
    }

    public String readOrdenes() throws IOException {
        String mensaje="";
        String ruta = "OrdenesListas.txt";
        Path path =Paths.get(ruta);
       if( Files.exists(path)){
      List<String> x=Files.readAllLines(path,StandardCharsets.UTF_8);
      for(int i=0; i<x.size();i++){
          mensaje=mensaje+x.get(i)+"\n";
      }
      return mensaje;}
       else
           writeOrdenes("");
       return "";
    }

    public void writeOrdenes(String mensaje) throws IOException {
        String ruta = "OrdenesListas.txt";
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f);
        BufferedWriter escritura = new BufferedWriter(fw);
        escritura.write(mensaje);
        escritura.newLine();

        escritura.close();
    }
}

