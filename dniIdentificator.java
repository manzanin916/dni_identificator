package basic;

public class dniIdentificator {
    public static void main(String[] args) {
        System.out.println(DNICorrector("12345678Z"));
    }

    public static boolean DNICorrector(String dni){
        
        int value = Integer.parseInt(dni.substring(0, dni.length()-1)) % 23;

        return EquivalenciaArcana(dni.charAt(dni.length()-1)) == value;
    }

    public static int EquivalenciaArcana(char letra){

        String cadenaMágica = "TRWAGMYFPDXBNJZSQVHLCKE";

        int modulo = 0;

        for(int i = 0; i < cadenaMágica.length(); i++){
            if(letra == cadenaMágica.charAt(i)){
                modulo = i;
            }
        }

        return modulo;
    }

    
}
