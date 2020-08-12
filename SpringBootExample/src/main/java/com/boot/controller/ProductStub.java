package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Product;

public class ProductStub {

	private static Map<Long, Product> p = new HashMap<Long, Product>();
	private static Long idIndex = 3L;

	static{
		Product a = new Product(1L, "DELL-XPS", 25000);
		p.put(1L, a);
		Product b = new Product(2L, "HP 15-Core", 35000);
		p.put(2L, b);
		Product c = new Product(3L, "Lenovo", 30000);
		p.put(3L, c);
	}
	
	public static List<Product> list() {
		return new ArrayList<Product>(p.values());
	}

	public static Product create(Product pro) {
		idIndex += idIndex;
		pro.setId(idIndex);
		p.put(idIndex, pro);
		return pro;
	}

	public static Product get(Long id) {
		return p.get(id);
	}

	public static Product update(Long id, Product pro) {
		p.put(id, pro);
		return pro;
	}

	public static Product delete(Long id) {
		return p.remove(id);
	}

}
