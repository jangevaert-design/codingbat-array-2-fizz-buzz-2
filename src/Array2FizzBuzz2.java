public class Array2FizzBuzz2 {
  public String[] fizzBuzz(int start, int end) {
    String[] result = new String[end - start];

    for (int i = start; i < end; i++) {
      if (i % 3 != 0 && i % 5 != 0) {
        result[i - start] = String.valueOf(i);
      }
      if (i % 3 == 0) {
        result[i - start] = "Fizz";
      }
      if (i % 5 == 0) {
        result[i - start] = "Buzz";
      }
      if (i % 3 == 0 && i % 5 == 0){
        result[i - start] = "FizzBuzz";
      }
    }
    return result;
  }
}
