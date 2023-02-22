package de.basics.datentypen.string;

public class StringTrim {
    public static void main(String[] args) {
        // S T R I N G: T R I M
        /**Entfernt unnötige Leerzeichen.*/

        String usernameString = "       user123    ";
        String username = "user123";

        String loginUsername = usernameString.trim();
        System.out.println("Nutzereingabe: " + usernameString);
        System.out.println("Systemausgabe: " + loginUsername);

        /**Trim Methode wird genutzt, um Leerzeichen zu löschen,
         * damit im Anschluss die equals Methode genutzt werden kann.*/

        if (loginUsername.equals(username)) {
            System.out.println("Eingabe stimmt überein.");
        } else {
            System.out.println("Eingabe ungültig.");
        }
    }
}