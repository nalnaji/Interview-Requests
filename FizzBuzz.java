public class FizzBuzz{

     public static void main(String []args){
        printFizzBuzz(37);
     }
     
     public static void printFizzBuzz(int N)
     {
         for(int i = 1; i <= N; i++)
         {
             
             if(i % 15 == 0)
                 System.out.println("Fizz-Buzz");
             else if(i % 3 == 0)
                System.out.println("fizz");
             else if(i % 5 == 0)
                System.out.println("buzz");
             else
                System.out.println(i+"");
             
         }
         
     }
}
