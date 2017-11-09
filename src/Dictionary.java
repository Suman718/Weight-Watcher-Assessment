import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {

    public static void print(String line){
        String[] str = line.split("-");
        String word = str[0];
        String meaning = str[1];
        System.out.println(word);
        System.out.println(meaning);
    }

    public static boolean doesFileExist(String path){
        File file = new File(path);
        if (file.exists()){
            return true;
        }else {
            throw new RuntimeException("File does not exit in " + path);
        }
    }

    public static void readFile(String path){

        if(doesFileExist(path)){
            try(BufferedReader br = new BufferedReader(new FileReader(path))){
                String line;
                while ((line = br.readLine()) !=null){
                    print(line);
                }


            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir")+ "/src/dictionary.txt";
        readFile(filePath);
    }

}
