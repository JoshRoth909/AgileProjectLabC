package testpackage;
public class Agile {

    public static int[] invert(int[] test) {
      for (int i = 0; i< test.length;i++){
          test[i] = test[i] * -1;
      }
     return test;
  }
}