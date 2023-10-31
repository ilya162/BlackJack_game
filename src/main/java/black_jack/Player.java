package black_jack;


import java.util.Arrays;

public class Player {
    private String name;
    private Card[] cards = new Card[10];

    public Player() {
    }

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] carts) {
        this.cards = cards;
    }

    public void setCards(Card card) {
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = card;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (name != null ? !name.equals(player.name) : player.name != null) return false;

        return Arrays.equals(cards, player.cards);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(cards);
        return result;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }

    public int getValue() {
        int res = 0;
        for (Card card : cards) {
            if (card != null) {
                res += card.getValue();

            }
        }

        return res;
    }


    public void printCart() {
        for (Card cart : cards) {
            if (cart != null)
                System.out.println(cart);

        }
    }
}

