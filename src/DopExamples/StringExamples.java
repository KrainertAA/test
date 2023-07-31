package DopExamples;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExamples {
    public static void main(String[] args) {

//        String text = "aba aba a!a abba adca abea";
//        Pattern pattern = Pattern.compile("a..a");
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println(matcher);

        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс][а-я]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
