public class TIS_Main_Test {
  private static TIS_Main main = new TIS_Main();


  private static boolean test_printWelcome(){
  return ("\n    Welcome to our ticket machine!" == main.callPrintWelcome());
  }


  public static void main(String[] args){
    if (test_printWelcome()){
      System.out.println("PASSED");
    } else {
      System.out.println("FAILED");
    }
  }

}
