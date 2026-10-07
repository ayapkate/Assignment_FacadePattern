package FacadeDesignAssignment;

public class Cart implements HotelService {
    private int numberOfCarts;

    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
        hotelServices();
    }

    @Override
    public void hotelServices() {
        System.out.println("Cart: Delivering " + numberOfCarts + " luggage cart(s)");
    }
}
