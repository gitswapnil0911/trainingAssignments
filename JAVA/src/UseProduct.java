public class UseProduct {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Comp",3000,10);
        p1.displayDetails();
        Product p2 = new Item(2,"Comp1",4000,110,12,12,45,18,500,"Swapnil");
        p2.displayDetails();
        Product p3 = new Service(3,"Comp2",5000,11,new Date(9,11,1990),new Date(9,11,2000),11,12,600,89);
        p3.displayDetails();
        ((Product)p2).displayDetails();
    }
}
