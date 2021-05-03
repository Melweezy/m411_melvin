package XOR_Encrypter;

import java.io.*;
import java.util.Scanner;

public class XOR_Encrypter {
    public static String encrypt(String text, int key) {
//wir werden die Zeichen einzeln codieren
        char[] zeichen = text.toCharArray();
// bitweise XOR-Verschlüsselung
        for (int i = 0; i < zeichen.length; i++)
// Mit (char)int wandle int in einen char um
            zeichen[i] = (char) (zeichen[i] ^ key);
// wir erzeugen aus dem Array vom Typ char einen String
        return new String(zeichen);
    }

    public static void main(String[] args) throws IOException {
// Key
//        int key = Integer.parseInt(args[0]);
        int key = 23;
// Dateiverzeichnispfad zur auszulesenden Datei.
//        String input = "src\\Ressourcen\\Gedicht.txt";
        String input =  "C:\\Daten\\M411\\m411_melvin\\Modul411_Melvin\\src\\Ressourcen\\Gedicht.txt";
// Dateiverzeichnispfad zur Erstellung der neuen verschlüsselten Datei.
//        String encrypt_file = args[1];
        String encrypt_file = "C:\\Daten\\M411\\m411_melvin\\Modul411_Melvin\\src\\Ressourcen\\encrypted_file.txt";
// Versuche Datei zum Auslesen zu öffnen
        try (Scanner scanner = new Scanner(new File(input), "UTF-8")) {
// Writer für Verschlüsselte Zeile zu Speichern
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(encrypt_file, false));
// Solange es noch Zeilen gibt, lies diese aus.
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(encrypt(line, key));
                myWriter.write(encrypt(line, key) + "\n");
            }
// schliesse die zu lesende Datei
            scanner.close();
// schliesse die zu verschlüsselte Datei
            myWriter.close();
        } catch (FileNotFoundException eIO) {
            System.out.println("Folgender Fehler trat auf: " + eIO);
        }
    }
}