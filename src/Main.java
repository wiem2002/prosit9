

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();


        Employe emp1 = new Employe(1, "Wiem", "Ben Ahmed", "IT", 2);
        Employe emp2 = new Employe(2, "Sami", "Trabelsi", "Finance", 3);
        Employe emp3 = new Employe(3, "Nada", "Cherif", "Marketing", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);


        System.out.println("Liste des employés :");
        societe.displayEmploye();


        System.out.println("\nRecherche par nom 'Wiem': " + societe.rechercherEmploye("Wiem"));


        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();


        System.out.println("\nTri par nom, département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();


        societe.supprimerEmploye(emp2);
        System.out.println("\nAprès suppression de Sami :");
        societe.displayEmploye();
    }
}
