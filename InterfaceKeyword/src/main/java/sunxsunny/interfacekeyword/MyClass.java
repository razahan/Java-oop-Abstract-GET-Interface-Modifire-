
package sunxsunny.interfacekeyword;

/**
 *
 * @RAZAHAN
 */

// Why we create "interface"? Ans: To knnw which method we have in our program. 
interface First{
    void FirstMethod();
}

interface Second{
    void SecondMethod();
}

interface Third{
    void ThirdMethod();
}



//public class MyClass implements First {
// OR
public class MyClass implements First,Second,Third {
    
    @Override
    public void FirstMethod(){
        System.out.println("First Interface");
        return ;
    }
    
    
    @Override
    public void SecondMethod(){
        System.out.println("Second Interface");
    }
    
    
    @Override
    public void ThirdMethod(){
        System.out.println("Third Interface");
    }
}
