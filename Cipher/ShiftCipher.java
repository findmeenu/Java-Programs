package Seminar1.cipher;

class ShiftCipher implements Cipher {

    int shift;
    String text;
    String shift_C = "";

    public ShiftCipher(int shift, String text) {
        this.shift = shift;
        this.text = text;
    }

    @Override
    public String encrypting() {
        if (shift > 26){   // to ensure that the shift value remains between 1 to 26
            shift = shift%26;
        }else {shift = shift;}
        for (int i = 0; i < text.length(); i++) {

            char d = text.charAt(i);

            if (Character.isLetter(d) && Character.isUpperCase(d)) {
                d = (char) (shift + d);
                if (d > 90) {  // To ensure that after applying shift ASCII should remain between 65 to 90.
                    d = (char) ('@' + (d-90));
                    shift_C += Character.toString(d);
                } else {
                    shift_C += Character.toString(d);
                }

            } else if (Character.isLetter(d) && Character.isLowerCase(d)) {
                d = Character.toUpperCase(d);
                d = (char) (shift + d);
                if (d > 90) {    // To ensure that after applying shift ASCII should remain between 65 to 90.
                   d = (char) ('@' + (d-90));
                    d = Character.toLowerCase(d);
                    shift_C += Character.toString(d);
                } else {
                    d = Character.toLowerCase(d);
                    shift_C += Character.toString(d);
                }
            }
            else {
                shift_C += Character.toString(d);
            }
        }
            return shift_C;


    }

    public String decrypting () {
        String decrypted = "";
        if (shift > 26){  // to ensure that the shift value remains between 1 to 26.
            shift = shift%26;
        }else {shift = shift;}
        for (int i = 0; i < text.length(); i++) {
            char e = shift_C.charAt(i);
            if (Character.isLetter(e) && Character.isUpperCase(e)) {
                e = (char) (e - shift);
                if (e < 65) {  // To ensure that after applying shift ASCII should remain between 65 to 90.
                    e = (char) ((e-shift) + 26+shift);
                    decrypted += e;
                } else {
                    decrypted += e;
                }
            } else if (Character.isLetter(e) && Character.isLowerCase(e)) {
                e = Character.toUpperCase(e);
                e = (char) (e - shift);
                if (e < 65) {   // To ensure that after applying shift ASCII should remain between 65 to 90.
                    e = (char) ((e-shift) + 26+shift);
                    e = Character.toLowerCase(e);
                    decrypted += e;
                } else {
                    e = Character.toLowerCase(e);
                    decrypted += e;
                }

            } else {
                decrypted += e;
            }
        }
        return decrypted;
    }
}



