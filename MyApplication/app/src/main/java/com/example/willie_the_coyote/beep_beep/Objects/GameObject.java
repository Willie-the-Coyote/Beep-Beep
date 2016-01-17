package com.example.willie_the_coyote.beep_beep.Objects;

import java.util.ArrayList;

public class GameObject{

    public GameObject(int level, ArrayList<String> letters, ArrayList<String> words, ArrayList<Boolean> guessedWords, int difficulty){
        this.Level = level;
        this.Letters = letters;
        this.Words = words;
        this.guessedWords = guessedWords;
        this.Dificulty = difficulty;

    }
    public int Level;

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public ArrayList<String> Letters;

    public ArrayList<String> getLetters(){return Letters;}

    public void setLetters(ArrayList<String> letters) {
        Letters = letters;
    }

    public ArrayList<String> Words;

    public ArrayList<String> getWords() {
        return Words;
    }

    public void setWords(ArrayList<String> words) {
        Words = words;
    }

    public ArrayList<Boolean> guessedWords;

    public ArrayList<Boolean> getGuessedWords() {
        return guessedWords;
    }

    public void setGuessedWords(ArrayList<Boolean> guessedWords) {
        this.guessedWords = guessedWords;
    }

    public int Dificulty;

    public int getDificulty() {
        return Dificulty;
    }

    public void setDificulty(int dificulty) {
        Dificulty = dificulty;
    }
}