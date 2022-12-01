package asess_package;

import java.io.FileOutputStream;

public class TryBlock_Parameter {
    public static void main (String[] args)
    {
        try(FileOutputStream fileOutputStream=new FileOutputStream("xyz.txt")) {
            String msg = "welcome to java";
            //Converting string into bytes
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written into file successfully");
        }
catch (Exception e){
    System.out.println(e);

        }

    }
}
