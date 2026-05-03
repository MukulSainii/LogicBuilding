package StreamAPI;

import java.util.Set;

public class findVowel {
    public static void main(String[] args) {
        String str = "Hello worlds";
        String vowel = "aeiou";
        long countTheVowel =  str.chars()
                .filter(e->vowel.indexOf(e) !=-1)
                .count();

        long countTheVowel1 =  str.chars()
                                .filter(c -> Set.of('a','e','i','o','u').contains((char)c))
                                .count();
        System.out.println(countTheVowel);
        // output : 3

        int count = 0;
        for (char c : str.toCharArray() ) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                count ++;
            }
        }

        //optimize way
        for(char c: str.toLowerCase().toCharArray()){
            if(vowel.indexOf(c) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
