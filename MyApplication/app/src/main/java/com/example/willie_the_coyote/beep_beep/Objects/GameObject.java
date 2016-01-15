package com.example.willie_the_coyote.beep_beep.Objects;

public class GameObject{

    public GameObject(int level, String letter1, String letter2, String letter3, String letter4, String word){
        this.Level = level;
        this.Letter1 = letter1;
        this.Letter2 = letter2;
        this.Letter3 = letter3;
        this.Letter4 = letter4;
        this.Word = word;
    }
    public int Level;

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String Letter1;

    public String getLetter1() {
        return Letter1;
    }

    public void setLetter1(String letter1) {
        Letter1 = letter1;
    }

    public String Letter2;

    public String getLetter2() {
        return Letter2;
    }

    public void setLetter2(String letter2) {
        Letter2 = letter2;
    }

    public String Letter3;

    public String getLetter3() {
        return Letter3;
    }

    public void setLetter3(String letter3) {
        Letter3 = letter3;
    }

    public String Letter4;

    public String getLetter4() {
        return Letter4;
    }

    public void setLetter4(String letter4) {
        Letter4 = letter4;
    }

    public String Word;

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }
}