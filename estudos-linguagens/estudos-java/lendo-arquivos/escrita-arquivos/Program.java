import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
    
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        String path = "/home/ana-luiza/Área de trabalho/escrita-arquivos/arquivo/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // o parametro true indica que você não quer recriar o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}