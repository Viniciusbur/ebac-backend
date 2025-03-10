package fabrica;

import carro.Carro;
import carro.SUV;
import motor.Motor;
import motor.MotorSUV;

public class FabricaDeSUV implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
        return new SUV();
    }

    @Override
    public Motor criarMotor() {
        return new MotorSUV();
    }

}
