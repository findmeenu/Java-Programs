package Seminar1.cipher;

public class ReplacementCipher implements Cipher {

    //String replacementLetter;
    String text;
    String replacement = "";
    char[] b = new char[26]; // Assuming that there are no duplicates in Array. While encrypting
                                //every letter is replaced by only unique character provided in Array for it's particular index position.

    public ReplacementCipher(String replacementLetter, String text) {
        this.b = replacementLetter.toCharArray();
        this.text = text;

    }

    @Override
    public String encrypting() {

        //for (int i = 0; i < replacementLetter.length(); i++) {
          //  b[i] = replacementLetter.charAt(i);
        //}
        for (int i = 0; i < text.length(); i++) {
            char d = text.charAt(i);
            if (Character.isLetter(d) && Character.isUpperCase(d)) {
                int index = d - 'A';
                d = Character.toUpperCase(b[index]);
                replacement += Character.toString(d);
            } else if (Character.isLetter(d) && Character.isLowerCase(d)) {
                int index = d - 'a';
                d = b[index];
                replacement += Character.toString(d);
            } else {
                replacement += Character.toString(d);
            }
        }

        return replacement;
    }

    public String decrypting() {
        String decrypted = "";
        for (int i = 0; i < replacement.length(); i++) {
            char e = replacement.charAt(i);

            if (Character.isLetter(e) && Character.isUpperCase(e)) {
                for (int i1 = 0; i1 < b.length; i1++) {


                    if (e == Character.toUpperCase(b[i1])) {
                        int index = i1;
                        char f = (char) ('A' + index);
                        decrypted += f;
                        break;
                    }
                }
            }
             else if (Character.isLetter(e) && Character.isLowerCase(e)) {
                for (int i2 = 0; i2 < b.length; i2++) {
                    if (e == b[i2]) {
                        int index1 = i2;
                        char f1 = (char) ('a' + index1);
                        decrypted += f1;
                        break;
                    }

                }
            } else {
                decrypted += e;
            }
        }
        return decrypted;
    }
}