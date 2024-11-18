package tn.esprit.gestionemployes.interfaces;

public interface IGestionT<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId();
    void trierEmployeParNomDépartementEtGrade();
}
