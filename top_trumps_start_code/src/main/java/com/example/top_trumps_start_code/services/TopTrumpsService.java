package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    private Card card1;
    private Card card2;
    private ArrayList<Card> cards;

    public TopTrumpsService(){

    }

    public Reply startNewGame(){
        this.cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        return new Reply("Game has started");

    }

    public Reply checkWinner(Card card1, Card card2) {
        Reply reply;
        if (card1.getCardValue() > card2.getCardValue()) {
            reply = new Reply(
                    String.format("%s of %s wins", card1.getRank(), card1.getSuit()));
            return reply;
        } else if (card2.getCardValue() > card1.getCardValue()) {
            reply = new Reply(
                    String.format("%s of %s wins", card2.getRank(), card2.getSuit()));
            return reply;
        } else {
            reply = new Reply("It's a tie!");
            return reply;
        }

    }

    public int countCards(){
        return this.cards.size();
    }

    //Getters and Setters
    public Card getCard1() {
        return card1;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }

    public Card getCard2() {
        return card2;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
