package Seminar1.cipher;

public class Main {
    public static void main (String[]args) {
        ShiftCipher myShift = new ShiftCipher(25, "z");
        ReplacementCipher myReplacement = new ReplacementCipher("gsaytevjmfkuonhxrpcdlqwzib", "y");


        System.out.println("--- Encryption and Decryption Application ---");
        System.out.println();
        System.out.printf("Original Text: \"%s\"%n%n", myShift.text);

        System.out.printf("Encrypted Text (Shift Cipher): \"%s\"%n", myShift.encrypting());
        System.out.printf("Encrypted Text (Replacement Cipher): \"%s\"%n%n", myReplacement.encrypting());

        System.out.printf("Decrypted Text (Shift Cipher): \"%s\"%n", myShift.decrypting());
        System.out.printf("Decrypted Text (Replacement Cipher): \"%s\"%n%n", myReplacement.decrypting());
        }
}
