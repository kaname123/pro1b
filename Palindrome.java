/**
 * Created by kaname on 2017/4/18.
 */
public class Palindrome {




   

    public static Deque<Character> wordToDeque(String word){
        Deque<Character> a = new ArrayDequeSolution<>();
        for(int i=0;i<word.length();i++){
            a.addLast(word.charAt(i));
        }

        return a;
    }
   /* public static boolean isPalindrome(String word){

        
	if(word.length()<=1)
		return true;
	
	if(word.charAt(0)==word.charAt(word.length()-1)){
		String b=word.substring(1, word.length()-1);
		return isPalindrome(b);
	}
	else
		return false;
}*/
	public static boolean isPalindrome(String word){
	return isPalindromeHelper(wordToDeque(word))
	}
	public static boolean isPalindromeHelper(Deque<Character> word){ 

        if(word.size()<=1)
            return true;
        //if(b.get(0)==b.get(b.size()-1)){
          //  b.removeFirst();
           // b.removeLast();
            //String c=b.toString();
           // return isPalindrome(c);
       // }
       // else
          //  return false;
		if(word.removeLast()==word.removeFirst()){
		return isPalindromeHelper(word);
		}
		return false;}
			


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
