import java.io.*;
class FileDemo {
    public static void main(String str[]) {
        String path = "E:/myfile.txt";
        File file = new File(path);
        File rename = new File("E:/hello.txt");
        boolean flag = file.renameTo(rename);
        if(file.exists()) {
            System.out.println("File is exist..!!!");
        if(flag=true){
            System.out.println("true");
            file.deleteOnExit();
        }    
        } else {
            try {
                FileWriter fileWriter = new FileWriter(path);// syntax to writen in file myfile.txt
                fileWriter.write("This is my first file..!!");
                fileWriter.close();
                System.out.println("File has some content..!!");
            } catch(Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        
    }
}