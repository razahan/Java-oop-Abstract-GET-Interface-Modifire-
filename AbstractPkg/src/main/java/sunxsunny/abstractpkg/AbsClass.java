
package sunxsunny.abstractpkg;

/**
 *
 * @RAZAHAN
 */
 abstract class AbsClass {
    abstract void AbsMethod();
}


class Help extends AbsClass{
    
    @Override
    void AbsMethod(){
        System.out.println("This is proof of RUN the code.");
    }
    
}
