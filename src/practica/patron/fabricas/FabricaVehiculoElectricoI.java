package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.Seat;
import practica.patron.utiles.Cambio;




public interface FabricaVehiculoElectricoI {
	
	public Mercedes fabricaMercedesElectrico(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p);
	public Seat fabricaSeatElectrico(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p);
	public Lexus fabricaLexusElectrico(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p);
	public Ford fabricaFordElectrico(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, float capacidadBateria, float consumoMedio, int tiempoCargaTotal, int tiempoCarga80p);
	
}
