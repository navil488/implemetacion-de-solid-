package estacionamiento;

public class RegistroSalida {
	private LocalDateTime horaSalida;
    private RegistroEntrada registroEntrada;

    // Método para registrar la salida y calcular el tiempo de estacionamiento
    public long calcularTiempoEstacionamiento() {
    	Duration duracion = Duration.between(registroEntrada.getHoraEntrada(), horaSalida);
        return duracion.toMinutes(); // Retorna el tiempo en minutos
    }
	
	
}
