package Controlador;

import Modelo.*;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

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
    public static final Orden orden = new Orden();
    public ToggleGroup factura;
    public ToggleButton agregarOrden;
    LocalDate fecha = LocalDate.now();
    public Label notificaAgregado;
    public static ArrayList<String> ListaPrueba = new ArrayList<>();
    public CheckBox caramel;
    public TextField empleadoNombre = new TextField();
    public ListView<String> listView = new ListView<>();
    public Button eliminar;
    public Label totalOrden;
    public ToggleGroup SoyaX2;
    public ToggleButton soyaX2;
    public ToggleGroup BatidaX2;
    public ToggleButton batidax2;
    public ToggleGroup CaraX2;
    public ToggleButton caramelox2;
    public ToggleGroup MocaX2;
    public ToggleButton mocax2;
    public ToggleGroup VaporX2;
    public ToggleButton vaporX2;
    kitchenController kitchen = new kitchenController();
    EnviaOrden enviaOrden = new EnviaOrden();
    private final toMySQL mySQL = new toMySQL();

    public ControllerMenu() {
    }

    public void articuloAgre() {
        notificaAgregado.setText("Artículo agregado");
        notificaAgregado.setVisible(true);
    }


    public void addToOrder() {
        generarFactura.setDisable(false);
        notificaAgregado.setText("");
        nuevaOrden.setDisable(false);
        eliminar.setDisable(false);
        if (Cafes.getSelectedToggle() == houseBlend) {
            HouseBlend houseBlend1 = new HouseBlend();
            if (lecheAlvapor.isSelected()) {
                if (vaporX2.isSelected())
                    houseBlend1.addDecorator(new SteamedMilk(houseBlend1, 2));
                else
                    houseBlend1.addDecorator(new SteamedMilk(houseBlend1));
            }
            if (lecheBatida.isSelected()) {
                if (batidax2.isSelected())
                    houseBlend1.addDecorator(new ButterMilk(houseBlend1, 2));
                else
                    houseBlend1.addDecorator(new ButterMilk(houseBlend1));
            }
            if (moca.isSelected()) {
                if (mocax2.isSelected())
                    houseBlend1.addDecorator(new Moca(houseBlend1, 2));
                else
                    houseBlend1.addDecorator(new Moca(houseBlend1));
            }
            if (soya.isSelected()) {
                if (soyaX2.isSelected())
                    houseBlend1.addDecorator(new Soy(houseBlend1, 2));
                else
                    houseBlend1.addDecorator(new Soy(houseBlend1));

            }
            if (caramel.isSelected()) {
                if (caramelox2.isSelected())
                    houseBlend1.addDecorator(new Caramel(houseBlend1, 2));
                else
                    houseBlend1.addDecorator(new Caramel(houseBlend1));
            }
            houseBlend1.changeTheComa();
            orden.addCoffee(houseBlend1);
            listView.getItems().add(houseBlend1.getTipo());
        }

        if (Cafes.getSelectedToggle() == decaffeinated) {
            Decaffeinated decaffeinated1 = new Decaffeinated();
            if (lecheAlvapor.isSelected()) {
                if (vaporX2.isSelected())
                    decaffeinated1.addDecorator(new SteamedMilk(decaffeinated1, 2));
                else
                    decaffeinated1.addDecorator(new SteamedMilk(decaffeinated1));
            }
            if (lecheBatida.isSelected()) {
                if (batidax2.isSelected())
                    decaffeinated1.addDecorator(new ButterMilk(decaffeinated1, 2));
                else
                    decaffeinated1.addDecorator(new ButterMilk(decaffeinated1));
            }
            if (moca.isSelected()) {
                if (mocax2.isSelected())
                    decaffeinated1.addDecorator(new Moca(decaffeinated1, 2));
                else
                    decaffeinated1.addDecorator(new Moca(decaffeinated1));
            }
            if (soya.isSelected()) {
                if (soyaX2.isSelected())
                    decaffeinated1.addDecorator(new Soy(decaffeinated1, 2));
                else
                    decaffeinated1.addDecorator(new Soy(decaffeinated1));
            }
            if (caramel.isSelected()) {
                if (caramelox2.isSelected())
                    decaffeinated1.addDecorator(new Caramel(decaffeinated1, 2));
                else
                    decaffeinated1.addDecorator(new Caramel(decaffeinated1));
            }
            decaffeinated1.changeTheComa();
            orden.addCoffee(decaffeinated1);
            listView.getItems().add(decaffeinated1.getTipo());
        }

        if (Cafes.getSelectedToggle() == darkRoast) {
            DarkRoast darkRoast1 = new DarkRoast();
            if (lecheAlvapor.isSelected()) {
                if (vaporX2.isSelected())
                    darkRoast1.addDecorator(new SteamedMilk(darkRoast1, 2));
                else
                    darkRoast1.addDecorator(new SteamedMilk(darkRoast1));
            }
            if (lecheBatida.isSelected()) {
                if (batidax2.isSelected())
                    darkRoast1.addDecorator(new ButterMilk(darkRoast1, 2));
                else
                    darkRoast1.addDecorator(new ButterMilk(darkRoast1));
            }
            if (moca.isSelected()) {
                if (moca.isSelected())
                    darkRoast1.addDecorator(new Moca(darkRoast1, 2));
                else
                    darkRoast1.addDecorator(new Moca(darkRoast1));
            }
            if (soya.isSelected()) {
                if (soyaX2.isSelected())
                    darkRoast1.addDecorator(new Soy(darkRoast1, 2));
                else
                    darkRoast1.addDecorator(new Soy(darkRoast1));
            }
            if (caramel.isSelected()) {
                if (caramelox2.isSelected())
                    darkRoast1.addDecorator(new Caramel(darkRoast1, 2));
                else
                    darkRoast1.addDecorator(new Caramel(darkRoast1));
            }
            darkRoast1.changeTheComa();
            orden.addCoffee(darkRoast1);
            listView.getItems().add(darkRoast1.getTipo());
        }
        if (Cafes.getSelectedToggle() == expresso) {
            Expresso expresso1 = new Expresso();
            if (lecheAlvapor.isSelected()) {
                if (vaporX2.isSelected())
                    expresso1.addDecorator(new SteamedMilk(expresso1, 2));
                else
                    expresso1.addDecorator(new SteamedMilk(expresso1));
            }
            if (lecheBatida.isSelected()) {
                if (lecheBatida.isSelected())
                    expresso1.addDecorator(new ButterMilk(expresso1, 2));
                else
                    expresso1.addDecorator(new ButterMilk(expresso1));
            }
            if (moca.isSelected()) {
                if (mocax2.isSelected())
                    expresso1.addDecorator(new Moca(expresso1, 2));
                else
                    expresso1.addDecorator(new Moca(expresso1));
            }
            if (soya.isSelected()) {
                if (soyaX2.isSelected())
                    expresso1.addDecorator(new Soy(expresso1));
                else
                    expresso1.addDecorator(new Soy(expresso1, 2));
            }
            if (caramel.isSelected()) {
                if (caramelox2.isSelected())
                    expresso1.addDecorator(new Caramel(expresso1, 2));
                else
                    expresso1.addDecorator(new Caramel(expresso1));
            }
            expresso1.changeTheComa();
            orden.addCoffee(expresso1);
            listView.getItems().add(expresso1.getTipo());
        }
        if (darkRoast.isSelected() || expresso.isSelected() || decaffeinated.isSelected() || houseBlend.isSelected()) {
            articuloAgre();
            clean();

        }
        totalOrden.setText("₡ " + orden.total());
        listView.refresh();
        agregarOrden.setDisable(true);
        agregarOrden.setSelected(false);

    }

    public void setKitchen(kitchenController kitchen) {
        this.kitchen = kitchen;
    }

    public void facturar() {

        if (empleadoNombre.getText() == null || empleadoNombre.getText().equals(""))
            empleadoNombre.setText("No se ingreso...");
        orden.contador = orden.contador + 1;
        System.out.println("Factura: ");
        String pedido = orden.print();
        String pedi2 = orden.send();
        String Codigo =
                String.valueOf(((int) Math.floor(Math.random() * (9 + 1) + 0)) + ((int) Math.floor(Math.random() * (9 + 1) + 0)) +
                        ((int) Math.floor(Math.random() * (9 + 1) + 0)) + ((int) Math.floor(Math.random() * (9 + 1) + 0)) +
                        ((int) Math.floor(Math.random() * (9 + 1) + 0)));
        System.out.println(pedi2);
        Path path = Paths.get("Factura.txt");
        try {
                mySQL.generarFactura(Codigo, fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/2021",
                        empleadoNombre.getText(), orden.total(), pedido);
            mySQL.annadircafes(orden, Codigo);
            pedi2 += "Codigo " + Codigo;
            ListaPrueba.add(pedi2);
            Files.writeString(path, pedi2, StandardCharsets.UTF_8);
            enviaOrden.actionPerformed(pedi2);
            kitchen.warningCocina.setText("");// kitchen.kitchenList.getItems().add(pedi2);
            kitchen.kitchenList.refresh();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        totalOrden.setText("₡ " + orden.total());
        generarFactura.setDisable(true);
        agregarOrden.setDisable(true);
        decaffeinated.setDisable(true);
        expresso.setDisable(true);
        darkRoast.setDisable(true);
        houseBlend.setDisable(true);
        notificaAgregado.setText("");
        generarFactura.setSelected(false);
        eliminar.setDisable(true);

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
        vaporX2.setSelected(false);
        batidax2.setSelected(false);
        mocax2.setSelected(false);
        soyaX2.setSelected(false);
        caramelox2.setSelected(false);
    }

    public void newOrder() {
        clean();
        eliminar.setDisable(true);
        agregarOrden.setDisable(true);
        generarFactura.setDisable(true);
        nuevaOrden.setDisable(true);
        decaffeinated.setDisable(false);
        expresso.setDisable(false);
        darkRoast.setDisable(false);
        houseBlend.setDisable(false);
        lecheBatida.setDisable(false);
        lecheAlvapor.setDisable(false);
        moca.setDisable(false);
        soya.setDisable(false);
        caramel.setDisable(false);
        listView.getItems().clear();
        agregarOrden.setSelected(false);
        orden.eraseAll();
        notificaAgregado.setText("");
        totalOrden.setText(String.valueOf(orden.getTotal()));
    }


    public void DecaffeinatedAction() {
        if (decaffeinated.isSelected())
            agregarOrden.setDisable(false);
        else if (!decaffeinated.isSelected())
            agregarOrden.setDisable(true);
    }

    public void DarkroastAction() {
        if (darkRoast.isSelected())
            agregarOrden.setDisable(false);
        else if (!darkRoast.isSelected())
            agregarOrden.setDisable(true);
    }

    public void ExpressoAction() {
        if (expresso.isSelected())
            agregarOrden.setDisable(false);
        else if (!expresso.isSelected())
            agregarOrden.setDisable(true);
    }

    public void houseBlendAction() {
        if (houseBlend.isSelected())
            agregarOrden.setDisable(false);
        else if (!houseBlend.isSelected())
            agregarOrden.setDisable(true);
    }

    public void deleteCoffe() {
        if (listView.getSelectionModel().getSelectedItem() != null) {
            for (int i = 0; i < orden.cafelist.size(); i++) {
                String x = listView.getSelectionModel().getSelectedItem();
                if (orden.cafelist.get(i).getTipo().equals(x)) {
                    orden.cafelist.remove(i);
                    listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
                    listView.refresh();
                    totalOrden.setText("₡ " + orden.total());
                    return;
                }
            }
        } else {
            notificaAgregado.setText("No ha sleccionado nada");
        }

    }

    public void dobleVapor() {
        lecheAlvapor.setSelected(vaporX2.isSelected());
    }

    public void dobleMoca() {
        moca.setSelected(mocax2.isSelected());
    }

    public void dobleCaramelo() {
        caramel.setSelected(caramelox2.isSelected());
    }

    public void dobleBatida() {
        lecheBatida.setSelected(batidax2.isSelected());
    }

    public void dobleSoya() {
        soya.setSelected(soyaX2.isSelected());
    }

    public void vaporBox() {
        if (!lecheAlvapor.isSelected())
            vaporX2.setSelected(false);
    }

    public void batidaBox() {
        if (!lecheBatida.isSelected())
            batidax2.setSelected(false);
    }

    public void MocaBox() {
        if (!moca.isSelected())
            mocax2.setSelected(false);
    }

    public void soyaBox() {
        if (!soya.isSelected())
            soyaX2.setSelected(false);
    }

    public void CarameloBox() {
        if (!caramel.isSelected())
            caramelox2.setSelected(false);
    }

    private class EnviaOrden implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public void actionPerformed(String orden) throws IOException {
            Socket socket = new Socket("192.168.0.188", 9979);
            DataOutputStream flujoSalida = new DataOutputStream(socket.getOutputStream());
            flujoSalida.writeUTF(orden);
            flujoSalida.close();
        }
    }


}

