package black_jack;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.setName("Vasya");
        Game game = new Game(dealer);

        int i = 0;
        boolean b = true;
        while (i < 5 && b) {
            System.out.println("Add a Player? 1 - YES, 2 - NO");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            int i1 = Integer.parseInt(s);
            if (i1 == 1) {
                System.out.println("Enter the player's name");
                String name = scanner.nextLine();
                Player player = new Player();
                player.setName(name);
                game.setPlayers(player);
                i++;
            } else {
                if (i != 1) {
                    System.out.println("Enter 1 or 2 to select");
                    System.out.println("At least one player is needed");
                }
                b = false;
            }
        }


        game.distributeCard();

        game.giveMoreCard();

        game.printVinner();


        System.out.println();


    }
}

