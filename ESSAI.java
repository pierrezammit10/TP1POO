/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tp;

/**
 *
 * @author Pierre
 */
public class ESSAI 
{
    public static void main(String[] args)
    {
        //correction de l'erreur 1 
        int i=0;
        for(i=0;i<5;i++)
        {
            System.out.print(i+",");
            System.out.printf("\n");
        }
        //correction de l'erreur 2
        //Correction de la forme de Math.sqrt
        float a = 3;
        double b = 4; 
        float c;
        c=(float) Math.sqrt(a*a+b*b);
        System.out.println("c="+c);
        //correction de l'erreur 3
        // b4 > 128 donc impossible à compiler
        byte b2 = 42;
        char c2 = 'a';
        short s=1024;
        int i2 = 50000;
        float f=5.67f;
        double d = .1234;
        double resultat = (f*b2)+(i2/c2)-(d*s);
        System.out.print((f*b2)+"+"+(i/c)+"-"+(d*s));
        System.out.println("=" + resultat);
        byte b3 = 2;
        byte b4 = (byte) (b3*b2);
        System.out.println("b4=" + b4);
    }
}
