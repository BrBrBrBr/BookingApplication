package bookingapplication;

import javax.swing.JOptionPane;

public class Diving_Adventures {

    public static void main(String[] args) {
        Booking_Application application = new Booking_Application();
        
        application.setCustomerName();
        application.setCustomerContact();
        application.setBookingAmount();
        application.setPricePer();
        JOptionPane.showMessageDialog(null, "Customer Name:" + application.getCustomerName() + "\n"
                + "Customer Contact:" + application.getCustomerContact() + "\n"
                + "Booking Amount:" + application.getBookingAmount() + "\n"
                + "Booking Price:R " + application.getPricePer() + "\n"
                + "Total Due:R " + application.calculateTotalPrice());

    }

}
