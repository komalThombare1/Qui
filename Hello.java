public class Hello {
   String name;
   String m;
   int a=10;
   System.out.println(a);
   //Constructor
   Hello(){
      this.name = "BeginnersBook.com";
   }
   public static void main(String[] args) {
      Hello obj = new Hello();
      System.out.println(obj.name);
   }
}
