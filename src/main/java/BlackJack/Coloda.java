package BlackJack;

import java.util.Random;

public class Coloda {
    private Cart[] Carts = new Cart[52];

    public Coloda() {
        Carts[0] = new Cart(1, "Туз крести");
        Carts[1] = new Cart(1, "Туз пики");
        Carts[2] = new Cart(1, "Туз черви");
        Carts[3] = new Cart(1, "Туз буби");
        Carts[4] = new Cart(10, "Король крести");
        Carts[5] = new Cart(10, "Король пики");
        Carts[6] = new Cart(10, "Король черви");
        Carts[7] = new Cart(10, "Король буби");
        Carts[8] = new Cart(10, "Дама крести");
        Carts[9] = new Cart(10, "Дама пики");
        Carts[10] = new Cart(10, "Дама черви");
        Carts[11] = new Cart(10, "Дама буби");
        Carts[12] = new Cart(10, "Валет крести");
        Carts[13] = new Cart(10, "Валет пики");
        Carts[14] = new Cart(10, "Валет черви");
        Carts[15] = new Cart(10, "Валет буби");
        Carts[16] = new Cart(10, "Десять крести");
        Carts[17] = new Cart(10, "Десять пики");
        Carts[18] = new Cart(10, "Десять черви");
        Carts[19] = new Cart(10, "Десять буби");
        Carts[20] = new Cart(9, "Девять крести");
        Carts[21] = new Cart(9, "Девять пики");
        Carts[22] = new Cart(9, "Девять черви");
        Carts[23] = new Cart(9, "Девять буби");
        Carts[24] = new Cart(8, "Восемь крести");
        Carts[25] = new Cart(8, "Восемь пики");
        Carts[26] = new Cart(8, "Восемь черви");
        Carts[27] = new Cart(8, "Восемь буби");
        Carts[28] = new Cart(7, "Семь крести");
        Carts[29] = new Cart(7, "Семь пики");
        Carts[30] = new Cart(7, "Семь черви");
        Carts[31] = new Cart(7, "Семь буби");
        Carts[32] = new Cart(6, "Шесть крести");
        Carts[33] = new Cart(6, "Шесть пики");
        Carts[34] = new Cart(6, "Шесть черви");
        Carts[35] = new Cart(6, "Шесть буби");
        Carts[36] = new Cart(5, "Пять крести");
        Carts[37] = new Cart(5, "Пять пики");
        Carts[38] = new Cart(5, "Пять черви");
        Carts[39] = new Cart(5, "Пять буби");
        Carts[40] = new Cart(4, "Четыре крести");
        Carts[41] = new Cart(4, "Четыре пики");
        Carts[42] = new Cart(4, "Четыре черви");
        Carts[43] = new Cart(4, "Четыре буби");
        Carts[44] = new Cart(3, "Три крести");
        Carts[45] = new Cart(3, "Три пики");
        Carts[46] = new Cart(3, "Три черви");
        Carts[47] = new Cart(3, "Три буби");
        Carts[48] = new Cart(2, "Два крести");
        Carts[49] = new Cart(2, "Два пики");
        Carts[50] = new Cart(2, "Два черви");
        Carts[51] = new Cart(2, "Два буби");
    }

    public Cart getRandomCart() {
        Random r = new Random();
        return Carts[r.nextInt(52)];
    }
}
