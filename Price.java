public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        // Adicionar o trecho de código extraído.
        int frequentRenterPoints = 0;
        // add frequent renter points
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1)
            frequentRenterPoints++;

        return frequentRenterPoints;
    }
}
