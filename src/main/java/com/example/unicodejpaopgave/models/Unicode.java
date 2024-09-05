package com.example.unicodejpaopgave.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @Column(unique = true)
    private int unicode;
    private char currentCharacter;
    private String description;
    private String name;


    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(char character) {
        this.currentCharacter = character;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
