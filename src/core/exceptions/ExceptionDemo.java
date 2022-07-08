package core.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("demo.txt");
            fos.write("Hey There!, It's a sunny day today!!".getBytes());
        } catch (Exception e) {
            try{

            }catch(Exception exception){

            }

            System.out.println(e);
        }
        finally {
            try {
                assert fos != null;
                fos.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
