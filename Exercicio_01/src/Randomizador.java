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

    public String geraData() {

        final String diaData = geraDiaData();
        final String mesData = geraMesData();
        final String anoData = geraAnoData();

        return diaData + "/" + mesData + "/" + anoData;
    }

    private String geraAnoData() {

        final int anoDataInt = 1 + r.nextInt(12 - 1);
        final char anoDataChar = (char) anoDataInt;

        return Character.toString(anoDataChar);
    }

    private String geraMesData(){

        final int mesDataInt = 1 + r.nextInt(12 - 1);
        final char mesDataChar = (char) mesDataInt;

        return Character.toString(mesDataChar);
    }

    private String geraDiaData(){
        final int diaDataInt = 1 + r.nextInt(12 - 1);
        final char diaDataChar = (char) diaDataInt;

        return Character.toString(diaDataChar);
    }

}
