public class UseCust {
    public static void main(String[] args) {
        Customer cs[]=new Customer[3];
        cs[0]=new Customer(new CustName("Swapnil","Sawant"),new Address("S1","Mumbai",400101),new ContactDetails("9833539741","9930754971"),new Address("s2","pune",400102));
        cs[1]=new Customer(new CustName("p","p"),new Address("S1","Dubai",500101),new ContactDetails("98333459741","994554971"),new Address("s4","mum",400066));
        cs[2]=new Customer(new CustName("S","S"),new Address("S5","Goa",400345),new ContactDetails("9820639741","9997554971"),new Address("s8","margoa",400532));

        for (Customer cus:cs) cus.displayCust();
    }
}
