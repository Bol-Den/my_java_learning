package lesson_06;

class Parrot {

      private String name;
      private String color;
      private int age;

      Parrot(String name,String color, int age){
          this.name = name;
          this.color = color;
          this.age = age;
      }

      Parrot(String name,String color){
            this.name = name;
            this.color = color;
      }

    Parrot(String name,int age){
        this.name = name;
        this.age = age;
    }

      public int getAge(){
          return this.age;
      }

    public String getColor(){
        return this.color;
    }
}
