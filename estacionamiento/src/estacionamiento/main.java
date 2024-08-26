package estacionamiento;



public class main {
    public static void main(String[] args) {
        
        Estacionamiento estacionamiento = new Estacionamiento(100);

        
        Vehiculo vehiculo = new Vehiculo("Automóvil", "ABC123", "Toyota");
        RegistroEntrada entrada = new RegistroEntrada(vehiculo);
        estacionamiento.estacionarVehiculo(vehiculo);

      
        RegistroSalida salida = new RegistroSalida(entrada);
    
    
        CalculadorCosto calculador = new CalculadorCosto(20.0);
        GeneradorRecibo generador = new GeneradorRecibo(entrada, salida, calculador);
        String recibo = generador.generarRecibo();
        System.out.println(recibo);

        // Mostrar información adicional
        System.out.println("Cantidad de vehículos estacionados: " + estacionamiento.getCantidadVehiculos());
    }

}
