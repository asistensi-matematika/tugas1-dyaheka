/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;
import java.util.Scanner;
/**
 *
 * @author DIAH
 */
public class minggu1_fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double celcius , kelvin;
        double fahrenheit;
        
        System.out.println("kalkulator suhu");
        
        System.out.print("masukkan celcius =");
        celcius = input.nextDouble();
        fahrenheit = ((celcius * 1.8) + 32);
        System.out.println("maka suhu dalam fahrenheit adalah= " + fahrenheit);
        kelvin = celcius + 273;
        System.out.println("maka suhu dalam kelvin adalah =" + kelvin);
        
                
    }
}
