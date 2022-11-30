import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String showResultCustomer(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    public String showResultRental(Rental each) {
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

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = showResultCustomer(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += showResultRental(each);
        }
        // add footer lines
        result += showResultOwe(aCustomer);
        result += showResultEarned(aCustomer);
        return result;
    }
}