// abstract Keyword

abstract class A
 {
    abstract void show();
 }
   class B extends A
    {
     void show()
       {
        System.out.println("Hello from B");
       }
     }
   class Abstract{
     public static void main(String args[])
       {
          A a1;
          B b1 = new B();
            a1 = b1;
          b1.show();
          a1.show();
       }
    }