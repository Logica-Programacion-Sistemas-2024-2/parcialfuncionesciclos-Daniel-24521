package parcial1g2;


public class App {
    public static int calcularTotalImpuestos(int impuestoRodamiento, int añoVehiculo){
    try {
        int totalImpuestos;
        if (calcularTotalImpuestos(impuestoRodamiento, añoVehiculo)) {
            totalImpuestos = impuestoRodamiento + añoVehiculo;
        }
        else{
            totalImpuestos = -1;
        }
    } catch (Exception e) {
       return -1;
    }
    }
    public static void main(String[] args) {
        
        // Logica de solución
       try {
         //Datos de entrada 
         int vehiculosUsuario = 0;
         String añoVehiculo = "";
         int valorVehiculo = 0;
         int tasaSeguro = 0;
         int valorPagarVehiculo = 0;

         
         //Preguntarle al usuario 

                 Scanner sc = new Scanner(System.in);
                 System.out.println("¿Cuantos vehículo vamos a calcular?");
                 vehiculosUsuario = sc.nextInt();
                 sc.nextLine();

                 System.out.println("¿De que año es tu vehículo?");
                 añoVehiculo = sc.nextInt();

                 System.out.println("¿Cual es el valor de vehículo?");
                 valorVehiculo = sc.nextInt();
                 sc.nextLine();

                 switch (añoVehiculo) {
                
                    case "90": 
                            tasaSeguro = 0.816;
                        break;
                    case "00":
                        tasaSeguro = 0.798;
                         break;
                    case "10":
                        tasaSeguro = 0.712;
                        break;
                    case "20":
                        tasaSeguro = 0.699;
                        return;
                        default:
                            System.out.println("Opcion invalida");
                 
                        try {
                                int impuestoRodamiento = 0;
                            if(cantidad > 0){
                                if(añoVehiculo("90")){
                                    impuestoRodamiento = valorVehiculo * 4.09;
                                }
                                else if(añoVehiculo("00")){
                                    impuestoRodamiento = valorVehiculo * 4.34;
                                }
                                else if (añoVehiculo("10")){
                                    impuestoRodamiento = valorVehiculo * 4.93;
                                }
                                else if(añoVehiculo("20")){
                                    impuestoRodamiento = valorVehiculo * 5.683;
                                }
                                else{
                                    impuestoRodamiento = -1;
                                }
                                
                                return;
                            }
                        } catch (Exception e) {
                    
                        }                 
                        }

       } catch (Exception e) {
       
       }
        sc.close();

    }

}
