public class Deal {
    private String seller;
    private String buyer;
    private String details;

    public Deal(String seller, String buyer, String details) {
        this.seller = seller;
        this.buyer = buyer;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Eladó: " + seller +
                "\nVevő: " + buyer +
                "\nRészletek: " + details;
    }
}
