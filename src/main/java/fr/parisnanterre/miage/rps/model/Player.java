package fr.parisnanterre.miage.rps.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String Nom;
    public int Score;
    public ArrayList<RPSEnum> Liste;

    public void construct(String nom, ArrayList<RPSEnum> liste) {
    }

    public void construct2(String nom) {
    }
    private static RPSEnum generateFor (int nb) {
        switch(nb) {
            case 0: return RPSEnum.ROCK;
            case 1: return RPSEnum.PAPER;
            default: return RPSEnum.SCISSORS;
        }
    }
    private static RPSEnum generatePlay() {
        int x = (int) (Math.random() * 3);
        return generateFor(x);
    }

    public static List<RPSEnum> generatePlays(int taille) {
        List<RPSEnum> rtr = new ArrayList<>(taille);
        for(int i = 0; i<taille; i++) {
            rtr.add(generatePlay());
        }
        return rtr;
    }
}
