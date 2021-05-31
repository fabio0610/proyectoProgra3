package Controlador;

import Modelo.*;
import javafx.scene.control.*;

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

    public void facturar(){
        if (Cafes.getSelectedToggle()==houseBlend){
            ICoffee houseBlend=new HouseBlend();
            ICoffee prueba=new ButterMilk(new Moca(new Soy(new HouseBlend())));
            if(lecheAlvapor.isSelected()){
                SteamedMilk steamedMilk=new SteamedMilk(houseBlend);
            if(lecheBatida.isSelected()){
                ButterMilk butterMilk =new ButterMilk(houseBlend);
            }
            if(moca.isSelected()){
               Moca moca =new Moca(houseBlend);
            }
            if(soya.isSelected()){
                Soy soya =new Soy(houseBlend);
            }

            System.out.println();

        }
}}}
