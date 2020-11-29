package com.iutlaval.myapplication.Game.Cards;

import android.content.Context;

import com.iutlaval.myapplication.R;

public class Rennaissance_Constantin extends Card{
    /**
     * cree une carte est lui definit un drawable
     *
     * @param UID
     * @param c
     */
    public Rennaissance_Constantin(String UID, Context c) {
        super(UID, c);
    }

    /**
     * retourne l'indice de la texture de la photo de la carte
     *
     * @return
     */
    @Override
    public int getCardPicture() {
        return R.drawable.t_c_constantin;
    }

    /**
     * retourn le texte de la description de la carte
     *
     * @return la description
     */
    @Override
    public String getDescription() {
        return "RA: Sacrifier une autre de vos créature";
    }

    /**
     * retourne un entier coresspondant a l'attaque de la carte
     *
     * @return
     */
    @Override
    public int getAttack() {
        return 7;
    }

    /**
     * retourne la santé de la carte
     *
     * @return
     */
    @Override
    public int getHealth() {
        return 7;
    }

    /**
     * cette fonction retourne le nom de la carte qui sera afficher
     *
     * @return le nom
     */
    @Override
    public String getName() {
        return "Constantin XI, Dernier Empereur Romain";
    }

    /**
     * cette fonction retourne le coût en mana de la carte qui sera afficher
     *
     * @return le cout
     */
    @Override
    public int getCost() {
        return 5;
    }

    /**
     * cette fonction retourne le lien wikipédia de la carte qui sera afficher
     *
     * @return le lien wikipedia
     */
    @Override
    public String getWikipediaLink() {
        return "https://fr.wikipedia.org/wiki/Constantin_XI_Pal%C3%A9ologue";
    }

    /**
     * cette fonction retourne la catégorie de la carte qui sera afficher
     *
     * @return la categorie
     */
    @Override
    public String getCategorie() {
        return "Politicien, Militaire";
    }
}