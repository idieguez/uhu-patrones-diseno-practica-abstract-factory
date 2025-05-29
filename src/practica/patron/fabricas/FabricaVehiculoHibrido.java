package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.FordHibrido;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.LexusHibrido;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.MercedesHibrido;
import practica.patron.fabricantes.Seat;
import practica.patron.fabricantes.SeatHibrido;
import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class FabricaVehiculoHibrido implements FabricaVehiculoHibridoI {
	
	@Override
	public Mercedes fabricaMercedesHibrido(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
		return new MercedesHibrido(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedioCombustible, cilindrada, capacidadBateria);
	}
	
	@Override
	public Seat fabricaSeatHibrido(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
		return new SeatHibrido(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedioCombustible, cilindrada, capacidadBateria);
	}
	
	@Override
	public Lexus fabricaLexusHibrido(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
		return new LexusHibrido(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseJPY, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedioCombustible, cilindrada, capacidadBateria);
	}
	
	@Override
	public Ford fabricaFordHibrido(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria) {
		return new FordHibrido(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseUSD, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedioCombustible, cilindrada, capacidadBateria);
	}
	
}
