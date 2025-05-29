package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.Seat;
import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public interface FabricaVehiculoHibridoI {
	
	public Mercedes fabricaMercedesHibrido(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria);
	public Seat fabricaSeatHibrido(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria);
	public Lexus fabricaLexusHibrido(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria);
	public Ford fabricaFordHibrido(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedioCombustible, int cilindrada, float capacidadBateria);
	
}
