public class TIS_Main_Test {
  private static TIS_Main main = new TIS_Main();

  //Test of removal of "-" and spaces in accountnumber input.
  private static boolean test_AccountNr() {
    String s1 = "xy z";
    String s2 = "x-yz";
    return main.setAccountNr(s1).equals("xyz") && main.setAccountNr(s2).equals("xyz");
  }

  public static void main(String[] args) {
    if(test_AccountNr()) {
      System.out.println("test_AccountNr PASSED");
    } else {
      System.out.println("test_AccountNr FAILED");
    }
  }
}
