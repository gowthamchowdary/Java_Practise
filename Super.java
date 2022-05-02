class Person
  {
  Person()
    {
      System.out.println("parent class");
    }
  }
class Student extends Person
  {
    Student()
    {
      super();
      System.out.println("child constructor");
    }
  }
class Super
  {
    public static void main(String args[])
    {
      
    }
  }