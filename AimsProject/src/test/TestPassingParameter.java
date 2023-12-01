package AimsProject.src.test;

import AimsProject.src.aims.DigitalVideoDisc;

public class TestPassingParameter {
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1=o2;
        o2=tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cindeDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cindeDVD);
        System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
        System.out.println("Cinde DVD title: "+cindeDVD.getTitle());

        //changeTitle(jungleDVD, cindeDVD.getTitle());
        //System.out.println("Jungle DVD title: "+jungleDVD.getTitle());

        correctSwap(jungleDVD, cindeDVD);
        System.out.println("Correct Swap:");
        System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
        System.out.println("Cinde DVD title: "+cindeDVD.getTitle());
    }

    public static void correctSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Store a temporary copy of dvd1
        DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getTitle());
    
        // Copy the values from dvd2 to dvd1
        dvd1.setTitle(dvd2.getTitle());
    
        // Copy the values from the temporary copy to dvd2
        dvd2.setTitle(tmp.getTitle());
    }    
}
