import java.io.*;

public class BufferLineBreak {
    public static void main(String[] args) throws IOException {

        BufferedReader lines = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println(" Enter lines of text");
        System.out.println(" Enter \'stop\' to quit ");
        for (int i = 0; i < str.length; i++) {
            str[i] = lines.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println(" \n Here is your file ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }

    }

}
