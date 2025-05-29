package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.Seat;
import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public interface FabricaVehiculoCombustionI {
	
	public Mercedes fabricaMercedesCombustion(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada);
	public Seat fabricaSeatCombustion(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada);
	public Lexus fabricaLexusCombustion(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada);
	public Ford fabricaFordCombustion(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada);
	
}
