public class BillfoldTester
{
    public static void main(String[] args)
    {
        //IDCard id = new IDCard("Nic", "12345");
        DriverLicense license = new DriverLicense("David", "2015");
        DriverLicense nicLicense = new DriverLicense("Nic", "2016");
        
        Billfold bill = new Billfold();
        
        //bill.addCard(id);
        bill.addCard(license);
        bill.addCard(nicLicense);
              
        System.out.println(bill.formatCards());
        System.out.println("\nExpired Cards: " + bill.getExpiredCardCount());  
    }
}