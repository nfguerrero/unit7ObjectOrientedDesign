public class BillfoldTester
{
    public static void main(String[] args)
    {
        IDCard id = new IDCard("Nic", "12345");
            System.out.println(id);
        CallingCard callCard = new CallingCard("David", "1234", "5678");
            System.out.println(callCard);
        Card card = new Card("Nic");
            System.out.println(card);
        DriverLicense license = new DriverLicense("David", "2015");
            System.out.println(license);
        DriverLicense nicLicense = new DriverLicense("Nic", "2016");
            System.out.println(nicLicense + "\n");
        
        Billfold bill = new Billfold();
        
        //bill.addCard(id);
        bill.addCard(license);
        bill.addCard(nicLicense);
              
        System.out.println(bill.formatCards());
        System.out.println("\nExpired Cards: " + bill.getExpiredCardCount());  
    }
}