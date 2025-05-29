package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class SeatHibrido extends Seat {
    
    protected Combustible combustible;
    protected int capacidadDeposito;                                            // En litros.
    protected float consumoMedioCombustible;                                    // En litros / 100 km.
    protected int cilindrada;                                                   // En cc.
    
    protected float capacidadBateria;                                           // En kWh.
    
    
    
    
    public SeatHibrido(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
        super(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero);
        this.combustible = combustible;
        this.capacidadDeposito = capacidadDeposito;
        this.consumoMedioCombustible = consumoMedioCombustible;
        this.cilindrada = cilindrada;
        this.capacidadBateria = capacidadBateria;
    }
    
    public Combustible getCombustible() {
		return combustible;
	}
    
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}
	
	public float getConsumoMedioCombustible() {
		return consumoMedioCombustible;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public float getCapacidadBateria() {
		return capacidadBateria;
	}
    
    @Override
    public String toString() {
        // return "SeatHibrido {" + "fabricante=" + fabricante + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", paisFabricante=" + paisFabricante + ", subvencion=" + subvencion + ", precioBase=" + precioBase + ", precioTrasSubvencion=" + precioTrasSubvencion + ", cambio=" + cambio + ", potencia=" + potencia + ", autonomiaMedia=" + autonomiaMedia + ", ruedaRepuesto=" + ruedaRepuesto + ", capacidadPasajeros=" + capacidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", combustible=" + combustible + ", capacidadDeposito=" + capacidadDeposito + ", consumoMedioCombustible=" + consumoMedioCombustible + ", cilindrada=" + cilindrada + ", capacidadBateria=" + capacidadBateria + '}';
        return "SeatHibrido:        " + fabricante + " " + modelo + " " + anoModelo +
        		" [País " + paisFabricante + " · Subvencion " + subvencion + "% · Precio Base " + precioBase + " € · Precio Final " + precioTrasSubvencion + "€]" +
        		" Cambio " + cambio + " · " + potencia + "CV · Autonomía Media " + autonomiaMedia + " km · Rueda Repuesto " + (ruedaRepuesto ? "SI" : "NO") + " ·" +
        		" Capacidad Pasajeros " + capacidadPasajeros + " pax · Capacidad Maletero " + capacidadMaletero + " litros ·" +
        		" Combustible " + combustible + " · Capacidad Depósito " + capacidadDeposito + "l · Consumo Medio " + consumoMedioCombustible + "l/100 km · Cilindrada " + cilindrada + "cc · Capacidad Batería " + capacidadBateria + "kWh";
    }
    
}
