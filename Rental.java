public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

   public double getCharge() {
      // Adicionar o trecho de código extraído.
      return _movie.getCharge(_daysRented);
   }

   public int getFrequentRenterPoints() {
      int frequentRenterPoints = 0;
      // add frequent renter points
      frequentRenterPoints++;
      // add bonus for a two day new release rental
      if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            this.getDaysRented() > 1)
         frequentRenterPoints++;

      return frequentRenterPoints;
   }
}
