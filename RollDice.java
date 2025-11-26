public class RollDice {
   public static void main(String[]args){
      System.out.print("The number of times the dice " + "is rolled to get the sum 10 = " + rollDice(10));
      System.out.print("The number of times the dice " + "is rolled to get the sum 6 = " + rollDice(6));
   }
   public static int rollDice(int num){
      int die1, die2, sum;
      int rollCount = 0;
      do {
         die1 = (int)(Math.random()*6+1);
         die2 = (int)(Math.random()*6+1);
         sum = die1 + die2;
         rollCount++;
      } while (sum != num);
      return rollCount;

   }
}
/* 
   if r = Math.random();
    then 0.0<=r<1.0// 0.0 <= Math.random() < 1.0
    // multiply by 6
    1.0 <=6r <6.0 // 1.0 <= 6Math.random() < 6.0
    // add 1
    2.0 <= 6r + 1 < 7.0 
 */