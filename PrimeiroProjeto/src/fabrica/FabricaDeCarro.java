package fabrica;

import carro.Carro;
import motor.Motor;

public interface FabricaDeCarro {
    Carro criarCarro();
    Motor criarMotor();
}
