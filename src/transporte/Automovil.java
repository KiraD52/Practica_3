package transporte;

public class Automovil extends ATransporte
{
    @Override
    public String EncenderMotor(int Gasolina)
    {
        if(Gasolina>1)
        {
            return "Motor de automovil encendido";
        }
        else
        {
            return "Motor de automovil apagado";
        }
    }
    
    
}