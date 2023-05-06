public class CheckConfirmPassword {

    static String confirmPassword = new String();


        public static void cheсker(String confirmPassword) {
        if (confirmPassword.equals(CheckPassword.getPassword())) {
            System.out.println("Пароль корректно подтвержден");
        } else {
            throw new WrongLoginException("Пароль подтвержден некорректно");
        }
    }


}
