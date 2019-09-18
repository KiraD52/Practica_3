package transporte;

public abstract class ATransporte
{
    public abstract String EncenderMotor(int Gasolina);
    public String ApagarMotor()
    {
        return "Motor apagado";
    }
    
}