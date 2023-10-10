package basic;

public class dniIdentificator {
    public static void main(String[] args) {
        System.out.println(IdentificadorDNI("52044681M"));
    }

    public static boolean IdentificadorDNI(String dni){

        String patrón = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        int módulo = Integer.parseInt(dni.substring(0, dni.length()-1)) % 23;

        return (dni.charAt(dni.length()-1) == patrón.charAt(módulo)) && dni.length() == 9;
    }
}
