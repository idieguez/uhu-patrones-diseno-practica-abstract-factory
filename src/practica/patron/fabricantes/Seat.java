package practica.patron.fabricantes;

import practica.patron.utiles.Cambio;




public abstract class Seat {
    
    protected String fabricante;
    protected String modelo;
    protected int anoModelo;
    
    protected String paisFabricante;
    protected float subvencion;
    protected float precioBase;
    protected float precioTrasSubvencion;
    
    protected Cambio cambio;
    protected int potencia;                                                     // En CV.
    protected int autonomiaMedia;                                               // En km, con depósito/batería llenos.
    
    protected Boolean ruedaRepuesto;
    protected int capacidadPasajeros;                                           // Número de pasajeros máximos.
    protected int capacidadMaletero;                                            // En litros.
    
    
    
    
    public Seat(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero) {
        this.fabricante = "Seat";
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.paisFabricante = paisFabricante;
        this.subvencion = subvencion;
        this.precioBase = precioBase;
        this.precioTrasSubvencion = precioTrasSubvencion;
        this.cambio = cambio;
        this.potencia = potencia;
        this.autonomiaMedia = autonomiaMedia;
        this.ruedaRepuesto = ruedaRepuesto;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadMaletero = capacidadMaletero;
    }
    
    public String getFabricante() {
		return fabricante;
	}
    
	public String getModelo() {
		return modelo;
	}
	
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public String getPaisFabricante() {
		return paisFabricante;
	}
	
	public float getSubvencion() {
		return subvencion;
	}
	
	public float getPrecioBase() {
		return precioBase;
	}
	
	public float getPrecioTrasSubvencion() {
		return precioTrasSubvencion;
	}
	
	public Cambio getCambio() {
		return cambio;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public int getAutonomiaMedia() {
		return autonomiaMedia;
	}
	
	public Boolean getRuedaRepuesto() {
		return ruedaRepuesto;
	}
	
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	
	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}
	
	public abstract String toString();
    
}
