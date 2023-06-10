package com.basket4.basket4;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketService {

    private Basket basket;


    public BasketService() {
        this.basket = new Basket();
    }
    public void addProducts(List<Integer> products){
        basket.setProductsId(products);
    }

    public String getBasketJSON(){
        return "Корзина с товаром: "+ basket.toString();
    }
}
