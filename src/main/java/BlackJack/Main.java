package BlackJack;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.setName("����");
        Game game = new Game(dealer);

        int i = 0;
        boolean b = true;
        while (i < 5 && b) {
            System.out.println("�������� ������? 1 - ��, 2 - ���");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            int i1 = Integer.parseInt(s);
            if (i1 == 1) {
                System.out.println("������� ��� ������");
                String name = scanner.nextLine();
                Player player = new Player();
                player.setName(name);
                game.setPlayers(player);
                i++;
            } else {
                if (i == 0) {
                    System.out.println("����� ���� �� ���� �����");
                } else {
                    b = false;
                }

            }
        }


        game.distributeCart();

        game.giveMoreCart();

        game.printVinner();


        System.out.println();


    }
}

