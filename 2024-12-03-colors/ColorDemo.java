public class ColorDemo{

  public static void main(String[] args){
/*
    System.out.print("\u001b[1;4;31;103m");
    System.out.print(" fish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" fish ");
    System.out.print(" also blue because no reset... also your terminal is blue now too...");
    System.out.print("\u001b[2J");
    System.out.print("\u001b[H");
    System.out.print("\u001b[?25h");
    System.out.print("\u001b[0m");
    */
    System.out.print("\u001b[?25l");
    for (int r = 0; r < 256; r += 5) {
      for (int g = 0; g < 256; g += 5) {
          for (int b = 0; b < 256; b += 5) {
              System.out.print("\u001b[48;2;"+r+";"+g+";"+b+"m.");
              System.out.print("\u001b[38;2;"+b+";"+g+";"+r+"m.");
            }
          }
          System.out.println();
        }
        System.out.print("\u001b[0m");
        System.out.print("\u001b[?25h");
        System.out.print("\u001b[49m");
        sleep(1000);
        System.out.print("\u001b[2J");
        System.out.print("\u001b[H");

    }


    public static void sleep(int milli){
          try{
                  Thread.sleep(milli);
          }catch(Exception e){
          }
    }
  }
