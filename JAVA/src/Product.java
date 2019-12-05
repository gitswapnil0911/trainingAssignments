public class Product {
    int productId;
    String description;
    double price;
    int noOfUnits;

    public Product(){}
    public Product(int productId, String description, double price, int noOfUnits) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.noOfUnits = noOfUnits;
    }

    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public void displayDetails(){
        System.out.println("Product{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", noOfUnits=" + noOfUnits +
                '}');
    }
}
