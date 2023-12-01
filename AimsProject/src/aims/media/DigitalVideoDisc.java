package AimsProject.src.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    @Override
    public void print() {
        System.out.println(id + " - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$");
    }

    public void play() {

        System.out.println("Playing Track: " + this.getTitle());

        System.out.println("Track length: " + this.getLength());

    }
}
