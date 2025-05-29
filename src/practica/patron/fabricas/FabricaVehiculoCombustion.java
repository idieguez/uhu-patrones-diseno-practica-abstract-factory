package practica.patron.fabricas;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.FordCombustion;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.LexusCombustion;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.MercedesCombustion;
import practica.patron.fabricantes.Seat;
import practica.patron.fabricantes.SeatCombustion;
import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class FabricaVehiculoCombustion implements FabricaVehiculoCombustionI {
	
	@Override
	public Mercedes fabricaMercedesCombustion(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
		return new MercedesCombustion(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedio, cilindrada);
	}
	
	@Override
	public Seat fabricaSeatCombustion(String modelo, int anoModelo, String paisFabricante, float subvencion, float precioBase, float precioTrasSubvencion, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
		return new SeatCombustion(modelo, anoModelo, paisFabricante, subvencion, precioBase, precioTrasSubvencion, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedio, cilindrada);
	}
	
	@Override
	public Lexus fabricaLexusCombustion(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseJPY, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
		return new LexusCombustion(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseJPY, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedio, cilindrada);
	}
	
	@Override
	public Ford fabricaFordCombustion(String modelo, int anoModelo, String paisFabricante, float arancel, float precioBase, float precioTrasArancel, float precioBaseUSD, Cambio cambio, int potencia, int autonomiaMedia, Boolean ruedaRepuesto, int capacidadPasajeros, int capacidadMaletero, Combustible combustible, int capacidadDeposito, float consumoMedio, int cilindrada) {
		return new FordCombustion(modelo, anoModelo, paisFabricante, arancel, precioBase, precioTrasArancel, precioBaseUSD, cambio, potencia, autonomiaMedia, ruedaRepuesto, capacidadPasajeros, capacidadMaletero, combustible, capacidadDeposito, consumoMedio, cilindrada);
	}
	
}
