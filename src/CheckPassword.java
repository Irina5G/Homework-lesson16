public class CheckPassword {

    static String password = new String();

    public CheckPassword(String password) {
        this.password = password;
    }

    public static String getPassword() {
        return password;
    }

    public static void cheсker(String password) {
        if (checkLength(password) && checkSymbols(password)) {
            System.out.println("Пароль корректный");
        } else {
            throw new WrongLoginException("Пароль не корректный");
        }
    }

    private static boolean checkLength(String password) {
        return password.length() < 20;
    }

    private static boolean checkSymbols(String password) {

        String s = "qwertyuiopsdfghjklzxcvbnm_1234567890";
        password = password.toLowerCase();

        for (int i = 0; i < password.length(); i++) {
            String currentSymbol = Character.toString(password.charAt(i));
            if (s.contains(currentSymbol) == false) {
                return false;
            }
        }
        return true;
    }
}

