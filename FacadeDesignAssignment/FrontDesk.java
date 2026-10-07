package FacadeDesignAssignment;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    public void checkIn(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("\nGuest Checking In....");
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
    }

    public void checkOut(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("\nGuest Checking out...");
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
    }
}
