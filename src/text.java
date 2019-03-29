import java.io.*;
import java.util.Random;

public class text {

    public static void main(String[] args) throws IOException {

    //我来了

       /* FileOutputStream fos = new FileOutputStream("bbb.txt",true);
        FileInputStream fis = new FileInputStream("aaa.text");	//创建一个文件输入流对象,并关联aaa.txt
        int b;													//定义变量,记录每次读到的字节
        while((b = fis.read()) != -1) {							//将每次读到的字节赋值给b并判断是否是-1
            System.out.println(b);								//打印每一个字节
        }
*/

        /*try(
                FileInputStream fis = new FileInputStream("aaa.text");
                FileOutputStream fos = new FileOutputStream("bbb.text");
               // MyClose mc = new MyClose();
        ){
            int b;
            while((b = fis.read()) != -1) {
                fos.write(b);
            }
        }*/
       // FileReader reader = new FileReader("aaa.text");
        //FileWriter writer = new FileWriter("aaa.text");
      /*  int b;
        while((b =reader.read())!= -1){
            //System.out.println((char) b);

        }*/
     // writer.append("12345");
     // writer.close();

        //System.out.println(   new Random().nextInt(10));
        //System.out.println((int)((Math.random()*9+1)*1000));
        //System.out.println( ""+((Math.random()*9+1)*1000));
       // String.valueOf(((Math.random()*9+1)*1000))
        //int i = (int) (Math.random() * 9000) + 1000;
       // System.out.println(i);

    }

}
