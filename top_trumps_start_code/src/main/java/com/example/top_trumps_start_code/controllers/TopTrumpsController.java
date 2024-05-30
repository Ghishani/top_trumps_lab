package com.example.top_trumps_start_code.controllers;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {

    @Autowired
    private TopTrumpsService topTrumpsService;

    @PostMapping
    public ResponseEntity<Reply> newGame(){
        Reply reply = topTrumpsService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Reply> getGameStatus(){
        Reply reply;

        if(topTrumpsService.getCards() == null) {
            reply = new Reply("Game has not been started");
        } else {
            reply = new Reply("Game in progress");
        }
        return new ResponseEntity<>(reply,HttpStatus.OK);
    }
    }

