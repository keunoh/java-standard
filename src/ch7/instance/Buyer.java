package ch7.instance;

import java.util.Vector;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    //    Product[] item = new Product[10];
//    int i = 0;
    Vector item = new Vector();

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("not enough money");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("You've bought " + p);
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " has returned.");
        }
        else {
            System.out.println("There is no " + p);
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("There is no items");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }

        System.out.println("sum = " + sum);
        System.out.println("itemList = " + itemList);
    }
}
