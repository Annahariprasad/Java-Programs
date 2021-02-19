import ConversionDemo.CurrencyConverter;
import ConversionDemo.DistanceConverter;
import ConversionDemo.TimeConverter;
import java.util.Scanner;
public class Converter
{
public static void main(String[] args) throws NoClassDefFoundError
{
double CurrentExchange;
int choice,choice1,choice2,choice3; double inr;
double km; double hr; char ans='y'; do
{
System.out.println("\n Main Menu");
System.out.println("1.Currency Converter \n2.Distance Converter \n3. Time Converter"); 
System.out.println("Enter your choice: ");
Scanner input = new Scanner(System.in);
choice = input.nextInt(); 
switch(choice){
case 1:
System.out.println("\tCurrency Conversion"); 
do
{
System.out.println("Menu For Currency Conversion"); 
System.out.println("1. Dollar to INR"); 
System.out.println("2. INR to Dollar"); 
System.out.println("3. Euro to INR"); 
System.out.println("4. INR to Euro"); 
System.out.println("5. Yen to INR"); 
System.out.println("6. INR to Yen");
 System.out.println("Enter your choice: ");
choice1 = input.nextInt();
System.out.println("Please enter the current exchange rate: "); CurrentExchange = input.nextDouble();
CurrencyConverter cc=new CurrencyConverter(CurrentExchange); switch(choice1)//inner switch
{
case 1:
System.out.print("Enter Dollars :"); double dollar=input.nextDouble();
System.out.println (dollar+" dollars are converted to "+cc.DollarToINR(dollar)+" Rs."); break;
case 2:
System.out.print("Enter INR :"); inr=input.nextDouble();
System.out.println(inr+" Rs. are converted to "+cc.INRToDollar(inr)+" Dollars"); break;
case 3:
System.out.print("Enter Euro :"); double euro=input.nextDouble();
System.out.println(euro+" Euros are converted to "+cc.EuroToINR(euro)+" Rs."); break;
case 4:
System.out.print("Enter INR :"); inr=input.nextDouble();
System.out.println(inr+" Rs. are converted to "+cc.INRToEuro(inr)+" Euros"); break;
case 5:
System.out.print("Enter Yen :"); double yen=input.nextDouble();
System.out.println(yen+" Yens are converted to "+cc.YenToINR(yen)+" Rs."); break;
case 6:
System.out.print("Enter INR :"); inr=input.nextDouble();
System.out.println(inr+" Rs. are converted to "+cc.INRToYen(inr)+" Yens"); break;
}
System.out.println("Do You want to go to Currency Conversion Menu?(y/n) ");
 
ans = input.next().charAt(0);
}while(ans=='y'); break;
case 2:System.out.println("\tDistance Conversion"); do
{
System.out.println("Menu For Distance Conversion"); System.out.println("1. Meter to Km"); System.out.println("2. Km to Meter"); System.out.println("3. Miles to Km"); System.out.println("4. Km to Miles"); System.out.println("Enter your choice: ");
choice2 = input.nextInt();
DistanceConverter dc=new DistanceConverter(); switch(choice2)
{
case 1:
System.out.print("Enter meters to convert to Km:"); double meter=input.nextDouble();
System.out.println(meter+" Meters are converted to "+dc.MeterToKM(meter)+" Km."); break;
case 2:
System.out.print("Enter Km to convert to meters:"); km=input.nextDouble();
System.out.println(km+" Km. are converted meters "+dc.KMToMeter(km)+" Meters"); break;
case 3:
System.out.print("Enter Miles to convert to Km:"); double miles=input.nextDouble();
System.out.println(miles+" Miles are converted to "+dc.MileToKM(miles)+" Km."); break;
case 4:
System.out.print("Enter Km to convert to miles:"); km=input.nextDouble();
System.out.println(km+" Km. are converted miles "+dc.KMToMile(km)+" Miles"); break;
}
System.out.println("Do You want to go to Distance Conversion Menu?(y/n) "); ans = input.next().charAt(0);
}while(ans=='y'); break;
case 3:System.out.println("\tTime Conversion"); do
{
System.out.println("Menu For Time Conversion"); System.out.println("1. Hour to Minutes"); System.out.println("2. Minutes to Hour"); System.out.println("3. Hour to Seconds"); System.out.println("4. Seconds to Hour"); System.out.println("Enter your choice: ");
 
choice3 = input.nextInt(); TimeConverter tc=new TimeConverter(); switch(choice3)
{
case 1:
System.out.print("Enter hours to convert to Minutes:"); hr=input.nextDouble();
System.out.println(hr+" Hours are converted to "+tc.HrToMin(hr)+" min."); break;
case 2:
System.out.print("Enter Minutes to convert to hours:"); double minutes=input.nextDouble();
System.out.println(minutes+" Minutes. are converted hours "+tc.MinToHour(minutes)+" Hours");
break; case 3:
System.out.print("Enter Hours to convert to Seconds:"); hr=input.nextDouble();
System.out.println(hr+" Hours are converted to "+tc.HrToSec(hr)+" Seconds."); break;
case 4:
System.out.print("Enter Seconds to convert to hours:"); double seconds=input.nextDouble();
System.out.println(seconds+" Seconds. are converted hours "+tc.SecToHour(seconds)+" Hours");
break;
}
System.out.println("Do You want to go to Time Conversion Menu?(y/n) "); ans = input.next().charAt(0);
}while(ans=='y'); break;
}//end of outer switch
System.out.println("Do you want to go back to Main Menu?(y/n)"); ans=input.next().charAt(0);
}while(ans=='y');
}//end of main
}//end of class
