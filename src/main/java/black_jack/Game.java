package black_jack;

import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private Player[] players = new Player[1];
    private Coloda coloda = new Coloda();

    public Game(Dealer dealer) {
        this.dealer = dealer;
    }

    public void setPlayers(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                this.players[i] = player;
                return;
            }
        }
    }

    public void distributeCard() {
        dealer.setCards(coloda.getRandomCard());
        dealer.setCards(coloda.getRandomCard());

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                players[i].setCards(coloda.getRandomCard());
                players[i].setCards(coloda.getRandomCard());
            }
        }
    }

    public void giveMoreCard() {
        while (dealer.getValue() <= 17) {
            dealer.setCards(coloda.getRandomCard());
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                boolean reise = true;
                while (reise) {
                    System.out.println("Player " + players[i].getName());
                    players[i].printCart();
                    System.out.println("Total points- " + players[i].getValue());
                    System.out.println("Need more cards? 1 - YES 2 - NO");
                    Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    if (s.equals("1")) {
                        players[i].setCards(coloda.getRandomCard());
                        System.out.println();
                    } else if (s.equals("2")) {
                        reise = false;
                    } else {
                        System.out.println("Click 1 or 2");
                    }

                }

            }
        }
    }

    public void printVinner() {

        for (Player player : players) {
            if (player != null) {
                if (player.getValue() <= 21 && dealer.getValue() > player.getValue() && dealer.getValue() <= 21) {
                    System.out.println("The dealer " + dealer.getName() + " won");
                    dealer.printCard();
                    System.out.println("The dealer  " + dealer.getName() + " has " + dealer.getValue() + "  points");

                }
            }

        }
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() <= 21) {
                    if (dealer.getValue() < player.getValue() || dealer.getValue() > 21) {
                        System.out.println("Player " + player.getName() + " won");
                        System.out.println("Dealer's cards:");
                        dealer.printCard();
                        System.out.println("Dealer's points: " + dealer.getValue());

                    }
                }

            }
        }
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() == dealer.getValue()) {
                    System.out.println("The dealer " + dealer.getName() + " won");
                    dealer.printCard();
                    System.out.println("The dealer  " + dealer.getName() + " has " + dealer.getValue() + "  points");

                }
            }

        }
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() > 21) {
                    if (player.getValue() > dealer.getValue()) {
                        System.out.println("The dealer " + dealer.getName() + " won");
                        dealer.printCard();
                        System.out.println("The dealer  " + dealer.getName() + " has " + dealer.getValue() + "  points");
                    } else {
                        System.out.println("Player " + player.getName() + " won");
                        System.out.println("Dealer's cards:");
                        dealer.printCard();
                        System.out.println("Dealer's points: " + dealer.getValue());

                    }
                }
            }

        }
    }
}





