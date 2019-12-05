public class Service extends Product{
    Date startDate;
    Date endDate;
    int startHour,starMin,endHour,endMin;

    public Service(Date startDate, Date endDate, int startHour, int starMin, int endHour, int endMin) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startHour = startHour;
        this.starMin = starMin;
        this.endHour = endHour;
        this.endMin = endMin;
    }

    public Service(int productId, String description, double price, int noOfUnits, Date startDate, Date endDate, int startHour, int starMin, int endHour, int endMin) {
        super(productId, description, price, noOfUnits);
        this.startDate = startDate;
        this.endDate = endDate;
        this.startHour = startHour;
        this.starMin = starMin;
        this.endHour = endHour;
        this.endMin = endMin;
    }

    @Override
    public void displayDetails() {
        System.out.println("Service{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", startHour=" + startHour +
                ", starMin=" + starMin +
                ", endHour=" + endHour +
                ", endMin=" + endMin +
                ", productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", noOfUnits=" + noOfUnits +
                '}');
    }
}
