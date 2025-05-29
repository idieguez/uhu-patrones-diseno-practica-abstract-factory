package practica.patron.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;

import practica.patron.fabricantes.Ford;
import practica.patron.fabricantes.FordCombustion;
import practica.patron.fabricantes.FordElectrico;
import practica.patron.fabricantes.FordHibrido;
import practica.patron.fabricantes.Lexus;
import practica.patron.fabricantes.LexusCombustion;
import practica.patron.fabricantes.LexusElectrico;
import practica.patron.fabricantes.LexusHibrido;
import practica.patron.fabricantes.Mercedes;
import practica.patron.fabricantes.MercedesCombustion;
import practica.patron.fabricantes.MercedesElectrico;
import practica.patron.fabricantes.MercedesHibrido;
import practica.patron.fabricantes.Seat;
import practica.patron.fabricantes.SeatCombustion;
import practica.patron.fabricantes.SeatElectrico;
import practica.patron.fabricantes.SeatHibrido;
import practica.patron.fabricas.FabricaVehiculoCombustion;
import practica.patron.fabricas.FabricaVehiculoCombustionI;
import practica.patron.fabricas.FabricaVehiculoElectrico;
import practica.patron.fabricas.FabricaVehiculoElectricoI;
import practica.patron.fabricas.FabricaVehiculoHibrido;
import practica.patron.fabricas.FabricaVehiculoHibridoI;
import practica.patron.utiles.Cambio;
import practica.patron.utiles.Combustible;




public class Main {
	
	private static List<Ford> vehiculosFord = null;
	private static List<Lexus> vehiculosLexus = null;
	private static List<Mercedes> vehiculosMercedes = null;
	private static List<Seat> vehiculosSeat = null;
    
    private static final String COLOR_RESET = "\u001B[0m";
    private static final String COLOR_ROJO = "\u001B[31m";
    private static final String COLOR_SUBR_ROJO = "\u001B[41m";
    
    
    
    
    
    
	
	
	
	
	public static void main(String[] args) {
        
		// Creación del catálogo de vehículos.
		crearCatalogoVehiculos();
    	
		// Mostrado del menú e interacción con el usuario.
		mostrarMenu();
        
    }
	
	
	
	
	
	
	
	
	
	
	private static void mostrarMenu() {
		
		System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--  MOTORES 360                                                                                                       --");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Bienvenido a 'Motores 360', su concesionario de vehículos multimarca.");
        System.out.println("Espere mientras conectamos con el servidor...");
        LockSupport.parkNanos(2_000_000_000L);
        
        System.out.println("");
        System.out.println(COLOR_SUBR_ROJO + "[Esta es una aplicación de uso académico.]" + COLOR_RESET);
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
        	
        	System.out.println("Seleccione una opción del menú:");
            System.out.println("");
            System.out.println("1. Mostrar catálogo completo.");
            System.out.println("2. Filtrar catálogo por fabricante.");
            System.out.println("3. Filtrar catálogo por motorización.");
            System.out.println("4. Filtrar catálogo por año del modelo.");
            System.out.println("5. Filtrar catálogo por precio.");
            System.out.println("6. Filtrar catálogo por tipo de cambio.");
            System.out.println("7. Filtrar catálogo por capacidad de pasajeros.");
            System.out.println("8. Filtrar catálogo por capacidad del maletero.");
            System.out.println("9. Filtrar catálogo por características propias de cada motorización.");
            System.out.println("0. Salir.");
            System.out.println("");
            
            System.out.print  ("Selección: ");
        	
            opcion = scanner.nextInt();
            scanner.nextLine();																					// Limpiar el buffer.
            System.out.println("");
            
