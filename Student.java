 class Student
  {
    int rollnp;
    String name;
    Student(int rollno,String name)
    {
      This.rollno=rollno;
      This.name=name;
    }
    void m()
    {
      System.out.println("hello");
    }
    void h()
    {
      This.m()
        System.out.println("hi");
    }
  }