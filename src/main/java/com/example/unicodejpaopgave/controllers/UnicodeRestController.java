package com.example.unicodejpaopgave.controllers;

import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import com.example.unicodejpaopgave.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnicodeRestController {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Autowired
    private CharacterService characterService;

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode: " + i + " = char: " + c;
    }

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int i = c;
        return "char: " + c + " = unicode: " + i;
    }

    @GetMapping("/unicode/{c}/{i}")
    public List<Character> getCharsFromInt(@PathVariable char c, @PathVariable int i) {
        return characterService.getCharsFromInt(c, i);
    }



}
