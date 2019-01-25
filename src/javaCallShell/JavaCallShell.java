package javaCallShell;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by zhaoyimeng on 2017/3/23.
 */
public class JavaCallShell {
    public static void main(String[] args) {
        String cmd = "ls -l";

        try {
            Process process = Runtime.getRuntime().exec(cmd, null, new File("/Users/zhaoyimeng/Downloads"));
            int status = process.waitFor();
            if (status == 0){
                System.out.println("Got it");
            }

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line=input.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
