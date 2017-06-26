//package com.pharmerz.server.controller.rest;
//
//import com.pharmerz.server.controller.exception.BadRequestException;
//import com.pharmerz.server.domain.model.Enquiry;
//import com.pharmerz.server.domain.model.Product;
//import com.pharmerz.server.domain.model.ProductVerifyExist;
//import com.pharmerz.server.domain.repository.IProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
//import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.UUID;
//
///**
// * Created by Harshal on 05-06-2017.
// */
//
//@Component
//@RepositoryEventHandler(Product.class)
//public class ProductListner {
//
//    @Autowired
//    IProductRepository iProductRepository;
//
//    @HandleBeforeCreate
//    public void ProductCheck(Product product) {
//
//        UUID categeoryid=product.getCategory().getId();
//        System.out.println("categeoryid "+categeoryid);
//        String productName=product.getProduct();
//        System.out.println("productname "+productName);
//
//
//        List<Product> productpresent=iProductRepository.findByProductAndCategoryId(productName,categeoryid);
//        System.out.println("productpresent.isEmpty() "+productpresent.isEmpty());
//        if(productpresent.isEmpty()==false){
//
//            throw new BadRequestException("Product is already present not verified");
//        }
////        else {
////            return new ResponseEntity<ProductVerifyExist>(HttpStatus.BAD_REQUEST);
////        }
//
//
//    }
//}
