package AimsProject;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    //private DigitalVideoDisc[] allDisc = new DigitalVideoDisc[100];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered+1<=MAX_NUMBER_ORDERED){
            this.itemsOrdered[qtyOrdered]=disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc || (itemsOrdered[i] != null && itemsOrdered[i].equals(disc))) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Shift elements to the left to fill the gap
            for (int i = index; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }

            itemsOrdered[qtyOrdered - 1] = null; // Clear the last element
            qtyOrdered--;
            System.out.println("Remove disc succeed!");
        } else {
            System.out.println("Element not found!"); // Element not found
        }
    }

    public float totalCost(){
        float totalCost=0f;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost=this.itemsOrdered[i].getCost()+totalCost;
        }
        return totalCost;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(qtyOrdered+dvdList.length<=MAX_NUMBER_ORDERED){
            qtyOrdered=qtyOrdered+dvdList.length;
            System.arraycopy(dvdList, 0, this.itemsOrdered, qtyOrdered, dvdList.length);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered+2<=MAX_NUMBER_ORDERED){
            this.itemsOrdered[qtyOrdered]=dvd1;
            this.itemsOrdered[qtyOrdered+1]=dvd2;
            qtyOrdered=qtyOrdered+2;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
