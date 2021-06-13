package Controlador;

import Modelo.*;
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
    public static final Orden orden = new Orden();
    public ToggleGroup factura;
    public ToggleButton agregarOrden;
    public Label notificaAgregado;
    public Label ordenes = new Label();
    public static ArrayList<String> ListaPrueba = new ArrayList<>();
    public CheckBox caramel;
    public TextField empleadoNombre = new TextField();
    public Label estadoDeOrden = new Label();
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
    public ListView<String> kitchenList=new ListView<>();
    public Button marcarListo;
    public Label warningCocina;


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
            houseBlend.setDisable(true);
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
            decaffeinated.setDisable(true);
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
            darkRoast.setDisable(true);
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
expresso.setDisable(true);
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

    public void facturar() {
        if (empleadoNombre.getText() == null || empleadoNombre.getText().equals(""))
            empleadoNombre.setText("No se ingreso...");
        orden.contador = orden.contador + 1;
        System.out.println("Factura: ");
        String pedido = orden.print() + "Vendedor: " + empleadoNombre.getText() + "\n" +"Codigo: " +
                ( (int) Math.floor(Math.random()*(9 +1)+0))+  ( (int) Math.floor(Math.random()*(9 +1)+0))+
                ( (int) Math.floor(Math.random()*(9 +1)+0))+  ( (int) Math.floor(Math.random()*(9 +1)+0))+
                ( (int) Math.floor(Math.random()*(9 +1)+0)) +"\n" +"----------------------\n";
        System.out.println(pedido);
        Path path = Paths.get("Factura.txt");
        try {
            kitchenList.setDisable(false);
            ListaPrueba.add(pedido);
            kitchenList.getItems().add(pedido);
            kitchenList.refresh();
            Files.writeString(path, pedido, StandardCharsets.UTF_8);
        } catch (IOException e) {
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

    public void BotonOrdenLista() throws IOException {
        if (kitchenList.getSelectionModel().getSelectedItem()!=null){
            String x=kitchenList.getSelectionModel().getSelectedItem();
            for(int i=0; i<ListaPrueba.size();i++)
        if (ListaPrueba.get(i).equals(x)) {
            warningCocina.setText("");
            String leerArchivo = readOrdenes();
            leerArchivo = leerArchivo + ListaPrueba.get(i);
            writeOrdenes(leerArchivo);
            ListaPrueba.remove(ListaPrueba.get(i));
            kitchenList.getItems().remove(kitchenList.getSelectionModel().getSelectedItem());
        }
        }
        else
            warningCocina.setText("No hay ningun pedido seleccionado");
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

    @Override
    public String readOrdenes() throws IOException {
        StringBuilder mensaje = new StringBuilder();
        String ruta = "OrdenesListas.txt";
        Path path = Paths.get(ruta);
        if (Files.exists(path)) {
            List<String> x = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String s : x) {
                mensaje.append(s).append("\n");
            }
            return mensaje.toString();
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


}

