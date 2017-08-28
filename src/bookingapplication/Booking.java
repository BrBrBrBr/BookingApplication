
package bookingapplication;

import javax.swing.JOptionPane;


public abstract  class Booking {
    private String customerName;
    private String customerContact;
    private int bookingAmount;
    private double pricePer;
    protected double totalPrice;

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact() {
        customerContact = JOptionPane.showInputDialog(null,"Please enter the customer contact number","Customer Contact",3);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName() {
        customerName = JOptionPane.showInputDialog(null, "Please Enter the customer name","Customer Name",3);
    }

    public int getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount() {
        bookingAmount = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of bookings","Number of Bookings",3));
    }

    public double getPricePer() {
        return pricePer;
    }

    public void setPricePer() {
        pricePer = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price of the dive","Dive Price",3));
    }
    public double calculateTotalPrice(){
        totalPrice = bookingAmount * pricePer;
        return totalPrice;
    }
}
