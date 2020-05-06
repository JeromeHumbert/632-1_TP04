/**
 * Write a description of class Voiture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Voiture
{
    // instance variables - replace the example below with your own
    private String marque;
    private String modele;
    private int annee;
    private String plaqueImmatriculation;
    private int anneeRevision;

    /**
     * Constructor for objects of class Voiture
     */
    public Voiture(String marque, String modele, int annee, String plaqueImmatriculation, int anneeRevision)
    {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.plaqueImmatriculation = plaqueImmatriculation;
        this.anneeRevision = anneeRevision;
    }    
    
    public Voiture(String plaqueImmatriculation){
        this.plaqueImmatriculation = plaqueImmatriculation;
    }
    
    public void faireRevision(){
        this.anneeRevision = 2020;
    }
    
    public boolean equals(Object o){
        if (((Voiture)o).plaqueImmatriculation.equals(plaqueImmatriculation)){
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        return marque + " " + modele + " de " + annee + " - " + plaqueImmatriculation + " Année de révision : " + anneeRevision;
    }
    
    
}
