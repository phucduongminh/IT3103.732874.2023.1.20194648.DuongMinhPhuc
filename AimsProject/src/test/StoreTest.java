package AimsProject.src.test;

import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.store.Store;

public class StoreTest {
    public static void main(String args[]) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);;

        Store store = new Store();
        store.addMedia(dvd1); // The disc has been added
        store.addMedia(dvd2); // The disc has been added
        store.addMedia(dvd3); // The disc has been added
        store.removeMedia(dvd2); // The disc has been removed
        store.removeMedia(dvd2); // The disc is not in the store
    }
}
