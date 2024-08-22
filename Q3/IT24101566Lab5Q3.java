import java.util.Scanner;
public class IT24101566Lab5Q3
{
  public static void main(String args[])
  {
    final double chargePerDay = 48000;
    final double fisrtDiscount = 0.10;
    final double secondDiscount = 0.20;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Start Date (1-31): ");
    int sDate = input.nextInt();
    System.out.print("Enter End Date (1-31): ");
    int eDate = input.nextInt();
    if (sDate>=32 || sDate<=0 || eDate>=32 || eDate<=0)
    {
      System.out.println("Error: Days must be between 1 and 31");
    }
    else if (sDate>eDate)
    {
      System.out.println("Error: Start Date must be less than End Date");
    }
    else
    {
      int rDates = eDate - sDate;

      System.out.println("Room Charge Per Day: Rs."+chargePerDay+"/=");
      System.out.println("Number of Days Reserved: "+rDates);

      double tAmount = rDates*chargePerDay;
      double dAmount;

      if (rDates<3)
      {
        System.out.println("Total Amount to be Paid: "+tAmount);
      }
      else if (rDates==3 || rDates==4)
      {
        dAmount = tAmount - (tAmount*fisrtDiscount);
        System.out.println("Total Amount to be Paid: "+dAmount);
      }
      else
      {
        dAmount = tAmount - (tAmount*secondDiscount);
        System.out.println("Total Amount to be Paid: "+dAmount);
      }
    }
  }
}