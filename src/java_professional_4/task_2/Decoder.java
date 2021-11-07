package java_professional_4.task_2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static void main(String[] args) {
        File file = new File("file.txt");
        File file1 = new File("file1.txt");
        Pattern p = Pattern.compile(" без | безо | близ | в | во | вместо | вне | для | до | за | из | изо |" +
                " из-за | из-под | к | ко | кроме | между | меж | на | над | о | об | обо | от | ото | перед | передо" +
                " | пред | пo | под | подо | при | про | ради | с | со | сквозь | среди | у " +
                "| через | чрез ",Pattern.UNICODE_CHARACTER_CLASS);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file1))){
            String str;
            while((str = br.readLine()) != null){
                Matcher m = p.matcher(str);
                bw.write(m.replaceAll(" java ") + "\n");
            }
            br.close();
            bw.close();
            file.delete();
            file1.renameTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
