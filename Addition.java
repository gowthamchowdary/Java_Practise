class Addition
  {
    public static void main(String args[])
    {
      int a=15;
      int z=--a + ++a + a++ + a-- + a--;
      System.out.println("a="+a);
      System.out.println("z="+z);
    }
  }