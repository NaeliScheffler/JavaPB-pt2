package interfaces;

public class RentalServices {
    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxService;

    public RentalServices(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
