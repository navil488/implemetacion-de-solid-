package estacionamiento;

public class GeneradorRecibo {

	  private final RegistroEntrada registroEntrada;
	    private final RegistroSalida registroSalida;
	    private final CalculadorCosto calculadorCosto;

	    public GeneradorRecibo(RegistroEntrada entrada, RegistroSalida salida, CalculadorCosto calculador) {
	        this.registroEntrada = entrada;
	        this.registroSalida = salida;
	        this.calculadorCosto = calculador;
	    }

	    public String generarRecibo() {
	        if (registroSalida.getHoraSalida() == null) {
	            throw new IllegalStateException("La hora de salida no ha sido registrada.");
	        }

	        double costoTotal = calculadorCosto.calcularCostoTotal(
	            registroSalida.calcularTiempoEstacionamiento()
	        );

	        String recibo = "*** Recibo de Estacionamiento ***\n" +
	                       "Placa: " + registroEntrada.getVehiculo().getPlaca() + "\n" +
	                       "Hora de entrada: " + registroEntrada.getHoraEntrada() + "\n" +
	                       "Hora de salida: " + registroSalida.getHoraSalida() + "\n" +
	                       "Tiempo de estacionamiento: " + registroSalida.calcularTiempoEstacionamiento() + " minutos\n" +
	                       "Costo total: $" + costoTotal;
	        return recibo;
    }
	
}
