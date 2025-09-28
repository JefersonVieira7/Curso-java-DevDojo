package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args){
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "Kame";
        System.out.println("User");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Password");
        String passwordDigitado = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("User our password invalid");
        }

        System.out.println("Usuário Logado Com sucesso!");;
    }
}
