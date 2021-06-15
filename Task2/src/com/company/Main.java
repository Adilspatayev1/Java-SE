package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player p1 = new Player(1, "Adil", "Spatayev", "carry");
        Player p2 = new Player(2, "Aida", "Tulegenova", "support");
        Player p3 = new Player(3, "Danyal", "Zhexsenov", "tank");
        Player p4 = new Player(4, "Rafael", "Toizhanov", "mid");
        Player p5 = new Player(5, "Alex", "Yan", "support");
        Player p6 = new Player(6, "Daniil", "Ishutin", "carry");
        Player[]players = {p1, p2, p3};
        Player[]players1 = {p4, p5, p6};
        Club club1 = new Club("Navi", "Ukrain", 4000, players);
        Club club2 = new Club("Virtus Pro", "Moscow", 4500, players1);
        Club[]clubs = {club1, club2};
        sortClub(clubs);
        System.out.println("Sorted Clubs");
        for(int i = 0;i < clubs.length;i++){
            for (int j = 0;j < clubs[i].players.length;j++){
                sortPlayers(clubs[i].players);
            }
        }
        for(int i = 0;i < clubs.length;i++){
            clubs[i].printClubData();
        }
    }

    public static Player[] sortPlayers(Player[]players){
        for(int i = 0;i < players.length - 1;i++){
            for(int j = 0;j < players.length - i - 1;j++){
                if(players[j].number < players[j + 1].number){
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        return players;
    }

    public static Club[] sortClub(Club[]clubs){
        for(int i = 0;i < clubs.length - 1;i++){
            for(int j = 0;j < clubs.length - i - 1;j++){
                if(clubs[j].ratingPoints < clubs[j + 1].ratingPoints){
                    Club temp = clubs[j];
                    clubs[j] = clubs[j + 1];
                    clubs[j + 1] = temp;
                }
            }
        }
        return clubs;
    }
}
