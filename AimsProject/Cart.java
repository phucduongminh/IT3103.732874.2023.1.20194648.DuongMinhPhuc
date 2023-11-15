package AimsProject;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    //private DigitalVideoDisc[] allDisc = new DigitalVideoDisc[100];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<=20){
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
}
