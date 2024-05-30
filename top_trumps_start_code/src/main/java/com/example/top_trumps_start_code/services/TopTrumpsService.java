package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    private Card card;
    private String pickedCard;
    private ArrayList<Card> cards;

    public TopTrumpsService(){

    }

    public Reply startNewGame(){
        return new Reply(this.pickedCard,
                String.format(""));
    }

}
