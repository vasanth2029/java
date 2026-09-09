import java.io.*;
class Ex7{
    public static void main(String[] args){
      try{

        FileInputStream input = new FileInputStream("photo.jpg");
        FileOutputStream output = new FileOutputStream("copy.jpg");

        int data;

        while ((data = input.read()) != -1) {
            output.write(data);
        }

        input.close();
        output.close();
      }
      catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
      }


        System.out.println("Image copied successfully");
    }
}
