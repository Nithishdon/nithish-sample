import java.util.*;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String str1=a.toUpperCase();
        String str2=b.toUpperCase();
        if(str1.length()!=str2.length())
        return false;
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        HashMap<Character,Integer> hash1=new HashMap<>();
         HashMap<Character,Integer> hash2=new HashMap<>();
       for(char c1:ch1)
       {
           hash1.put(c1,hash1.getOrDefault(c1,0)+1);
       }
        for(char c2:ch2)
       {
           hash2.put(c2,hash2.getOrDefault(c2,0)+1);
       }
       for(char chh:ch1)
       {
           if(hash1.get(chh)!=hash2.get(chh))
           {
               
               return false;
           }
           
       }
       return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}