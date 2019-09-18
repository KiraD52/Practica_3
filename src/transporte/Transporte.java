package transporte;

public class Transporte
{
    public static void main(String args[])
    {
        Autobus dina=new Autobus();
        dina.setGasolina(6);
        Autobus inter=new Autobus(5);
        System.out.println(inter.Acelerar());
        
    }
}