package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;




public class MercedesElectrico extends Mercedes {
    
    protected float capacidadBateria;                                           // En kWh.
    protected float consumoMedio;                                               // En kWh / 100 km.
    protected int tiempoCargaTotal;                                             // En minutos.
    protected int tiempoCarga80p;                                               // En minutos.
    
    
    
    
    public MercedesElectrico(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p) {
        super(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero);
        this.capacidadBateria = capacidadBateria;
        this.consumoMedio = consumoMedio;
        this.tiempoCargaTotal = tiempoCargaTotal;
        this.tiempoCarga80p = tiempoCarga80p;
    }
    
    public float getCapacidadBateria() {
		return capacidadBateria;
	}
    
	public float getConsumoMedio() {
		return consumoMedio;
	}
	
	public int getTiempoCargaTotal() {
		return tiempoCargaTotal;
	}
	
	public int getTiempoCarga80p() {
		return tiempoCarga80p;
	}
    
    @Override
    public String toString() {
    	// return "MercedesElectrico {" + "fabricante=" + fabricante + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", paisFabricante=" + paisFabricante + ", subvencion=" + subvencion + ", precioBase=" + precioBase + ", precioTrasSubvencion=" + precioTrasSubvencion + ", cambio=" + cambio + ", potencia=" + potencia + ", autonomiaMedia=" + autonomiaMedia + ", ruedaRepuesto=" + ruedaRepuesto + ", capacidadPasajeros=" + capacidadPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", capacidadBateria=" + capacidadBateria + ", consumoMedio=" + consumoMedio + ", tiempoCargaTotal=" + tiempoCargaTotal + ", tiempoCarga80p=" + tiempoCarga80p + '}';
        return "MercedesElectrico:  " + fabricante + " " + modelo + " " + anoModelo +
        		" [País " + paisFabricante + " · Subvencion " + subvencion + "% · Precio Base " + precioBase + " € · Precio Final " + precioTrasSubvencion + "€]" +
        		" Cambio " + cambio + " · " + potencia + "CV · Autonomía Media " + autonomiaMedia + " km · Rueda Repuesto " + (ruedaRepuesto ? "SI" : "NO") + " ·" +
        		" Capacidad Pasajeros " + capacidadPasajeros + " pax · Capacidad Maletero " + capacidadMaletero + " litros ·" +
        		" Capacidad Batería " + capacidadBateria + "kWh · Consumo Medio " + consumoMedio + "kWh · Tiempo Carga Total " + tiempoCargaTotal + "min · Tiempo Carga 80% " + tiempoCarga80p + "min";
    }
    
}
