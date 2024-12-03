public class ColorDemo{

  public static void main(String[] args){

    System.out.print("\u001b[31m");
    System.out.println("Hello World");
    System.out.print("\u001b[0m");
    System.out.print("\u001b[31mRed");
    System.out.print(" fish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" fish ");
    System.out.print(" also blue because no reset... also your terminal is blue now too...");
    System.out.println("\u001b[0m");
    System.out.println("Hello");
    for(int r = 0; r < 256; r+=1){
      for(int g = 0; g <= 256; g+=1){
        for(int b = 0; b <= 256; b+=1){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
        System.out.println();
    }
  }
}
