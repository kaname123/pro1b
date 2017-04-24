/**
 * Created by kaname on 2017/4/18.
 */
public class Palindrome {




    public static void  main(String args[]){

    }

    public static Deque<Character> wordToDeque(String word){
        ArrayDequeSolution<Character> a = new ArrayDequeSolution<>();
        for(int i=0;i<word.length();i++){
            a.addLast(word.charAt(i));
        }

        return a;
    }
    public static boolean isPalindrome(String word){

        //public static boolean p(String a){
	if(word.length()==1||word.isEmpty())
		return true;
	//if(a.length()==2&&(a.charAt(0)==a.charAt(1)))
		//return true;
	if(word.charAt(0)==word.charAt(word.length()-1)){
		String b=word.substring(1, word.length()-1);
		return isPalindrome(b);
	}
	else
		return false;
}

       /* Deque<Character> b=wordToDeque(word);
        if(b.size()==1||b.isEmpty())
            return true;
        if(b.get(0)==b.get(b.size()-1)){
            b.removeFirst();
            b.removeLast();
            String c=b.toString();
            return isPalindrome(c);
        }
        else
            return false;}*/


    public static boolean isPalindrome(String word, CharacterComparator cc){
        if(word.length()==1||word.isEmpty())
            return true;
        //if(a.length()==2&&(a.charAt(0)==a.charAt(1)))
        //return true;
        char p=word.charAt(0);
        char q=word.charAt(word.length()-1);
        if(cc.equalChars(p,q)){
            String b=word.substring(1, word.length()-1);
            return isPalindrome(b,cc);
        }
        else
            return false;
    }

}
