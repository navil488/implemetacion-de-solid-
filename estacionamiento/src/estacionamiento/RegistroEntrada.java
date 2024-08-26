package estacionamiento;

public class RegistroEntrada {
	private LocalDateTime horaEntrada;
    private Vehiculo vehiculo;

    // Método para registrar la entrada
    public void registrarEntrada(Vehiculo vehiculo) {
        this.horaEntrada = LocalDateTime.now();
        this.vehiculo = vehiculo;
    }
	
	
}
