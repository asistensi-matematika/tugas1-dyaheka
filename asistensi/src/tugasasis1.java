/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DIAH
 */
public class tugasasis1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        int c, b, a, x, y, akar_polinom1, akar_polinom2, m = 0, titik_stastioner, kecekungan, nilai_minimum,diskriminan;
        System.out.println("Polinom derajat dua");
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                
                if(a!=0){
                    System.out.println("polinom="+a+"x^2 +"+b+"x+" +c);
                    
                    diskriminan= (b^2)-(4*a*c);
                    System.out.println("(1)"+ "diskriminan ="+ diskriminan);
                    akar_polinom1 = -b + (((b^2)-(4*a*c))^(1/2));
                    akar_polinom2 = b + (((b^2)-(4*a*c))^(1/2));
                    
                    System.out.println("(2)"+ "akar akar dari polinom adalah =" +akar_polinom1+"dan" +akar_polinom2);
                    
                if(m==0){
                    x = -b / (2*a);
                    y = ((b / (2*a)) / (4*a));
                    System.out.println("(3)" + " titik_stasioner =" + "(" +x+ "," +y+ ")");
                    
                if (a>0){
                    System.out.println("(4.1)" + " kecekungan kurva ke atas");
                }
                if (a<0){
                    System.out.println ("(4.2)" + "kecekungan kurva ke bawah");
                }
                System.out.println ("(5)" + "nilai_minimum = " + y);
                }}
                else if (a==0){
                    System.out.println("nilai a tidak boleh = 0");
                 
                }
    }
                }
          
              
    

