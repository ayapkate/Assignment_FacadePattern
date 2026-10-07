package FacadeDesignAssignment;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        hotelServices();
    }

    @Override
    public void hotelServices() {
        System.out.println("HouseKeeping: Cleaning room number " + roomNumber);
    }
}
