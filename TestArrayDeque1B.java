import static org.junit.Assert.*;
import org.junit.Test;
public class TestArrayDeque1B {




    @Test
    public  void testMethod(){
StudentArrayDeque<Integer> test1=new StudentArrayDeque<>();
ArrayDequeSolution<Integer> test2=new ArrayDequeSolution<>();

for(int i=0;i<100;i++){
    double numberTest=StdRandom.uniform();
    if(numberTest<0.5)
    {test1.addLast(i);
    test2.addLast(i);}
    else
    { test1.addFirst(i);
    test2.addFirst(i);
}}
test1.printDeque();
    System.out.println();
    test2.printDeque();
    }



public static void main(String args[]){
    TestArrayDeque1B test=new TestArrayDeque1B();
    test.testMethod();
    }
}

