package Hillchipper;

import Hillchipper.deskripsi;
import Hillchipper.enkripsi;
import IO.Reader;
import IO.Writter;

public class Main {

    public static void main(String[] args) {
        // read file
        String readedFile = Reader.readFile("src/data/input.txt");
        System.out.println("" + readedFile);
        // encrypt file
        String encryptedText = enkripsi.encrypt(readedFile);
        System.out.println("" + encryptedText);
        // write encrypted file
        Writter.writeFile("src/data/hasil enkripsi.txt", encryptedText);
        // read encrypted file
        String encryptedFile = Reader.readFile("src/data/hasil enkripsi.txt");
        // decrupt file
        String decryptedFile = deskripsi.decrypt(encryptedFile);
        System.out.println("" + decryptedFile);
        // write decrypted file
        Writter.writeFile("src/data/hasil deskripsi.txt", decryptedFile);
    }
}
