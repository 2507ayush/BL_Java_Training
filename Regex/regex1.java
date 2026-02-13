
// package Regex;
import java.util.regex.*;;
public class regex1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("a");  //use to compile a pattern 
        Matcher match=p.matcher("a");   //use to match that compiled pattern
        boolean ans=match.matches();          //use to match complete region of both pattern and match that they are same or not
        System.out.println(ans);
        Pattern p2=Pattern.compile("a*b");  //any number of a but count of b is 1 
        // a*b* any numner of a folowed by any number of b 
        // a+b* mens one a compulsory and any number of b
        Matcher m2=p2.matcher("ab");
        System.out.println(m2.matches());
        Pattern p3=Pattern.compile("a{2}b{1}");  //a 2 times b 1 times fixed
        // a{2,}b{1,} means a atleast 2 times and can be more than that and b at least 1 times and more than that.
        Matcher m3=p3.matcher("aab");
        System.out.println(m3.matches());
        // / d means digits 0-9 and /D means non digit  /w for words all a-z and A-Z 
        System.out.println(Pattern.matches("a","b"));
        
    }
}
