import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "/home/ana-luiza/Área de trabalho/arquivos/int.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            // o buffer é instanciado a partir do file reader, para deixar mais rápido e flexível;
            // br = new BufferedReader(New FileReader(path));
            br = new BufferedReader(fr);

            String line = br.readLine();
            // lê as linhas dos arquivos e se estiver nulo ele para a execução

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            //pode ocorrer um erro ao fechar, então tenta novamente
            try {
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            } 
            catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }
}
