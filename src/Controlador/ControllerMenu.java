package Controlador;

import Modelo.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

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

public class ControllerMenu {
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
    private final Orden orden = new Orden();
    public ToggleGroup factura;
    public ToggleButton agregarOrden;
    public Label notificaAgregado;
    public Label alertaCafe;

    List<String> orders = new ArrayList<String>();

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
            Files.writeString(path, orden.print(), StandardCharsets.UTF_8);
            orders.add(orden.print());
            facturarOrdenes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void facturarOrdenes() throws IOException {
        String ruta = "VariasFacturas.txt";
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f);
        BufferedWriter escritura = new BufferedWriter(fw);
        for (int i = 0; i < orders.size(); i++) {
            escritura.write(orders.get(i));
            escritura.newLine();
        }
        escritura.close();
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
    }
    public void newOrder() {
        clean();
        orden.eraseAll();
    }
}

