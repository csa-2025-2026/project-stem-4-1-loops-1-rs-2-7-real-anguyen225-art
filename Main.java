import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter non-negative numbers to add. Enter -1 to stop");

    int N = 0;
    int sum = 0;
    while (N != -1)
    {
      N = sc.nextInt();
      sum += N;
    }
    sum++;
    System.out.println("The sum is: " + sum);


    


    sc.close();
  }
}
