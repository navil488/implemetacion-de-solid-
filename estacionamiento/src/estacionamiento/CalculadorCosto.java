package estacionamiento;

public class CalculadorCosto {

	private final double costoPorHoraBase;

    public CalculadorCosto(double costoPorHoraBase) {
        this.costoPorHoraBase = costoPorHoraBase;
    }

    public double calcularCostoTotal(long tiempoEstacionamiento) {
    
        double costoPorHora = costoPorHoraBase;
        if (tiempoEstacionamiento > 120) { // Descuento por más de 2 horas
            costoPorHora *= 0.8;
        }
        return (tiempoEstacionamiento / 60.0) * costoPorHora;
    }
	
}
