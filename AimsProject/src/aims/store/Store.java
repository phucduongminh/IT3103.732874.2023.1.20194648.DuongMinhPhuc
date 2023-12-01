package AimsProject.src.aims.store;

import java.util.ArrayList;

import AimsProject.src.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    /**
     * Add a media to the store if the store is not full
     * @param media the media to be added
     */
    public void addMedia(Media media) {
        if(itemsInStore.size() < 100) {
            itemsInStore.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The store is almost full");
        }
    }
    /**
     * Remove a media from the store
     * @param media the media to be removed
     */
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the store");
        }
    }
}
