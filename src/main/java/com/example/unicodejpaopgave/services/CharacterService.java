package com.example.unicodejpaopgave.services;

import com.example.unicodejpaopgave.models.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CharacterService {

    @Autowired
    private UnicodeRepository unicodeRepository;

    public void putUnicodeInDB() {
        Set<Character> allChars = new HashSet<>();
        int n = 0;
        char charValue = (char) n;
        Unicode unicode = new Unicode();

        while (allChars.add(charValue)) {
            unicode.setUnicode(n);
            unicode.setCurrentCharacter(charValue);
            unicode.setName(Character.getName(n));
            unicode.setDescription(checkCharType(charValue));

            unicodeRepository.save(unicode);
            n++;
            charValue = (char) n;
        }
    }

    private String checkCharType(Character charValue) {
        String charType;

        if (Character.isLetter(charValue)) {
            charType = "Letter";
        } else if (Character.isDigit(charValue)) {
            charType = "Digit";
        } else if (Character.isEmoji(charValue)) {
            charType = "Emoji";
        } else {
            charType = null;
        }

        return charType;
    }


    public List<Character> getCharsFromInt(char c, int i) {
        List<Character> charList = new ArrayList<>();
        for (int n = 0; n < i; n++) {
            charList.add(c);
        }
        return charList;
    }
}
