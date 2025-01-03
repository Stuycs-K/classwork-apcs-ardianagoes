public class words{

  public static void main(String[] args){
    makeWords(2, "", "abc");
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
      System.out.println(result);
    }
    else {
      for (int i = 0; i < alphabet.length(); i++){
        result += alphabet.charAt(i);
        remainingLetters--;
      }
      makeWords(remainingLetters, result, alphabet);
    }
  }
}
