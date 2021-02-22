class CurrencyConverter
{
double ER = 0;
public CurrencyConverter(double currentExchange)
{
ER = currentExchange;
}
public double DollarToINR(double dollars)
{
double INR = 0; INR = Dollars * ER; return INR;
}
public double INRToDollar(double INR)
{
double Dollars = 0; Dollars = INR / ER; return Dollars;
}
public double EuroToINR(double Euros)
{
double INR = 0; INR = Euros * ER; return INR;
}
public double INRToEuro(double INR)
{
double Euros = 0;
 
Euros = INR / ER; return Euros;
}
public double YenToINR(double Yens)
{
double INR = 0; INR = Yens * ER; return INR;
}
public double INRToYen(double INR)
{
double Yens = 0; Yens = INR / ER; return Yens;
}
}

public class Currency_Converter{
    double currentExchange;
    System.out.println("Menu For Currency Conversion"); 
    System.out.println("1. Dollar to INR"); 
    System.out.println("2. INR to Dollar"); 
    System.out.println("3. Euro to INR"); 
    System.out.println("4. INR to Euro"); 
    System.out.println("5. Yen to INR"); 
    System.out.println("6. INR to Yen");
    System.out.println("Enter your choice: ");
    choice1 = input.nextInt();
    System.out.println("Please enter the current exchange rate: "); 
    currentExchange = input.nextDouble();
    CurrencyConverter cc=new CurrencyConverter(currentExchange); 
    switch(choice)//inner switch
    {
    case 1:
    System.out.print("Enter Dollars :");
    double dollar=input.nextDouble();
    System.out.println (dollar+" dollars are converted to "+cc.DollarToINR(dollar)+" Rs."); 
    break;
    case 2:
    System.out.print("Enter INR :"); 
    inr=input.nextDouble();
    System.out.println(inr+" Rs. are converted to "+cc.INRToDollar(inr)+" Dollars"); 
    break;
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
    }