package Controlador;

import Modelo.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ControllerMenu {
    public Button generarFactura;
    public CheckBox lecheAlvapor;
    public CheckBox lecheBatida;
    public CheckBox moca;
    public CheckBox soya;
    public Button nuevaOrden;
    public ToggleGroup Cafes;
    public ToggleButton houseBlend;
    public ToggleButton decaffeinated;
    public ToggleButton darkRoast;
    public ToggleButton expresso;

    public void facturar() {
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

            System.out.println(houseBlend1.getTipo());
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


            System.out.println(decaffeinated1.getTipo());
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


            System.out.println(darkRoast1.getTipo());
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


            System.out.println(expresso1.getTipo());
        }
    }
}

