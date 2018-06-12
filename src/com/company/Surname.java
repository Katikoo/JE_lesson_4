package com.company;

public enum Surname {

    ABRAMS(0),
    FABER(1),
    ELMER(2),
    NELSON(3),
    ADRIAN(4),
    ELISHA(5);

    int value;

    Surname(int value) {
        this.value = value;
    }
}