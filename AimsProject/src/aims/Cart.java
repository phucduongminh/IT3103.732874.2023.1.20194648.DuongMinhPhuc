package AimsProject.src.aims;

import java.util.ArrayList;
import AimsProject.src.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    /**
     * Add media to the cart
     */
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    /**
     * Remove media from the cart
     */
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered.get(i).getTitle() + " - "
                    + itemsOrdered.get(i).getCategory() + ": " + itemsOrdered.get(i).getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void isMatch(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).isMatch(id)) {
                itemsOrdered.get(i).print();
                return;
            }
        }
        System.out.println("Not Found DVD id: " + id);
    }

    public void isMatch(String title) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).isMatch(title)) {
                itemsOrdered.get(i).print();
                return;
            }
        }
        System.out.println("Not Found DVD title: " + title);
    }
}
