package com.iutlaval.myapplication.Game.Decks;

import android.content.Context;

import com.iutlaval.myapplication.Game.Cards.Card;
import com.iutlaval.myapplication.Game.Cards.CardRegistery;
import com.iutlaval.myapplication.Game.Cards.DemoCard;
import com.iutlaval.myapplication.Game.Cards.DemoCard2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NetWorkDeck extends Deck{
    Stack<Card> cards;
    public NetWorkDeck(String deckstring, Context context)
    {
        cards = new Stack<>();
        int nbcarte=0;
        for(String s : deckstring.split(","))
        {
            Class c = CardRegistery.get(Integer.parseInt(s));
            try {
                //on utilise le bon constructeur
                Constructor con = c.getConstructor(String.class, Context.class);
                cards.add((Card) con.newInstance("nas"+nbcarte,context));
            } catch (Exception e) {
                e.printStackTrace();
                cards.add(new DemoCard("nas"+nbcarte,context));
            }
            nbcarte++;
        }
    }

    @Override
    public Stack<Card> getCards() {
        return cards;
    }

    @Override
    public String getDeckName() {
        return null;
    }
}