package estacionamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estacionamiento {
    private List<Vehiculo> vehiculos;
    private Map<String, Double> tarifas;
    private int capacidadMaxima;

    public Estacionamiento(int capacidadMaxima) {
        this.vehiculos = new ArrayList<>();
        this.tarifas = new HashMap<>();
        this.capacidadMaxima = capacidadMaxima;

     
        tarifas.put("automóvil", 20.0);
        tarifas.put("motocicleta", 10.0);
    }

    public boolean estacionarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() >= capacidadMaxima) {
            System.out.println("Estacionamiento lleno.");
            return false;
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public boolean retirarVehiculo(String placa) {
        
        return false;
    }

    public double calcularCosto(String tipoVehiculo, long tiempoEstacionamiento) {
        double costoPorHora = tarifas.getOrDefault(tipoVehiculo, 0.0);
        return (tiempoEstacionamiento / 60.0) * costoPorHora;
    }

    
    public int getCantidadVehiculos() {
        return vehiculos.size();
    }

    public void agregarTarifa(String tipoVehiculo, double costoPorHora) {
        tarifas.put(tipoVehiculo, costoPorHora);
    }

}