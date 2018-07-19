import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo2{
public static void main(String[] args){
Pattern compile=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9][A-Z]{1}[0-9]{4}");
Matcher matcher=compile.matcher("16EM1A0585");
while(matcher.find()){
System.out.println(matcher.group());
}
}
}
