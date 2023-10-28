package BlackJack;

import java.util.Arrays;

public class Dealer {
    private String name;
    private Cart[] carts = new Cart[10];

    public Dealer() {
    }

    public Dealer(String name, Cart[] carts) {
        this.name = name;
        this.carts = carts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }


    public void setCarts(Cart cart) {
        for (int i = 0; i < this.carts.length; i++) {
            if (this.carts[i] == null) {
                this.carts[i] = cart;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dealer deller = (Dealer) o;

        if (name != null ? !name.equals(deller.name) : deller.name != null) return false;
        return Arrays.equals(carts, deller.carts);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(carts);
        return result;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name + '\'' +
                ", carts=" + Arrays.toString(carts) +
                '}';
    }

    public void printCart() {
        for (Cart cart : carts) {
            if (cart != null)
                System.out.println(cart);
        }
    }

    public int getValue() {
        int res = 0;
        for (Cart cart : carts) {
            if (cart != null) {
                res += cart.getValue();
            }
        }
        return res;
    }
}