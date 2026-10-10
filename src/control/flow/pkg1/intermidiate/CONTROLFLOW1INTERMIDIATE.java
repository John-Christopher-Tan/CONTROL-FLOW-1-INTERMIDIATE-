/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.flow.pkg1.intermidiate;


public class CONTROLFLOW1INTERMIDIATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchaseA = 250.0,
                discountR = 0.0;

        if (purchaseA >= 500) {
            discountR = 0.15;

        } else if (purchaseA >= 200) {
            discountR = 0.10;

        } else if (purchaseA >= 100) {
            discountR = 0.05;

        } else {
            discountR = 0.00;
        }

        double finalP = purchaseA - (purchaseA * discountR);

        System.out.println("Purchase Amount: $" + purchaseA);

        System.out.println("Discount Tier: " + (discountR * 100) + "%");

        System.out.println("Final Price: $" + finalP);
    }
    
}
