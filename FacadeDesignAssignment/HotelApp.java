package FacadeDesignAssignment;

public class HotelApp {
    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();
        frontDesk.checkIn("LMN-00200", 204, 3);
        frontDesk.checkOut("XYZ-2411641", 308, 3);
    }
}