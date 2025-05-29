package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.FordElectrico;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.LexusElectrico;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.MercedesElectrico;
import practica.patron.fabricantes.Seat;
import practica.patron.fabricantes.SeatElectrico;
import practica.patron.utiles.Cambio;




public class FabricaVehiculoElectrico implements FabricaVehiculoElectricoI {
	
	@Override
	public Mercedes fabricaMercedesElectrico(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p) {
		return new MercedesElectrico(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, capacidadBateria, consumoMedio, tiempoCargaTotal, tiempoCarga80p);
	}
	
	@Override
	public Seat fabricaSeatElectrico(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p) {
		return new SeatElectrico(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, capacidadBateria, consumoMedio, tiempoCargaTotal, tiempoCarga80p);
	}
	
	@Override
	public Lexus fabricaLexusElectrico(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p) {
		return new LexusElectrico(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseJPY, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, capacidadBateria, consumoMedio, tiempoCargaTotal, tiempoCarga80p);
	}
	
	@Override
	public Ford fabricaFordElectrico(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p) {
		return new FordElectrico(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseUSD, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, capacidadBateria, consumoMedio, tiempoCargaTotal, tiempoCarga80p);
	}
	
}
