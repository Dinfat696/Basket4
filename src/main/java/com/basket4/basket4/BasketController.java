package com.basket4.basket4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/order")
public class BasketController {

    private BasketService basketService;


    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
        @GetMapping(path = "/add")
        public String addProduct(@RequestParam("id") List<Integer> products){
            basketService.addProducts(products);
            return "Добавлен " + products.toString();

        }
        @GetMapping(path = "/get")
        public String getBasket3Products(){
            return basketService.getBasketJSON();
        }
    }


