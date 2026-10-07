package FacadeDesignAssignment;

public class Valet implements HotelService {
    private String plateNumber;

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        hotelServices();
    }

    @Override
    public void hotelServices() {
        System.out.println("Valet: Picking up vehicle with plate number " + plateNumber);
    }
}
