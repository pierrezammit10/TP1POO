/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Pierre
 */
public class TestEtudiant {

    public static void main(String[] args)
    {
        //Declaration de deux objets Etudiant
        Etudiant Jean = new Etudiant("E1", "jean", "kevin");
        Etudiant Boby = new Etudiant("E2","Boby","opaque");
        //Pour eviter le probleme on utilise un get/set permettant l'utilisation de l'objet
        //Declaration d'un entier et d'un tableau de flottant
        Scanner sc = new Scanner(System.in);
        int i=0;
        //Saisie clavier donnant la valeur de l'entier uniquement positive
        do
        {
            System.out.println("Tappez un entier");
            i= sc.nextInt();
        }
        while(i<=0);
        //Instanciation d'un tableau avec pour taille l'entier saisi precedemment
        float[] tab = new float[i];
        for(i=0; i< tab.length; i++)
        {       
            System.out.println("Mettez une valeur");
            tab[i]=sc.nextFloat();
        }
        //Saisie clavier de l'id, du nom et du prenom
        System.out.println("Mettez un identifiant");
        String id = sc.next();
        
        System.out.println("Mettez un nom");
        String nm = sc.next();
        
        System.out.println("Mettez un prenom");
        String pm = sc.next();
        
        Etudiant E2 = new Etudiant(id,nm,pm);
        
        E2.setNotes(tab);

        for(i =0; i< E2.getNotes().length;i++){
            System.out.println(E2.getNotes()[i]);
        }
        //Mettre les valeurs par ordre croissantes
        System.out.println("Le tableau par ordre croissant est ? ");
        //trier le tableau
        Arrays.sort(tab);
        //afficher tous les entiers après le tri
        for(i =0; i< E2.getNotes().length;i++)
        {
        System.out.println("nombre: " + E2.getNotes()[i]);   
        }
        //  /!\ erreur pour determiner vmax et vmin non resolu
        /*System.out.println("Affichage de la valeur max et min");
        //Declaration
        float maxVal = Float.MAX_VALUE;
        float minVal = Float.MIN_VALUE;
        //Trouver la valeur max et min via boucle for
        for(i=0; i<=E2.getNotes().length; i++)
        {
            if(E2.getNotes()[i]<maxVal)
            {
                maxVal = E2.getNotes()[i];
            }
            if(E2.getNotes()[i]>minVal)
            {
                minVal = E2.getNotes()[i];
            }
        
        }   
        //affichage des valeurs
        System.out.println("\nValeur minimale = "+maxVal);
        System.out.println("\nValeur maximale = "+minVal);
        */
        //Remplissage aléatoire du tableau
        System.out.println("Mode aléatoire");
        for(i=0;i< E2.getNotes().length; i++){
        E2.setNotesIndice(i,(float) Math.random());
        }
        
        for(i =0; i< E2.getNotes().length;i++){
            System.out.println(E2.getNotes()[i]);
        }
        
        
        
    }
}