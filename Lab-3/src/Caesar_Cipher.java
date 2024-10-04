import javax.crypto.Cipher;

public class Caesar_Cipher implements Encryption{
 private int shift;
 public Caesar_Cipher(int shift){
     this.shift=shift;
 }

    @Override
    public String encrypt(String data) throws Exception {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public String decrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base - shift + 26) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}