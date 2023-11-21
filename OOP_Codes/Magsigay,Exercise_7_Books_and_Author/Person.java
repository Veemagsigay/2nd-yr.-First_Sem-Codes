public class Person {
    
    private String name;
    public Person (String name){
        this.name = name;
    }

   public String getName(){
    return name;
   }

   public void setname(String name){
    this.name = name;
   }

   public String toString(){
    System.out.println(name);
    return name;
   }


   
}
