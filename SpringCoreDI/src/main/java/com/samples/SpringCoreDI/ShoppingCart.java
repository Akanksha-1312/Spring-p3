package com.samples.SpringCoreDI;

public class ShoppingCart {
	private  Item items;

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}

	public ShoppingCart(Item items) {
		super();
		this.items = items;
	}

	public Item getItems() {
		return items;
	}

	public ShoppingCart() {
		super();
	}

	public void setItems(Item items) {
		this.items = items;
	}

}
