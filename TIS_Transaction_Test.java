public class TIS_Transaction_Test {
  private static String accountNr = "123";
  private static double price = 10;

  private static boolean test_Transaction() {
    TIS_TransactionStatus result = TIS_Transaction.makeTransaction(accountNr, price);
      return result.getSuccessful() && result.getBank().equals("SEB");

  }
  
  public static void main(String[] args) {

    if (test_Transaction())
    System.out.println("test_Transaction PASSED");
    else
    System.out.println("test_Transaction FAILED");
  }
}
