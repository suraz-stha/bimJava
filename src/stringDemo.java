public class stringDemo {
    String[] names = new String[4];
  public  void fillName(){
      names[0] ="john";
      names[1] = "peter";
      names[2] = "hari";
      names[3] = "tonny";
  }
  public  void check(){
      for (String name:names) {
            if (name.contains("t")){
                System.out.println(name+ " this student contains name with character 't' ");
            }
      }
  }

}
