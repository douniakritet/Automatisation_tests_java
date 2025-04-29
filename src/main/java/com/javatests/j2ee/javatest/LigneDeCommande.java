package com.javatests.j2ee.javatest;

public class LigneDeCommande {
    private int id;
    private int commandeId;
    private int produitId;
    private int quantite;
    private double prixUnitaire;
    private double total;

    public LigneDeCommande(int id, int commandeId, int produitId, int quantite, double prixUnitaire) {
        this.id = id;
        this.commandeId = commandeId;
        this.produitId = produitId;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.total = quantite * prixUnitaire;
    }

    // Getters
    public int getId() { return id; }
    public int getCommandeId() { return commandeId; }
    public int getProduitId() { return produitId; }
    public int getQuantite() { return quantite; }
    public double getPrixUnitaire() { return prixUnitaire; }
    public double getTotal() { return total; }

    // Setters (avec recalcul du total)
    public void setQuantite(int quantite) {
        this.quantite = quantite;
        recalculateTotal();
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
        recalculateTotal();
    }

    // Recalcule le total
    private void recalculateTotal() {
        this.total = this.quantite * this.prixUnitaire;
    }

    // Appliquer une réduction
    public void appliquerRemisePourcentage(double pourcentage) {
        if (pourcentage >= 0 && pourcentage <= 100) {
            this.total = this.total - (this.total * pourcentage / 100);
        }
    }

    // Convertir en description textuelle
    public String description() {
        return "Commande #" + commandeId +
               ", Produit #" + produitId +
               ", Quantité : " + quantite +
               ", Prix unitaire : " + prixUnitaire +
               ", Total : " + total;
    }
}
