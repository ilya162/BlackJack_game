package BlackJack;

import java.util.Random;

public class Coloda {
    private Cart[] Carts = new Cart[52];

    public Coloda() {
        Carts[0] = new Cart(1, "��� ������");
        Carts[1] = new Cart(1, "��� ����");
        Carts[2] = new Cart(1, "��� �����");
        Carts[3] = new Cart(1, "��� ����");
        Carts[4] = new Cart(10, "������ ������");
        Carts[5] = new Cart(10, "������ ����");
        Carts[6] = new Cart(10, "������ �����");
        Carts[7] = new Cart(10, "������ ����");
        Carts[8] = new Cart(10, "���� ������");
        Carts[9] = new Cart(10, "���� ����");
        Carts[10] = new Cart(10, "���� �����");
        Carts[11] = new Cart(10, "���� ����");
        Carts[12] = new Cart(10, "����� ������");
        Carts[13] = new Cart(10, "����� ����");
        Carts[14] = new Cart(10, "����� �����");
        Carts[15] = new Cart(10, "����� ����");
        Carts[16] = new Cart(10, "������ ������");
        Carts[17] = new Cart(10, "������ ����");
        Carts[18] = new Cart(10, "������ �����");
        Carts[19] = new Cart(10, "������ ����");
        Carts[20] = new Cart(9, "������ ������");
        Carts[21] = new Cart(9, "������ ����");
        Carts[22] = new Cart(9, "������ �����");
        Carts[23] = new Cart(9, "������ ����");
        Carts[24] = new Cart(8, "������ ������");
        Carts[25] = new Cart(8, "������ ����");
        Carts[26] = new Cart(8, "������ �����");
        Carts[27] = new Cart(8, "������ ����");
        Carts[28] = new Cart(7, "���� ������");
        Carts[29] = new Cart(7, "���� ����");
        Carts[30] = new Cart(7, "���� �����");
        Carts[31] = new Cart(7, "���� ����");
        Carts[32] = new Cart(6, "����� ������");
        Carts[33] = new Cart(6, "����� ����");
        Carts[34] = new Cart(6, "����� �����");
        Carts[35] = new Cart(6, "����� ����");
        Carts[36] = new Cart(5, "���� ������");
        Carts[37] = new Cart(5, "���� ����");
        Carts[38] = new Cart(5, "���� �����");
        Carts[39] = new Cart(5, "���� ����");
        Carts[40] = new Cart(4, "������ ������");
        Carts[41] = new Cart(4, "������ ����");
        Carts[42] = new Cart(4, "������ �����");
        Carts[43] = new Cart(4, "������ ����");
        Carts[44] = new Cart(3, "��� ������");
        Carts[45] = new Cart(3, "��� ����");
        Carts[46] = new Cart(3, "��� �����");
        Carts[47] = new Cart(3, "��� ����");
        Carts[48] = new Cart(2, "��� ������");
        Carts[49] = new Cart(2, "��� ����");
        Carts[50] = new Cart(2, "��� �����");
        Carts[51] = new Cart(2, "��� ����");
    }

    public Cart getRandomCart() {
        Random r = new Random();
        return Carts[r.nextInt(52)];
    }
}
