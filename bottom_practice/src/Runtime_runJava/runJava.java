package Runtime_runJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DangR-X
 * @date 2020/12/10
 * @description
 */
public class runJava {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p = runtime.exec("cmd /c set CLASSPATH=E:\\typora\\node\\atomic_test_1\\src\\ && java project_1");
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            //StringBuffer b = new StringBuffer();
            String line=null;
            StringBuffer b=new StringBuffer();
            while ((line=br.readLine())!=null) {
                b.append(line+"\n");
            }
            System.out.println(b.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
