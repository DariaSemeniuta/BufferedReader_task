package project;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'exit' for stop");
        System.out.println("Enter value: ");
        try{
            String value;
            while (!(value = reader.readLine()).equals("exit")) {
                System.out.println("You've entered " + value);
                System.out.print("Enter value: ");
            }
            } catch (IOException e){
            e.printStackTrace();
        }
        System.exit(0);

    }
}
