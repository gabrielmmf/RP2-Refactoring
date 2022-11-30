import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String showResultCustomer(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    public String showResultRental(Enumeration rentals) {
        Rental each = (Rental) rentals.nextElement();
        return each.getMovie().getTitle() + ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String showResultOwe(Customer aCustomer) {
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String showResultEarned(Customer aCustomer) {
        return "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}