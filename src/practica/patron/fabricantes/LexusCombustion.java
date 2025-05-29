package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class LexusCombustion extends Lexus {
    
    protected Combustible combustible;
    protected int capacidadDeposito;                                            // En litros.
    protected float consumoMedio;                                               // En litros / 100 km.
    protected int cilindrada;                                                   // En cc.
    
    
    
    
    public LexusCombustion(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
        super(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseJPY, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero);
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
        // return "LexusCombustion {" + "fabricante=" + fabricante + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", paisFabricante=" + paisFabricante + ", arancel=" + arancel + ", precioBase=" + precioBase + ", precioTrasArancel=" + precioTrasArancel + ", precioBaseJPY=" + precioBaseJPY + ", cambio=" + cambio + ", potencia=" + potencia + ", autonomiaMedia=" + autonomiaMedia + ", ruedaRepuesto=" + ruedaRepuesto + ", capacidadPasajeros=" + capacidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", combustible=" + combustible + ", capacidadDeposito=" + capacidadDeposito + ", consumoMedio=" + consumoMedio + ", cilindrada=" + cilindrada + '}';
        return "LexusCombustion:    " + fabricante + " " + modelo + " " + anoModelo +
        		" [País " + paisFabricante + " · Arancel " + arancel + "% · Precio Base " + precioBase + " € · Precio Final " + precioTrasArancel + "€ · Precio Base Origen " + precioBaseJPY + "¥]" +
        		" Cambio " + cambio + " · " + potencia + "CV · Autonomía Media " + autonomiaMedia + " km · Rueda Repuesto " + (ruedaRepuesto ? "SI" : "NO") + " ·" +
        		" Capacidad Pasajeros " + capacidadPasajeros + " pax · Capacidad Maletero " + capacidadMaletero + " litros ·" +
        		" Combustible " + combustible + " · Capacidad Depósito " + capacidadDeposito + "l · Consumo Medio " + consumoMedio + "l/100 km · Cilindrada " + cilindrada + "cc";
    }
    
}