            switch (opcion) {
                
            	
                // 1. Mostrar catálogo completo.
                case 1:
                    System.out.println("Opción 1. Mostrar catálogo completo.");
                    System.out.println("");
                    mostrarCatalogoCompleto();
                    break;
                
                    
                // 2. Filtrar catálogo por fabricante.
                case 2:
                    System.out.println("Opción 2. Filtrar catálogo por fabricante.");
                    System.out.println("");
                    System.out.println("Seleccione el fabricante:");
                    System.out.println("");
                    System.out.println("1. Ford.");
                    System.out.println("2. Lexus.");
                    System.out.println("3. Mercedes.");
                    System.out.println("4. Seat.");
                    System.out.println("");
                    System.out.print  ("Selección: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    if (opcion >= 1 && opcion <= 4) {
                    	mostrarCatalogoPorFabricante(opcion);
                    	
                    } else {
                    	System.out.println("Opción inválida.");
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                // 3. Filtrar catálogo por motorización.
                case 3:
                    System.out.println("Opción 3. Filtrar catálogo por motorización.");
                    System.out.println("");
                    System.out.println("Seleccione el tipo de motor:");
                    System.out.println("");
                    System.out.println("1. Combustión.");
                    System.out.println("2. Eléctrico.");
                    System.out.println("3. Híbrido.");
                    System.out.println("");
                    System.out.print  ("Selección: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    if (opcion >= 1 && opcion <= 3) {
                    	mostrarCatalogoPorMotorizacion(opcion);
                    	
                    } else {
                    	System.out.println("Opción inválida.");
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                // 4. Filtrar catálogo por año del modelo.
                case 4:
                    System.out.println("Opción 4. Filtrar catálogo por año del modelo.");
                    System.out.println("");
                    System.out.print  ("Indique el año del modelo: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    if (ano >= 1900) {
                    	mostrarCatalogoPorAnoModelo(ano);
                    	
                    } else {
                    	System.out.println("Año inválido.");
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                // 5. Filtrar catálogo por precio.
                case 5:
                    System.out.println("Opción 5. Filtrar catálogo por precio.");
                    System.out.println("");
                    System.out.println("Seleccione cómo quiere filtrar el precio:");
                    System.out.println("");
                    System.out.println("1. Indicar precio máximo.");
                    System.out.println("2. Indicar precio mínimo.");
                    System.out.println("");
                    System.out.print  ("Selección: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    switch (opcion) {
                    	case 1:
                    		System.out.print  ("Indique el precio máximo: ");
                        	int precioMax = scanner.nextInt();
                            scanner.nextLine();																	// Limpiar el buffer.
                            System.out.println("");
                        	mostrarCatalogoPorPrecioMaximo(precioMax);
                    		break;
                    		
                    	case 2:
                    		System.out.print  ("Indique el precio mínimo: ");
                        	int precioMin = scanner.nextInt();
                            scanner.nextLine();																	// Limpiar el buffer.
                            System.out.println("");
                        	mostrarCatalogoPorPrecioMinimo(precioMin);
                    		break;
                    		
                    	default:
                    		System.out.println("Opción inválida.");
                            System.out.println("");
                    		
                    }
                    
                    break;
                    
                    
                // 6. Filtrar catálogo por tipo de cambio.
                case 6:
                    System.out.println("Opción 6. Filtrar catálogo por tipo de cambio.");
                    System.out.println("");
                    System.out.println("Seleccione el tipo de cambio que desea:");
                    System.out.println("");
                    System.out.println("1. Manual.");
                    System.out.println("2. Automático.");
                    System.out.println("");
                    System.out.print  ("Selección: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    switch (opcion) {
	                	case 1:
	                		mostrarCatalogoPorTipoCambio(Cambio.MANUAL);
	                		break;
	                		
	                	case 2:
	                		mostrarCatalogoPorTipoCambio(Cambio.AUTOMATICO);
	                		break;
	                		
	                	default:
	                		System.out.println("Opción inválida.");
	                        System.out.println("");
	                		
	                }
                    
                    break;
                    
                    
                // 7. Filtrar catálogo por capacidad de pasajeros.
                case 7:
                    System.out.println("Opción 7. Filtrar catálogo por capacidad de pasajeros.");
                    System.out.println("");
                    System.out.print  ("Indique el mínimo número de pasajeros: ");
                    int numPasajeros = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    if (numPasajeros > 0) {
                    	mostrarCatalogoPorCapacidadMinimaPasajeros(numPasajeros);
                    	
                    } else {
                    	System.out.println("Número de pasajeros inválido.");
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                // 8. Filtrar catálogo por capacidad del maletero.
                case 8:
                    System.out.println("Opción 8. Filtrar catálogo por capacidad del maletero.");
                    System.out.println("");
                    System.out.print  ("Indique la capacidad mínima del maletero (en litros): ");
                    int litrosMaletero = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    if (litrosMaletero > 0) {
                    	mostrarCatalogoPorCapacidadMinimaMaletero(litrosMaletero);
                    	
                    } else {
                    	System.out.println("Capacidad del maletero inválida.");
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                // 9. Filtrar catálogo por características propias de cada motorización.
                case 9:
                    System.out.println("Opción 9. Filtrar catálogo por características propias de cada motorización.");
                    System.out.println("");
                    System.out.println("Seleccione la característica por la que quiere filtrar:");
                    System.out.println("");
                    System.out.println("1. Vehículo combustión: consumo medio.");
                    System.out.println("2. Vehículo eléctrico:  consumo medio.");
                    System.out.println("3. Vehículo eléctrico:  capacidad de batería.");
                    System.out.println("4. Vehículo híbrido:    consumo medio.");
                    System.out.println("");
                    System.out.print  ("Selección: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();																			// Limpiar el buffer.
                    System.out.println("");
                    
                    switch (opcion) {
	                	case 1:
	                		System.out.print  ("(Vehículo combustión) Indique el consumo medio máximo deseado (en litros / 100 km): ");
	                        float consumoMedioLitros = scanner.nextFloat();
	                        scanner.nextLine();																	// Limpiar el buffer.
	                        System.out.println("");
	                        mostrarCatalogoCombustiblePorConsumoMedioMaximo(consumoMedioLitros);
	                		break;
	                		
	                	case 2:
	                		System.out.print  ("(Vehículo eléctrico) Indique el consumo medio máximo deseado (en kWh / 100 km): ");
	                        float consumoMedioKwh = scanner.nextFloat();
	                        scanner.nextLine();																	// Limpiar el buffer.
	                        System.out.println("");
	                        mostrarCatalogoElectricoPorConsumoMedioMaximo(consumoMedioKwh);
	                		break;
	                		
	                	case 3:
	                		System.out.print  ("(Vehículo eléctrico) Indique la mínima capacidad de batería deseada (en kWh): ");
	                        float capacidadBateriaKwh = scanner.nextFloat();
	                        scanner.nextLine();																	// Limpiar el buffer.
	                        System.out.println("");
	                        mostrarCatalogoElectricoPorCapacidadBateriaMinima(capacidadBateriaKwh);
	                		break;
	                		
	                	case 4:
	                		System.out.print  ("(Vehículo híbrido) Indique el consumo medio máximo deseado para el motor de combustión (en litros / 100 km): ");
	                        float consumoMedioLitros2 = scanner.nextFloat();
	                        scanner.nextLine();																	// Limpiar el buffer.
	                        System.out.println("");
	                        mostrarCatalogoHibridoPorConsumoMedioMaximo(consumoMedioLitros2);
	                		break;
	                		
	                	default:
	                		System.out.println("Opción inválida.");
	                        System.out.println("");
	                		
	                }
                    
                    break;
                    
                // 0. Salir.
                case 0:
                    System.out.println("Gracias por visitar 'Motores 360'. ¡Que tenga un buen día!");
                    LockSupport.parkNanos(2_000_000_000L);
                    break;
                    
                    
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    System.out.println("");
                    
            }
            
        } while (opcion != 0);
        
        scanner.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoCompleto() {
		
		System.out.println("[Vehículos Ford]");
		vehiculosFord.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("[Vehículos Lexus]");
		vehiculosLexus.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("[Vehículos Mercedes]");
		vehiculosMercedes.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("[Vehículos Seat]");
		vehiculosSeat.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorFabricante(int opcion) {
		
		switch (opcion) {
			
			case 1:
				vehiculosFord.forEach(System.out::println);
				break;
			
			case 2:
				vehiculosLexus.forEach(System.out::println);
				break;
			
			case 3:
				vehiculosMercedes.forEach(System.out::println);
				break;
			
			case 4:
				vehiculosSeat.forEach(System.out::println);
				break;
			
			default:
				
		}
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorMotorizacion(int opcion) {
		
		switch (opcion) {
			
	        case 1:
	            vehiculosFord.stream()
		            .filter(v -> v instanceof FordCombustion)
		            .forEach(System.out::println);
	            vehiculosLexus.stream()
		            .filter(v -> v instanceof LexusCombustion)
		            .forEach(System.out::println);
	            vehiculosMercedes.stream()
		            .filter(v -> v instanceof MercedesCombustion)
		            .forEach(System.out::println);
	            vehiculosSeat.stream()
		            .filter(v -> v instanceof SeatCombustion)
		            .forEach(System.out::println);
	            break;
	            
	        case 2:
	            vehiculosFord.stream()
		            .filter(v -> v instanceof FordElectrico)
		            .forEach(System.out::println);
	            vehiculosLexus.stream()
		            .filter(v -> v instanceof LexusElectrico)
		            .forEach(System.out::println);
	            vehiculosMercedes.stream()
		            .filter(v -> v instanceof MercedesElectrico)
		            .forEach(System.out::println);
	            vehiculosSeat.stream()
		            .filter(v -> v instanceof SeatElectrico)
		            .forEach(System.out::println);
	            break;
	            
	        case 3:
	            vehiculosFord.stream()
		            .filter(v -> v instanceof FordHibrido)
		            .forEach(System.out::println);
	            vehiculosLexus.stream()
		            .filter(v -> v instanceof LexusHibrido)
		            .forEach(System.out::println);
	            vehiculosMercedes.stream()
		            .filter(v -> v instanceof MercedesHibrido)
		            .forEach(System.out::println);
	            vehiculosSeat.stream()
		            .filter(v -> v instanceof SeatHibrido)
		            .forEach(System.out::println);
	            break;
	            
	        default:
	            
		}
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorAnoModelo(int ano) {
		
	    vehiculosFord.stream()
	    	.filter(v -> v.getAnoModelo() == ano)
	    	.forEach(System.out::println);
	    
	    vehiculosLexus.stream()
	    	.filter(v -> v.getAnoModelo() == ano)
	    	.forEach(System.out::println);
	    
	    vehiculosMercedes.stream()
	    	.filter(v -> v.getAnoModelo() == ano)
	    	.forEach(System.out::println);
	    
	    vehiculosSeat.stream()
	    	.filter(v -> v.getAnoModelo() == ano)
	    	.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorPrecioMaximo(int precio) {
		
	    vehiculosFord.stream()
	        .filter(v -> v.getPrecioTrasArancel() <= precio)
	        .forEach(System.out::println);
	    
	    vehiculosLexus.stream()
	        .filter(v -> v.getPrecioTrasArancel() <= precio)
	        .forEach(System.out::println);
	    
	    vehiculosMercedes.stream()
	        .filter(v -> v.getPrecioTrasSubvencion() <= precio)
	        .forEach(System.out::println);
	    
	    vehiculosSeat.stream()
	        .filter(v -> v.getPrecioTrasSubvencion() <= precio)
	        .forEach(System.out::println);
	    
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorPrecioMinimo(int precio) {
		
	    vehiculosFord.stream()
			.filter(v -> v.getPrecioTrasArancel() >= precio)
			.forEach(System.out::println);

	    vehiculosLexus.stream()
			.filter(v -> v.getPrecioTrasArancel() >= precio)
			.forEach(System.out::println);

	    vehiculosMercedes.stream()
			.filter(v -> v.getPrecioTrasSubvencion() >= precio)
			.forEach(System.out::println);

	    vehiculosSeat.stream()
			.filter(v -> v.getPrecioTrasSubvencion() >= precio)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorTipoCambio(Cambio cambio) {
		
		vehiculosFord.stream()
	        .filter(v -> v.getCambio() == cambio)
	        .forEach(System.out::println);
		
		vehiculosLexus.stream()
			.filter(v -> v.getCambio() == cambio)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v.getCambio() == cambio)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v.getCambio() == cambio)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorCapacidadMinimaPasajeros(int numPasajeros) {
		
		vehiculosFord.stream()
			.filter(v -> v.getCapacidadPasajeros() >= numPasajeros)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v.getCapacidadPasajeros() >= numPasajeros)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v.getCapacidadPasajeros() >= numPasajeros)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v.getCapacidadPasajeros() >= numPasajeros)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoPorCapacidadMinimaMaletero(int litrosMaletero) {
		
		vehiculosFord.stream()
			.filter(v -> v.getCapacidadMaletero() >= litrosMaletero)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v.getCapacidadMaletero() >= litrosMaletero)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v.getCapacidadMaletero() >= litrosMaletero)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v.getCapacidadMaletero() >= litrosMaletero)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoCombustiblePorConsumoMedioMaximo(float consumoMedioLitros) {
		
		vehiculosFord.stream()
			.filter(v -> v instanceof FordCombustion)
			.map(v -> (FordCombustion) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioLitros)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v instanceof LexusCombustion)
			.map(v -> (LexusCombustion) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioLitros)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v instanceof MercedesCombustion)
			.map(v -> (MercedesCombustion) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioLitros)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v instanceof SeatCombustion)
			.map(v -> (SeatCombustion) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioLitros)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoElectricoPorConsumoMedioMaximo(float consumoMedioKwh) {
		
		vehiculosFord.stream()
			.filter(v -> v instanceof FordElectrico)
			.map(v -> (FordElectrico) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioKwh)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v instanceof LexusElectrico)
			.map(v -> (LexusElectrico) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioKwh)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v instanceof MercedesElectrico)
			.map(v -> (MercedesElectrico) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioKwh)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v instanceof SeatElectrico)
			.map(v -> (SeatElectrico) v)
			.filter(v -> v.getConsumoMedio() <= consumoMedioKwh)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoElectricoPorCapacidadBateriaMinima(float capacidadBateriaKwh) {
		
		vehiculosFord.stream()
			.filter(v -> v instanceof FordElectrico)
			.map(v -> (FordElectrico) v)
			.filter(v -> v.getCapacidadBateria() >= capacidadBateriaKwh)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v instanceof LexusElectrico)
			.map(v -> (LexusElectrico) v)
			.filter(v -> v.getCapacidadBateria() >= capacidadBateriaKwh)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v instanceof MercedesElectrico)
			.map(v -> (MercedesElectrico) v)
			.filter(v -> v.getCapacidadBateria() >= capacidadBateriaKwh)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v instanceof SeatElectrico)
			.map(v -> (SeatElectrico) v)
			.filter(v -> v.getCapacidadBateria() >= capacidadBateriaKwh)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void mostrarCatalogoHibridoPorConsumoMedioMaximo(float consumoMedioLitros2) {
		
		vehiculosFord.stream()
			.filter(v -> v instanceof FordHibrido)
			.map(v -> (FordHibrido) v)
			.filter(v -> v.getConsumoMedioCombustible() <= consumoMedioLitros2)
			.forEach(System.out::println);

		vehiculosLexus.stream()
			.filter(v -> v instanceof LexusHibrido)
			.map(v -> (LexusHibrido) v)
			.filter(v -> v.getConsumoMedioCombustible() <= consumoMedioLitros2)
			.forEach(System.out::println);

		vehiculosMercedes.stream()
			.filter(v -> v instanceof MercedesHibrido)
			.map(v -> (MercedesHibrido) v)
			.filter(v -> v.getConsumoMedioCombustible() <= consumoMedioLitros2)
			.forEach(System.out::println);

		vehiculosSeat.stream()
			.filter(v -> v instanceof SeatHibrido)
			.map(v -> (SeatHibrido) v)
			.filter(v -> v.getConsumoMedioCombustible() <= consumoMedioLitros2)
			.forEach(System.out::println);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void crearCatalogoVehiculos() {
		
		// Listas de vehículos.
		vehiculosFord = new ArrayList<Ford>();
		vehiculosLexus = new ArrayList<Lexus>();
		vehiculosMercedes = new ArrayList<Mercedes>();
		vehiculosSeat = new ArrayList<Seat>();
		
		
		// Fábrica de Vehículos Combustión.
		FabricaVehiculoCombustionI fabricaVehiculoCombustion = new FabricaVehiculoCombustion();
		
		vehiculosFord.add(		fabricaVehiculoCombustion.fabricaFordCombustion(		"Bronco Outer Banks", 2023, "EEUU", 30, 55000.00f, 71500.00f, 62274.26f, Cambio.AUTOMATICO, 335, 450, true, 5, 500, Combustible.GASOLINA, 80, 12.00f, 2694));
		vehiculosFord.add(		fabricaVehiculoCombustion.fabricaFordCombustion(		"Explorer XLT", 2024, "EEUU",30f, 58000.00f, 75400.00f, 65656.00f,Cambio.AUTOMATICO, 300, 650, true, 7, 600,Combustible.GASOLINA, 70, 10.50f, 2300));
		vehiculosLexus.add(		fabricaVehiculoCombustion.fabricaLexusCombustion(		"RC Luxury", 2023, "Japón", 15, 103800.00f, 119370.00f, 16780308.00f, Cambio.AUTOMATICO, 477, 500, true, 4, 366, Combustible.GASOLINA, 66, 11.00f, 5000));
		vehiculosLexus.add(		fabricaVehiculoCombustion.fabricaLexusCombustion(		"IS 300", 2024, "Japón",15f, 50000.00f, 57500.00f, 8085000.00f,Cambio.AUTOMATICO, 241, 580, false, 5, 480,Combustible.GASOLINA, 50, 8.50f, 2494));
		vehiculosMercedes.add(	fabricaVehiculoCombustion.fabricaMercedesCombustion(	"Vito PRO", 2023, "Alemania", 10, 52562.22f, 47306.00f, Cambio.MANUAL, 136, 1241, true, 9, 990, Combustible.DIESEL, 70, 5.80f, 1950));
		vehiculosMercedes.add(	fabricaVehiculoCombustion.fabricaMercedesCombustion(	"C 200", 2024, "Alemania",10f, 60000.00f, 54000.00f,Cambio.AUTOMATICO, 204, 620, false, 5, 455,Combustible.GASOLINA, 50, 7.00f, 1991));
		vehiculosSeat.add(		fabricaVehiculoCombustion.fabricaSeatCombustion(		"Ibiza", 2023, "España", 10, 17222.22f, 15500.00f, Cambio.MANUAL, 80, 355, false, 5, 0, Combustible.GASOLINA, 40, 5.30f, 999));
		vehiculosSeat.add(		fabricaVehiculoCombustion.fabricaSeatCombustion(		"León FR", 2024, "España",10f, 25000.00f, 22500.00f,Cambio.MANUAL, 150, 500, false, 5, 380,Combustible.GASOLINA, 45, 5.80f, 1498));
		
		
		// Fábrica de Vehículos Eléctrico.
		FabricaVehiculoElectricoI fabricaVehiculoElectrico = new FabricaVehiculoElectrico();
		
		vehiculosFord.add(		fabricaVehiculoElectrico.fabricaFordElectrico(			"Mustang Mach-E GT", 2025, "EEUU", 20, 81428.00f, 97713.60f, 92213.14f, Cambio.AUTOMATICO, 487, 490, false, 5, 443, 98.8f, 21.20f, 10*60, 45));
		vehiculosFord.add(		fabricaVehiculoElectrico.fabricaFordElectrico(			"F-150 Lightning Platinum", 2025, "EEUU",20f, 70000.00f, 84000.00f, 79240.00f,Cambio.AUTOMATICO, 580, 480, false, 5, 440,98.00f, 24.00f, 15 * 60, 45));
		vehiculosLexus.add(		fabricaVehiculoElectrico.fabricaLexusElectrico(			"RZ", 2025, "Japón", 10, 53905.00f, 59295.50f, 8707382.46f, Cambio.AUTOMATICO, 313, 470, false, 5, 322, 71.40f, 16.00f, 10*60, 38));
		vehiculosLexus.add(		fabricaVehiculoElectrico.fabricaLexusElectrico(			"UX 300e", 2025, "Japón",10f, 45000.00f, 49500.00f, 7276500.00f,Cambio.AUTOMATICO, 204, 305, false, 5, 364,54.00f, 17.50f, 11 * 60, 30));
		vehiculosMercedes.add(	fabricaVehiculoElectrico.fabricaMercedesElectrico(		"Maybach EQS SUV", 2025, "Alemania", 20, 244996.83f, 220497.15f, Cambio.AUTOMATICO, 658, 600, true, 5, 645, 118.00f, 23.00f, 11*60, 31));
		vehiculosMercedes.add(	fabricaVehiculoElectrico.fabricaMercedesElectrico(		"EQA 250+", 2025, "Alemania",20f, 50000.00f, 40000.00f,Cambio.AUTOMATICO, 190, 420, false, 5, 340,66.50f, 17.30f, 10 * 60, 30));
		vehiculosSeat.add(		fabricaVehiculoElectrico.fabricaSeatElectrico(			"Ateca", 2025, "España", 20, 31666.67f, 28500.00f, Cambio.AUTOMATICO, 204, 420, false, 5, 510, 77.00f, 18.30f, 8*60, 35));
		vehiculosSeat.add(		fabricaVehiculoElectrico.fabricaSeatElectrico(			"Born", 2025, "España",20f, 35000.00f, 28000.00f,Cambio.AUTOMATICO, 204, 420, false, 5, 385,58.00f, 16.70f, 12 * 60, 35));
		
		
		// Fábrica de Vehículos Híbrido.
		FabricaVehiculoHibridoI fabricaVehiculoHibrido = new FabricaVehiculoHibrido();
		
		vehiculosFord.add(		fabricaVehiculoHibrido.fabricaFordHibrido(				"Kuga Titanium", 2024, "EEUU", 20, 40000.00f, 48000.00f, 45298.00f, Cambio.AUTOMATICO, 183, 700, true, 5, 475, Combustible.GASOLINA, 54, 5.50f, 2500, 1.10f));
		vehiculosFord.add(		fabricaVehiculoHibrido.fabricaFordHibrido(				"Mondeo Hybrid", 2024, "EEUU",20f, 35000.00f, 42000.00f, 39620.00f,Cambio.AUTOMATICO, 187, 700, true, 5, 450,Combustible.GASOLINA, 45, 4.80f, 2000, 1.40f));
		vehiculosLexus.add(		fabricaVehiculoHibrido.fabricaLexusHibrido(				"LBX", 2024, "Japón", 10, 34300.00f, 37730.00f, 5540547.60f, Cambio.AUTOMATICO, 136, 600, false, 5, 402, Combustible.GASOLINA, 36, 4.50f, 1490, 1.50f));
		vehiculosLexus.add(		fabricaVehiculoHibrido.fabricaLexusHibrido(				"NX 350h", 2024, "Japón",15f, 40000.00f, 46000.00f, 6468000.00f,Cambio.AUTOMATICO, 239, 600, false, 5, 520,Combustible.GASOLINA, 55, 5.30f, 2494, 1.87f));
		vehiculosMercedes.add(	fabricaVehiculoHibrido.fabricaMercedesHibrido(			"AMG GLC", 2024, "Alemania", 15, 102764.34f, 92487.91f, Cambio.AUTOMATICO, 421, 680, true, 5, 620, Combustible.GASOLINA, 66, 10.30f, 1991, 1.50f));
		vehiculosMercedes.add(	fabricaVehiculoHibrido.fabricaMercedesHibrido(			"GLC 300e", 2024, "Alemania",15f, 70000.00f, 59500.00f,Cambio.AUTOMATICO, 320, 700, true, 5, 550,Combustible.GASOLINA, 50, 2.70f, 1991, 31.20f));
		vehiculosSeat.add(		fabricaVehiculoHibrido.fabricaSeatHibrido(				"León", 2024, "España", 15, 25826.67f, 23244.00f, Cambio.MANUAL, 85, 850, true, 5, 380, Combustible.GASOLINA, 45, 5.60f, 1498, 0.72f));
		vehiculosSeat.add(		fabricaVehiculoHibrido.fabricaSeatHibrido(				"León e-HYBRID", 2024, "España",15f, 30000.00f, 25500.00f,Cambio.AUTOMATICO, 204, 800, true, 5, 270,Combustible.GASOLINA, 40, 1.30f, 1395, 13.00f));
		
	}
    
}
