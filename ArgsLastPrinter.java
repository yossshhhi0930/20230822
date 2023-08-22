 public class ArgsLastPrinter {
   public static void main(String[] args) {
      for(int i = 0; i < args.length; i++) 
         
      if (i == 0) {
          System.out.println("なし");
      } else if (i >= 0){
          System.out.println(args[i]);
      }                  
   }
 }
