package black_jack;

import java.util.Random;

public class Coloda {
    private Card[] Cards = new Card[52];

    public Coloda() {
        Cards[0] = new Card(1, "Ace of clubs");
        Cards[1] = new Card(1, "Ace of spades");
        Cards[2] = new Card(1, "Ace of hearts");
        Cards[3] = new Card(1, "Ace of diamonds");
        Cards[4] = new Card(10, "King of clubs");
        Cards[5] = new Card(10, "King of spades");
        Cards[6] = new Card(10, "King of hearts");
        Cards[7] = new Card(10, "King of diamonds");
        Cards[8] = new Card(10, "Queen  of clubs");
        Cards[9] = new Card(10, "Queen of spades");
        Cards[10] = new Card(10, "Queen of hearts");
        Cards[11] = new Card(10, "Queen of diamonds");
        Cards[12] = new Card(10, "Jack  of clubs");
        Cards[13] = new Card(10, "Jack of spades");
        Cards[14] = new Card(10, "Jack of  hearts");
        Cards[15] = new Card(10, "Jack of diamonds");
        Cards[16] = new Card(10, "Ten of clubs");
        Cards[17] = new Card(10, "Ten of spades");
        Cards[18] = new Card(10, "Ten of hearts");
        Cards[19] = new Card(10, "Ten of diamonds");
        Cards[20] = new Card(9, "Nine of clubs");
        Cards[21] = new Card(9, "Nine of spades");
        Cards[22] = new Card(9, "Nine of hearts");
        Cards[23] = new Card(9, "Nine of diamonds");
        Cards[24] = new Card(8, "Eight of clubs");
        Cards[25] = new Card(8, "Eight of spades");
        Cards[26] = new Card(8, "Eight of hearts");
        Cards[27] = new Card(8, "Eight of diamonds");
        Cards[28] = new Card(7, "Seven of clubs");
        Cards[29] = new Card(7, "Seven of spades");
        Cards[30] = new Card(7, "Seven of hearts");
        Cards[31] = new Card(7, "Seven of diamonds");
        Cards[32] = new Card(6, "Six of clubs");
        Cards[33] = new Card(6, "Six of spades");
        Cards[34] = new Card(6, "Six of hearts");
        Cards[35] = new Card(6, "Six of diamonds");
        Cards[36] = new Card(5, "Five of clubs");
        Cards[37] = new Card(5, "Five of spades");
        Cards[38] = new Card(5, "Five of hearts");
        Cards[39] = new Card(5, "Five of diamonds");
        Cards[40] = new Card(4, "Four of clubs");
        Cards[41] = new Card(4, "Four of spades");
        Cards[42] = new Card(4, "Four of hearts");
        Cards[43] = new Card(4, "Four of diamonds");
        Cards[44] = new Card(3, "Three of clubs");
        Cards[45] = new Card(3, "Three of spades");
        Cards[46] = new Card(3, "Three of hearts");
        Cards[47] = new Card(3, "Three of diamonds");
        Cards[48] = new Card(2, "Two of clubs");
        Cards[49] = new Card(2, "Two of spades");
        Cards[50] = new Card(2, "Two of hearts");
        Cards[51] = new Card(2, "Two of diamonds");
    }

    public Card getRandomCard() {
        Random r = new Random();
        return Cards[r.nextInt(52)];
    }
}
