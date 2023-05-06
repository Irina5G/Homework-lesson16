public class CheckLogin {
String login = new String();
    public static void cheсker(String login) {
        if (checkLength(login) && checkSymbols(login)) {
            System.out.println("Логин корректный");
        } else {
            throw new WrongLoginException("Логин не корректный");
        }
    }

    private static boolean checkLength(String login) {
        return login.length() <= 20;
    }

    private static boolean checkSymbols(String login) {

        String s = "qwertyuiopsdfghjklzxcvbnm_1234567890";
        login = login.toLowerCase();

        for (int i = 0; i < login.length(); i++) {
            String currentSymbol = Character.toString(login.charAt(i));
            if (s.contains(currentSymbol) == false) {
                return false;
            }
        }
        return true;
    }
}



