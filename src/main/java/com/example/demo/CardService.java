package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElse(null);
    }

    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    public Card updateCard(Long id, Card card) {
        Card existingCard = cardRepository.findById(id).orElse(null);
        if (existingCard != null) {
            existingCard.setTitle(card.getTitle());
            existingCard.setText(card.getText());
            existingCard.setCreateDate(card.getCreateDate());
            existingCard.setPhone(card.getPhone());
            return cardRepository.save(existingCard);
        } else {
            return null;
        }
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);

    }
}
