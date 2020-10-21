//package services;
//
//import models.Discounts;
//import models.Products;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import presenters.DiscountCrudPresenters;
//
//
//import java.util.Optional;
//import java.util.Random;
//
//@Service
//public class DiscountService {
//    private final DiscountCrudPresenters discounts;
//    private final ProductService productService;
//
//    private final Random random = new Random();
//
//    @Autowired
//    public DiscountService(DiscountCrudPresenters discounts,
//                           ProductService productService) {
//        this.discounts = discounts;
//        this.productService = productService;
//    }
//
//    public Discounts makeDiscount() {
//        // create a discount
//        Discounts discount = new Discounts();
//        int discountRate = this.random.nextInt(100);
//        discount.setAmount(discountRate);
//
//        // select random product
//        int productId = this.random.nextInt(3) + 1;
//        Products product = productService.findById(productId);
//
//        // set the discount to product and save
//        int discountedPrice = product.getPrice() - (discountRate * product.getPrice() / 100);
//        product.setDiscounted(discountedPrice);
//        productService.saveProduct(product);
//
//        discount.setProducts(product);
//        return discount;
//    }
//
//    public Discounts findDiscount(Integer id) {
//        Optional< Discounts > discount = discounts.findById(id);
//        if (!discount.isPresent()) {
//            throw new IllegalStateException("Discount could not found for given id:" + id);
//        }
//        return discount.get();
//    }
//}
