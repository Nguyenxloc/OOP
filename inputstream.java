// read data from file 

import java.io.FileInputStream;
import java.io.InputStream;

class Main {
  public static void main(String args[]) {

    byte[] array = new byte[100];// array stored byte

    try {
      InputStream input = new FileInputStream("input.txt");// read data from file

      System.out.println("Available bytes in the file: " + input.available());

      // Read byte from the input stream
      input.read(array);// method read() read data from the array
      System.out.println("Data read from the file: ");

      // Convert byte array into string
      String data = new String(array);
      System.out.println(data);

      // Close the input stream
      input.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}