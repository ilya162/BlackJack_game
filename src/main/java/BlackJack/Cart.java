package BlackJack;

public class Cart {
    private int value;
    public String name;

    public Cart() {
    }

    public Cart(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (value != cart.value) return false;
        return name != null ? name.equals(cart.name) : cart.name == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
