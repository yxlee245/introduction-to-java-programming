import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner urlScanner = new Scanner(System.in);
        String URLString = urlScanner.next();
        
    
        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");

            // Close input
            input.close();
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

        // Close urlScanner
        urlScanner.close();
    }
}