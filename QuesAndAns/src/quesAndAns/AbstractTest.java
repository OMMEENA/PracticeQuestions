package quesAndAns;

public abstract class AbstractTest {
    public abstract void m1();

    public abstract void m2();
}

abstract class subTest extends AbstractTest {

    @Override
    public void m1() {

    }
}

 class subsubtest extends AbstractTest {
     @Override
     public void m1() {

     }

     @Override
     public void m2() {

     }

 }
