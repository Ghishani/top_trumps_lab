package com.example.top_trumps_start_code.models;

public class Reply {

    private Card pickedCard;
    private String message;

    public Reply(Card pickedCard, String message){
        this.pickedCard = pickedCard;
        this.message = message;
    }

    public Reply(){

    }

    public Card getPickedCard() {
        return pickedCard;
    }

    public void setPickedCard(Card pickedCard) {
        this.pickedCard = pickedCard;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
