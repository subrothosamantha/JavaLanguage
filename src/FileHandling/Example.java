package FileHandling;
import java.io.*;


public class Example {

    public static void main(String[] args){

        File f = new File("/home/subrotho/IdeaProjects/NewLearning/src/FileHandling/This");

      /*  try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("That.txt"))){
            int c;
            while((c=bi.read()) != -1){
                bo.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
*/

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Hola.txt")))){

            String s;
            while((s = br.readLine()) != null){
                bw.write(s+"\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
