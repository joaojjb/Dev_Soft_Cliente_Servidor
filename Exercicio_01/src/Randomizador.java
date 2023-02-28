import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
public class Randomizador {
    Random r = new Random();

    public String geraNomeTitular() {
        String nomeString = "";
        for(int i = 0; i < 30; i ++){
            int nome = 65 + r.nextInt(90 - 65);
            char nomeChar = (char)nome;
            nomeString+= Character.toString(nomeChar);
        }
        return nomeString.toUpperCase();
    }

    public String geraNomeDependente() {
        String nomeString = "";
        for(int i = 0; i < 30; i ++){
            int nome = 65 + r.nextInt(90 - 65);
            char nomeChar = (char)nome;
            nomeString+= Character.toString(nomeChar);
        }
        return nomeString.toUpperCase();
    }


    public String geraDiaMesData() {
        final String diaData;

        final String mesData = geraDiaMesData();

        if(mesData.equals("2")) {
            if(mesData.)
            int diaDataInt = 1 + r.nextInt(31 - 1);
        }


    }

    public String geraMesData(){
        final String mesData;

        int mesDataInt = 1 + r.nextInt(12 - 1);
        char mesDataChar = (char) mesDataInt;
        mesData = Character.toString(mesDataChar);
        
        return mesData;
    }

    public LocalDate geraDataNascimento() {
        final LocalDate data = LocalDate.now();

        return data;
    }
}
