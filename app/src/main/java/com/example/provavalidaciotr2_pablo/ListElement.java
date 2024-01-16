package com.example.provavalidaciotr2_pablo;


public class ListElement {
    public String color;
    public String name;
    public String lobby;

    public ListElement(String color, String name, String lobby) {
        this.color = color;
        this.name = name;
        this.lobby = lobby;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLobby() {
        return lobby;
    }

    public void setLobby(String lobby) {
        this.lobby = lobby;
    }


}
