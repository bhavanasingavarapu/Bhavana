import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task{
public static void main(String[] args){
 Pattern p=Pattern.compile("krishna[.][a-z]{1}@gmail[.][a-z]{3}");
 Matcher m=p.matcher("krishna.g@gmail.com");
 while(m.find())
 {
  System.out.println(m.group());
 }
}
}
