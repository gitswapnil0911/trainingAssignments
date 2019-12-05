public class Customer {
    int custId=1;
    CustName custName;
    Address billingAddress;
    ContactDetails cdetails;
    Address ShippingAddress;
    static int counter=1;

    public Customer(){}

    public Customer(CustName custName, Address billingAddress, ContactDetails cdetails, Address shippingAddress) {
        custId = counter++;
        this.custName = custName;
        this.billingAddress = billingAddress;
        this.cdetails = cdetails;
        ShippingAddress = shippingAddress;
    }

    public void displayCust() {
        System.out.println("Customer{" +
                "custId=" + custId +
                ", custName=" + custName +
                ", billingAddress=" + billingAddress +
                ", cdetails=" + cdetails +
                ", ShippingAddress=" + ShippingAddress +
                '}');
    }
}
