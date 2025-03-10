package fabrica;

import carro.Carro;
import carro.Sedan;
import motor.Motor;
import motor.MotorSedan;

public class FabricaDeSedan implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
        return new Sedan();
    }

    @Override
    public Motor criarMotor() {
        return new MotorSedan();
    }
}
