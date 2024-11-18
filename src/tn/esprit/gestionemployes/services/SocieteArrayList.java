package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.interfaces.IGestionT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestionT<Employe> {
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
    }
}
