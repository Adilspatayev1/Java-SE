package com.company;

public class Club {
    public String name;
    public String country;
    public int ratingPoints;
    public Player[]players;

    public Club() {
    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println(name + " " + country + " " + ratingPoints + "\nPlayers: ");
        for(int i = 0;i < players.length;i++){
            System.out.println(players[i]);
        }
    }
}
