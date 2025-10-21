
public class PasswordChecker {

    public static final int ERR_BLANK = 5;
    public static final int ERR_DIGITS = 2;
    public static final String ERR_INVALID_MAX_LENGHT = "Longitud maxima inferior a la minima";
    public static final String ERR_INVALID_MIN_LENGHT = "Longitud minima del password no puede ser cero o menor";
    public static final int ERR_LENGHT = 1;
    public static final int ERR_LOWERS = 4;
    public static final int ERR_NO_MATCH = 6;
    public static final int ERR_UPPERS = 3;
    public static final int PASSWORD_OK = 0;


    public static int checkPassword(String password) {

        if (password == null || password.isEmpty()) {
            return ERR_BLANK;
        }

        int contador = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= '0' && c <= '9') {
                contador++;
            }
        }
        if (contador <= 2) {
            return ERR_DIGITS;
        }

        if (password.length() < 10) {
            throw new IllegalArgumentException(ERR_INVALID_MAX_LENGHT);
        } else if (password.length() <= 0) {

            throw new IllegalArgumentException(ERR_INVALID_MIN_LENGHT);
        }else if (password.length()>20) {
            return ERR_LENGHT;
        }

        int contador1= 0;
        for(int i= 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'a' && c <= 'z') {
                contador++;

                if(contador < 2) {
                    return ERR_LOWERS;
                }
            }
        }

        if (!password.equals(password)){
            return ERR_NO_MATCH;
        }

        int contador2= 0;
        for(int i= 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                contador++;

                if(contador < 1) {
                    return ERR_UPPERS;
                }
            }
        }

        return PASSWORD_OK;
    }
}
