package BlackJack;

import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private Player[] players = new Player[5];
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

    public void distributeCart() {
        dealer.setCarts(coloda.getRandomCart());
        dealer.setCarts(coloda.getRandomCart());

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                players[i].setCarts(coloda.getRandomCart());
                players[i].setCarts(coloda.getRandomCart());
            }
        }
    }

    public void giveMoreCart() {
        while (dealer.getValue() <= 17) {
            dealer.setCarts(coloda.getRandomCart());
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                boolean reise = true;
                while (reise) {
                    System.out.println("Игрок " +  " " + players[i].getName());
                    players[i].printCart();
                    System.out.println("Всего очков- " + players[i].getValue());
                    System.out.println("Нужны еще карты? 1 - да 2 - нет");
                    Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    if (s.equals("1")) {
                        players[i].setCarts(coloda.getRandomCart());
                        System.out.println();
                    } else if (s.equals("2")) {
                        reise = false;
                    } else {
                        System.out.println("Нажмите 1 или 2");
                    }

                }

            }
        }
    }

    public void printVinner() {
        String vinner = "Дилер";
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() <= 21) {
                    vinner = "";
                    break;
                }
            }
        }
        if (vinner == "Дилер") {
            System.out.println("Выиграл дилер " + dealer.getName());
            dealer.printCart();
            System.out.println("У дилера " + dealer.getName() + " " + dealer.getValue() + "очков");
            return;
        }

        String win = "";
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() == 21) {
                    win += player.getName() + " ";
                }


            }
        }
        if (dealer.getValue() == 21) {
            win += dealer.getName() + " ";
        }
        if (!win.equals("")) {
            System.out.println("Выиграл " + win);
            System.out.println("Карты дилера:");
            dealer.printCart();
            return;
        }

        for (Player player : players) {
            if (player != null) {
                boolean b = dealer.getValue() >= player.getValue();
                if (player.getValue() < 21) {

                } else if (b) {
                    System.out.println("Выиграл дилер " + dealer.getName());
                    dealer.printCart();
                    System.out.println("У дилера " + dealer.getName() + " " + dealer.getValue() + "очков");

                    return;
                } else {
                    System.out.println("Выиграл  " + player.getName());
                    System.out.println("Карты дилера:");
                    dealer.printCart();
                    System.out.println("У дилера " + dealer.getName() + " " + dealer.getValue() + "очков");
                }

            }


        }
        int max = 0;
        for (Player player : players) {
            if (player != null) {
                if (player.getValue() < 21) {
                    if (max < player.getValue()) {
                        max = player.getValue();
                    }
                }
            }

        }
        if (max > dealer.getValue()) {
            for (Player player : players) {
                if (player != null) {
                    if (player.getValue() == max) {
                        System.out.println("Выиграл " + player.getName());
                        System.out.println("Карты дилера:");
                        dealer.printCart();
                        return;
                    }
                }
            }
        } else {
            System.out.println("Выиграл дилер " + dealer.getName());
            System.out.println("Карты дилера:");
            dealer.printCart();
            System.out.println("У дилера " + dealer.getName() + " " + dealer.getValue() + " " + "очков");
            return;
        }

    }
}



