package twomethodinonemainmethod;

public class TwoMethodInOneMainMethod
{
    static void myMethod1(String country, int countrycode)
    {
        System.out.println(country+ ":  +" +countrycode);
    }

    void myMethod2(String flightdestination, int fare)
    {
        System.out.println(flightdestination+ ":  £" +fare);
    }

    public static void main( String[] args)
    {
        myMethod1("INDIA", 91);
        TwoMethodInOneMainMethod obj = new TwoMethodInOneMainMethod();
        obj.myMethod2("INDIA",750);
    }

}
