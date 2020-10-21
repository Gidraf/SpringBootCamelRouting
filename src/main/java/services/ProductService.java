//package services;
//
//
//import models.Products;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import presenters.ProductsCrudPresenter;
//
//import java.util.Optional;
//
//@Service
//public class ProductService {
//
//    private final ProductsCrudPresenter productsCrudPresenter;
//
//    @Autowired
//    public  ProductService(ProductsCrudPresenter productsCrudPresenter){
//        this.productsCrudPresenter = productsCrudPresenter;
//    }
//
//    public Products findById(int id){
//        Optional<Products> product = productsCrudPresenter.findById(id);
//        if (product.isPresent()){
//            throw new IllegalArgumentException("No product found with that Id");
//        }
//        return product.get();
//    }
//
//    public Iterable<Products> findAllProducts(){
//        return  productsCrudPresenter.findAll();
//    }
//
//    public void saveProduct(Products product){
//        productsCrudPresenter.save(product);
//    }
//}
