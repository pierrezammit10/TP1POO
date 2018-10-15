/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tp;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Pierre
 */
public class Etudiant {

    /**
     * @return the notes
     */
    //Cration de méthode offertes permettant l'accessibilité depuis l'exterieur de l'objet par get et set
    public float[] getNotes() {
        return notes;
    }

    /**
     * @param aNotes the notes to set
     */
    public void setNotes(float[] aNotes) {
        notes = aNotes;
    }
    
    public void setNotesIndice(int indice,float value) {
        notes[indice] = value;
    }

    /**
     * @return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * @return the Prenom
     */
    public String getPrenom() {
        return Prenom;
    }

    /**
     * @param Prenom the Prenom to set
     */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    //Declaration
    private String Identifiant;
    private float notes[];
    private String Nom;
    private String Prenom;
    
    public Etudiant (String id, String nm, String pm){
        this.Identifiant=id;
        this.Prenom=pm;
        this.Nom = nm;
        
    }
    //Constructeur permettant l'initialisation
    public Etudiant(){
        Identifiant = null;
        Nom = null;
        Prenom = null;
    }
    //Constructeur permettant l'identification de la taille du tableau 
    public Etudiant(int taille)
    {
        notes = new float[taille];
    
    }
    
    public void modifier(String ident, String Pre, String Nm)
    {
        this.setid(ident);
        this.setNom(Nm);
        this.setPrenom(Pre);
    }

    public String getid()
    {
        return Identifiant;
    }
    public String getnom()
    {
        return getNom();
    }
    public String getprenom()
    {
        return getPrenom();
    }
    public void setid(String id)
    {
        this.Identifiant= id;

    }
    //Méthode toString de type String retourne l’expression composée de l’identifiant, 
    //du nom et du prénom séparés par un espace
    public String toString(){

        return new String("L'etudiant est :" + Prenom + " et le nom est " + Nom + " et l'id "+Identifiant);
    }
    
    

}
