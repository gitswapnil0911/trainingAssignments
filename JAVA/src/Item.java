public class Item extends Product {
    int height;
    int width;
    int length;
    int warranty;
    double costShipping;
    String manafacturer;

    public Item() {
    }

    public Item(int height, int width, int length, int warranty, double costShipping, String manafacturer) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.warranty = warranty;
        this.costShipping = costShipping;
        this.manafacturer = manafacturer;
    }

    public Item(int productId, String description, double price, int noOfUnits, int height, int width, int length, int warranty, double costShipping, String manafacturer) {
        super(productId, description, price, noOfUnits);
        this.height = height;
        this.width = width;
        this.length = length;
        this.warranty = warranty;
        this.costShipping = costShipping;
        this.manafacturer = manafacturer;


    }

    @Override
    public void displayDetails() {
        System.out.println("Item{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", warranty=" + warranty +
                ", costShipping=" + costShipping +
                ", manafacturer='" + manafacturer + '\'' +
                ", productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", noOfUnits=" + noOfUnits +
                '}');
    }
}
