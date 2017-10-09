package com.company;

public enum PositionTitle {

    ADMINISTRATION("administration"),

    PRODUCTON("producton"),

    SALES("sales"),

    MAINTENANCE("maintenance"),

    TECHNICAL("technical"),

    SECRETARIAL("secretarial");

    private String position;


    PositionTitle(String position) {
        this.position =
                position;
}


    @Override
    public String toString() {
        return position;
    }
}


