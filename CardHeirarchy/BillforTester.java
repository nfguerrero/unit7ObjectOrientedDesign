public class BillforTester
{
    public static void main(String[] args)
    {
        IDCard id = new IDCard("Nic", "12345");
        DriverLicense license = new DriverLicense("David", "987");
        
        Billfold bill = new Billfold();
        
        bill.addCard(id);
        bill.addCard(license);
        
        System.out.print(bill.formatCards());
    }
}