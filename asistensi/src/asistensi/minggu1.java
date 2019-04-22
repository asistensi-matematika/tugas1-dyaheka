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
public class minggu1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
    String nama, hobby;
    int umur;
    System.out.print("nama ");
    nama = input.next();
    System.out.print("umur ");
    umur = input.nextInt();
    System.out.print("hobby ");
    hobby = input.next();
            
    System.out.println("nama saya adalah " + nama + "umur saya adalah " + umur + "dan hobby saya adalah " + hobby);
    
    }
}
