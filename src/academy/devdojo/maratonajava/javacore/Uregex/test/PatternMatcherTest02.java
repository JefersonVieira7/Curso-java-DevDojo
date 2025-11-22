package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+"\n");
        }
    }
}
