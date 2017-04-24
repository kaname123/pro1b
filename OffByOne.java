/**
 * Created by kaname on 2017/4/20.
 */
public  class OffByOne implements CharacterComparator{
        public boolean equalChars(char x, char y){
            if(x==(y-1))
                return true;
            else
                return false;
        }
        }