package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class FordHibrido extends Ford {
    
    protected Combustible combustible;
    protected int capacidadDeposito;                                            // En litros.
    protected float consumoMedioCombustible;                                    // En litros / 100 km.
    protected int cilindrada;                                                   // En cc.
    
    protected float capacidadBateria;                                           // En kWh.
    
    
    
    
    public FordHibrido(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
        super(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseUSD, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero);
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
        // return "FordHibrido {" + "fabricante=" + fabricante + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", paisFabricante=" + paisFabricante + ", arancel=" + arancel + ", precioBase=" + precioBase + ", precioTrasArancel=" + precioTrasArancel + ", precioBaseUSD=" + precioBaseUSD + ", cambio=" + cambio + ", potencia=" + potencia + ", autonomiaMedia=" + autonomiaMedia + ", ruedaRepuesto=" + ruedaRepuesto + ", capacidadPasajeros=" + capacidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", combustible=" + combustible + ", capacidadDeposito=" + capacidadDeposito + ", consumoMedioCombustible=" + consumoMedioCombustible + ", cilindrada=" + cilindrada + ", capacidadBateria=" + capacidadBateria + '}';
        return "FordHibrido:        " + fabricante + " " + modelo + " " + anoModelo +
        		" [País " + paisFabricante + " · Arancel " + arancel + "% · Precio Base " + precioBase + " € · Precio Final " + precioTrasArancel + "€ · Precio Base Origen " + precioBaseUSD + "$]" +
        		" Cambio " + cambio + " · " + potencia + "CV · Autonomía Media " + autonomiaMedia + " km · Rueda Repuesto " + (ruedaRepuesto ? "SI" : "NO") + " ·" +
        		" Capacidad Pasajeros " + capacidadPasajeros + " pax · Capacidad Maletero " + capacidadMaletero + " litros ·" +
        		" Combustible " + combustible + " · Capacidad Depósito " + capacidadDeposito + "l · Consumo Medio " + consumoMedioCombustible + "l/100 km · Cilindrada " + cilindrada + "cc · Capacidad Batería " + capacidadBateria + "kWh";
    }
    
}
