public abstract class Medicine {
    int price;
    Date expiryDate;

        public void getDetails() {
        System.out.println("Medicine{" +
                "price=" + price +
                ", expiryDate=" + expiryDate +
                '}');
    }

    abstract void displayLabel();

        public Medicine(){}

        public Medicine(int price, Date expiryDate) {
        this.price = price;
        this.expiryDate = expiryDate;
    }
}
