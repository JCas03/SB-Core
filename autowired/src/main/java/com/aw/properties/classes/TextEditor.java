package com.aw.properties.classes;

import com.aw.settermethods.classes.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("Inside TextEditor constructor." );
    }
    public SpellChecker getSpellChecker( ){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}