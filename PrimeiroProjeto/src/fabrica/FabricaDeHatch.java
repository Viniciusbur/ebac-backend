package fabrica;

import carro.Carro;
import carro.Hatch;
import motor.Motor;
import motor.MotorHatch;

public class FabricaDeHatch implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
        return new Hatch();
    }

    @Override
    public Motor criarMotor() {
        return new MotorHatch();
    }
}
