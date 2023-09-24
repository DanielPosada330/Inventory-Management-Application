package com.example.demo.controllers;


import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//Controller for the Buy Now Button
@Controller
public class BuyNowButtonController {

    @Autowired
    private ApplicationContext context;


    //Get mapping showing in url link
    @GetMapping("/purchaseConfirmation")
    //String method to verify the buy now button returns a valid purchase
    public String buyNow(@RequestParam("buyProduct") int productID){

        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product finalProductAmount = productService.findById(productID);

        boolean purchaseConfirmation = finalProductAmount.buyProduct();
        if ( purchaseConfirmation ) {
            productService.save(finalProductAmount);
            return "purchaseConfirmationSuccessful";
        }
        return "purchaseError";
    }
}
