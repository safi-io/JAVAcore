package Lab3;

class HotDogStand {
    private final int hotDogStandId;
    private int soldHotDogsInADay;

    public HotDogStand(int hotDogStandId, int soldHotDogsInADay) {
        this.hotDogStandId = hotDogStandId;
        this.soldHotDogsInADay = soldHotDogsInADay;
    }

    public void justSold() {
        soldHotDogsInADay++;
    }

    public void displayInformation() {
        System.out.println("Stand with id: " + hotDogStandId + " has sold: " + soldHotDogsInADay + " products.");
    }
}

public class hotDogsPortal {
    public static void main(String[] args) {
        HotDogStand hds1 = new HotDogStand(1,20);
        hds1.displayInformation();
        hds1.justSold();
        hds1.displayInformation();

        HotDogStand hds2 = new HotDogStand(2,15);
        hds2.displayInformation();

        HotDogStand hds3 = new HotDogStand(3,35);
        hds3.displayInformation();
    }
}
