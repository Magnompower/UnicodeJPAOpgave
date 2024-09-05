package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitData implements CommandLineRunner {

    @Autowired
    private CharacterService characterService;

    @Override
    public void run(String... args) throws Exception {
        characterService.putUnicodeInDB();
    }
}
