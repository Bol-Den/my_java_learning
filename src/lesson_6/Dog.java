package lesson_6;

class Dog {
     private String name;
     private int age;
     private String color;

     Dog(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;
     }

    public void setAge(int age) {
       this.age = age;
    }

    public int getAge(){
         return this.age;
    }

    public void resetAge() {
         this.setAge(0);
    }

}
