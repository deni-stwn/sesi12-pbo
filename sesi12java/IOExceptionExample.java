import java.io.*;

class IOExceptionExample {
    public static void main(String[] args) {
        File file = new File("non-existent-file.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e);
        }
    }
}
