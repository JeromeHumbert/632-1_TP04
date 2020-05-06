import java.util.ArrayList;
/**
 * Write a description of class ConcessionVoiture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Garage
{
    // instance variables - replace the example below with your own
    private ArrayList<Voiture> listeVoiture = new ArrayList<>();

    public void entreeVoiture(Voiture v)
    {
        listeVoiture.add(v);
    }
    
    public void sortieVoiture(Voiture v){
        listeVoiture.remove(v);
    }
    
    public void reviserToutesLesVoitures(){
        for (Voiture v : listeVoiture){
            v.faireRevision();
        }
    }
    
    public void afficherVoitures(){
        for (Voiture v : listeVoiture){
            System.out.println(v);
        }
    }
    
    public void voiturePresente(String plaqueImmatriculation){
        Voiture voiture = new Voiture(plaqueImmatriculation);
        String result = "La voiture ayant la plaque " + plaqueImmatriculation + " n'est pas présente."; 
        for (Voiture v : listeVoiture){
            if(v.equals(voiture)){
                result = v + " est présente dans le garage.";
                break;
            }
        }
        System.out.println(result);
    }
}
