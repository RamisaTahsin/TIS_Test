public class TIS_Ticket_Test {
  private static String t = "Adult";
  private static String a = "Between 18-64 years";
  private static double p = 22.50;

  //Test of the making of a ticket.
  private static boolean test_TicketConstructor(){
    TIS_Ticket ticket = new TIS_Ticket(t,a,p);
    return t == ticket.getType() && a == ticket.getAge() && p == ticket.getPrice();
  }

  public static void main(String[] args){

    if (test_TicketConstructor()){
    System.out.println("test_TicketConstructor PASSED");
    }
    else {
    System.out.println("test_TicketConstructor FAILED");
    }
  }
}
