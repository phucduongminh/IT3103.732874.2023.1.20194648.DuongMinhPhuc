package AimsProject.src.aims.screen;

import AimsProject.src.aims.cart.Cart;
import AimsProject.src.aims.store.Store;

import javax.swing.JFrame;

public abstract class AddItemToStoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	
	public Store getStore() {
		return this.store;
	}
	
	public Cart getCart() {
		return this.cart;
	}
	
	public AddItemToStoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
	}

}
