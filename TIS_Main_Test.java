public class TIS_Main_Test {
  private static TIS_Main main = new TIS_Main();

  private static boolean test_AccountNr(){
  //main.reset();
  String s1 = "xy z";
  String s2 = "x-yz";
  return ( ("xyz" == main.setAccountNr(s1)) && ("xyz" == main.setAccountNr(s2)) );
  }

  public static void main(String[] args){
      int totalAmountOfErros = 0;
      if(test_AccountNr()){
        System.out.println("accountNr: " + "PASSED");
      } else {
        System.out.println("accountNr: " + "FAILED");
        totalAmountOfErros++;
      }
  }
}
