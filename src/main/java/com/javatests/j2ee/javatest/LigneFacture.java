package com.javatests.j2ee.javatest;

import java.util.ArrayList;
import java.util.List;

public class LigneFacture {
    private List<String> lignes;

    public LigneFacture() {
        this.lignes = new ArrayList<>();
    }

    public boolean addLigne(String ligne) {
        if (ligne == null || ligne.isEmpty()) {
            return false;
        }
        return lignes.add(ligne);
    }

    public boolean removeLigne(String ligne) {
        return lignes.remove(ligne);
    }

    public List<String> getLignes() {
        return new ArrayList<>(lignes);
    }

    public void clear() {
        lignes.clear();
    }

    public int getLigneCount() {
        return lignes.size();
    }
}
