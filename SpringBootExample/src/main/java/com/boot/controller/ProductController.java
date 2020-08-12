package com.boot.controller;

import java.util.List; 

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Product;

@RestController
@RequestMapping("product")
public class ProductController {

@RequestMapping(value = "products" , method = RequestMethod.GET)	
  public List<Product> list(){
	return ProductStub.list();
}

@RequestMapping(value = "addproduct" , method = RequestMethod.POST)
public Product create(@RequestBody Product product){
	return ProductStub.create(product);
}

@RequestMapping(value = "updateproduct/{id}" , method = RequestMethod.PUT)
public Product update(@PathVariable Long id, @RequestBody Product product){
	return ProductStub.update(id, product);
}

@RequestMapping(value = "deleteproduct/{id}" , method = RequestMethod.DELETE)
public Product delete(@PathVariable Long id){
	return ProductStub.delete(id);
}

}



