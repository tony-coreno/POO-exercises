package Conversor;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Conversor c1;

        float lado1;
        float lado2;

        try{
            lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado1: "));
            lado2 = Float.parseFloat((JOptionPane.showInputDialog("Ingrese lado2: ")));


            if (lado1 == lado2){
                c1 = new Conversor(lado1);
                System.out.println("El perímetro es: "+c1.getLado1());
                System.out.println("El área es: "+c1.getLado2());

            }
            else {
                c1 = new Conversor(lado1, lado2);
                System.out.println("El perímetro es: "+c1.getLado1());
                System.out.println("El área es: "+c1.getLado2());
            }




        }catch (Exception e){
            System.out.println(e);
        }


    }


}
