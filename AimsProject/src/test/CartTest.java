package AimsProject.src.test;

import AimsProject.src.aims.Cart;
import AimsProject.src.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main (String[] args) {

        //Create a new cart
        Cart cart = new Cart();

        //Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        //Test the print method
        cart.print();

        //To-do: test the search methods here
        System.out.println("Search for a DVD with the ID 1: ");
        cart.isMatch(1);
        System.out.println("Search for a DVD with the ID 4: ");
        cart.isMatch(4);

        System.out.println("Search for a DVD with the title \"The Lion King\":");
        cart.isMatch("The Lion King");

        System.out.println("Search for a DVD with the title \"Bla\":");
        cart.isMatch("Bla");
    }

}