package bookingapplication;

public class Booking_Application extends Booking {

    @Override
    public double calculateTotalPrice() {
        if (getBookingAmount() > 5) {
            totalPrice = (getBookingAmount() * getPricePer())- ((getBookingAmount() * getPricePer())*0.15);
            return totalPrice;
        }else{
            totalPrice = super.calculateTotalPrice();
            return totalPrice;
        }
    }
}
