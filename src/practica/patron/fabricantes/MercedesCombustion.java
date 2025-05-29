package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class MercedesCombustion extends Mercedes {
    
    protected Combustible combustible;
    protected int capacidadDeposito;                                            // En litros.
    protected float consumoMedio;                                               // En litros / 100 km.
    protected int cilindrada;                                                   // En cc.
    
    
    
    
    public MercedesCombustion(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
        super(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero);
        this.combustible = combustible;
        this.capacidadDeposito = capacidadDeposito;
        this.consumoMedio = consumoMedio;
        this.cilindrada = cilindrada;
    }
    
    public Combustible getCombustible() {
		return combustible;
	}
    
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}
	
	public float getConsumoMedio() {
		return consumoMedio;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
    
    @Override
    public String toString() {
    	// return "MercedesCombustion {" + "fabricante=" + fabricante + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", paisFabricante=" + paisFabricante + ", subvencion=" + subvencion + ", precioBase=" + precioBase + ", precioTrasSubvencion=" + precioTrasSubvencion + ", cambio=" + cambio + ", potencia=" + potencia + ", autonomiaMedia=" + autonomiaMedia + ", ruedaRepuesto=" + ruedaRepuesto + ", capacidadPasajeros=" + capacidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", combustible=" + combustible + ", capacidadDeposito=" + capacidadDeposito + ", consumoMedio=" + consumoMedio + ", cilindrada=" + cilindrada + '}';
        return "MercedesCombustion: " + fabricante + " " + modelo + " " + anoModelo +
        		" [País " + paisFabricante + " · Subvencion " + subvencion + "% · Precio Base " + precioBase + " € · Precio Final " + precioTrasSubvencion + "€]" +
        		" Cambio " + cambio + " · " + potencia + "CV · Autonomía Media " + autonomiaMedia + " km · Rueda Repuesto " + (ruedaRepuesto ? "SI" : "NO") + " ·" +
        		" Capacidad Pasajeros " + capacidadPasajeros + " pax · Capacidad Maletero " + capacidadMaletero + " litros ·" +
        		" Combustible " + combustible + " · Capacidad Depósito " + capacidadDeposito + "l · Consumo Medio " + consumoMedio + "l/100 km · Cilindrada " + cilindrada + "cc";
    }
    
}
