public class TIS_TransactionStatus_Test {
  private static boolean test_TransactionStatus_Constructor() {
    boolean successful = true;
    String bank ="SEB";

    TIS_TransactionStatus trans = new TIS_TransactionStatus(successful, bank);
    return true;
  }

  private static boolean test_getSuccessful() {
    boolean successful = true;
    String bank = "SEB";

    TIS_TransactionStatus trans = new TIS_TransactionStatus(successful, bank);
    if(trans.getSuccessful() == successful)
      return true;
    return false;
  }

  private static boolean test_getBank() {
    boolean successful = true;
    String bank = "SEB";

    TIS_TransactionStatus trans = new TIS_TransactionStatus(successful, bank);
    if(trans.getBank() == bank)
      return true;
    return false;
  }

  public static void main(String[] args) {

    if(test_TransactionStatus_Constructor())
      System.out.println("test_TransactionStatus_Constructor PASSED");
    else
      System.out.println("test_TransactionStatus_Constructor FAILED");

    if(test_getSuccessful())
      System.out.println("test_getSuccessful PASSED");
    else
      System.out.println("test_getSuccessful FAILED");

    if(test_getBank())
      System.out.println("test_getBank PASSED");
    else
      System.out.println("test_getBank FAILED");
  }
}
