

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Исключения. Просто исключения.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       
       try{ //напишите тут ваш код

        method1();
       } 
        //напишите тут ваш код}
        catch(NullPointerException e){
               //System.out.println("NullPointerException");
        }
        catch(FileNotFoundException e){
                //System.out.println("FileNotFoundException");
        }
      //  catch(Exception e){
            
      //  }
        
       
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
