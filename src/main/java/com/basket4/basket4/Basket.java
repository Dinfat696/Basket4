package com.basket4.basket4;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Integer> productsId;

    public Basket(){
        this.productsId=new ArrayList<>();
    }
    public void setProductsId(List<Integer> products) {
        for (Integer product : products) {
            productsId.add(product);
        }
    }

    @Override
    public String toString() {
        return "В корзине " + productsId.toString();
    }
}


