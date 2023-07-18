import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeMoneda {

    String tipoDeMoneda;
    String getTipoDeMoneda;
    BigDecimal cantidad;


    public boolean validaDinero(String cantidad){
        boolean valido = true;
        if(cantidad.length() != 7){
            valido = false;
        }
        return valido;
    }


    public String SolesAdolares (BigDecimal cantidad){
        return "\n" + cantidad + " Soles en dolares son: " + cantidad.divide(new BigDecimal("3.63"), 2, RoundingMode.UP) + " $";
    }






    public String Convierte(String tipoDeMoneda, BigDecimal cantidad){

        switch (tipoDeMoneda) {

            case "Dolares" ->
                    System.out.println( cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad.divide(new BigDecimal("3.63"), 3, RoundingMode.UP));
            case "Euros" -> System.out.println(cantidad + " Soles en " + tipoDeMoneda + " en Soles son: S/ " + cantidad.divide(new BigDecimal("3.99"), 3, RoundingMode.UP));
            case "Libras Esterlinas" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " en Soles son: S/ " + cantidad.divide(new BigDecimal("3.69"), 3, RoundingMode.UP));
            case "Yen Japones" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " en Soles son: S/ " + cantidad.multiply(new BigDecimal("0.026")));
            case "Won Sul-coreano" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " en Soles son: S/ " + cantidad.multiply(new BigDecimal("0.028")));
            default -> System.out.println("Ingrese una opcion correcta");
        }
        return tipoDeMoneda;
    }

    public void Desconvierte (String tipoDeMoneda, BigDecimal cantidad) {

        switch (tipoDeMoneda) {
            case "Dolares" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad.multiply(new BigDecimal("3.64")) + " $");
            case "Euros" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad.multiply(new BigDecimal("3.99")) + " Є");
            case "Libras Esterlinas" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad.multiply(new BigDecimal("4.69")) + " £");
            case "Yen Japones" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + " son: " + cantidad.multiply(new BigDecimal("0.026")) + " ¥");
            case "Won Sul-coreano" ->
                    System.out.println(cantidad + " Soles en " + tipoDeMoneda + "son: " + cantidad.multiply(new BigDecimal("0.028")) + " ₩");
            default -> System.out.println("Ingrese una cantidad correcta");

        }

    }

}
