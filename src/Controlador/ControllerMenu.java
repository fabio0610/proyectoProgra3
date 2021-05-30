package Controlador;

import Modelo.ButterMilk;
import Modelo.DarkRoast;
import Modelo.HouseBlend;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;

public class ControllerMenu {
    public Button generarFactura;
    public CheckBox lecheAlvapor;
    public CheckBox lecheBatida;
    public CheckBox moca;
    public CheckBox soya;
    public Button nuevaOrden;
    public MenuButton tipoCafe;

    public void facturar(){
        ButterMilk butterMilk;
        HouseBlend houseBlend=new HouseBlend();
        DarkRoast darkRoast;
if(tipoCafe.getText().equals("House Blend           ₡1400")){
    if(lecheAlvapor.isSelected())
      butterMilk=new ButterMilk(houseBlend);
    }

}}
