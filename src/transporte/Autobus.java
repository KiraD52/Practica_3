package transporte;

public class Autobus extends ATransporte implements ITransporte
{
    private int Gasolina;

    public int getGasolina()
    {
        return Gasolina;
    }
    public void setGasolina(int Gasolina)
    {
        this.Gasolina=Gasolina;
    }
    
    public Autobus()
    {
        System.out.println(EncenderMotor(this.getGasolina()));
    }
    public Autobus(int Gasolina)
    {
        this.Gasolina=Gasolina;
        System.out.println(this.EncenderMotor(Gasolina));
    }
    
    public String EncenderMotor(int Gasolina)
    {
        return "Autobus encendido";
    }
    @Override
    public String SistemaFreno()
    {
        return "Autobus frenado";
    }
    @Override
    public String SistemaConducir()
    {
        return "Autobus conduciendo";
    }
    
    public String Acelerar(int Gasolina)
    {
        return "Autobus acelerando";
    }

    boolean Acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}