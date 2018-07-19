public class Demo1{
public static void main(String[] args){
Pattern compile=pattern.compile("[0-9]{2}[A-Z][0-9]{1}[A-Z][0-9]{4}");
Matcher matcher=compile.matcher("16EM1A0585");
while(Matcher.find()){
System.out.println(matcher.group());
}
}
}
