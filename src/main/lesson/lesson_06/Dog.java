package lesson_06;

class Dog {
     private String name;
     private int age;
     private String color;
     private boolean isFunny;

     Dog(String name, int age, String color, boolean isFunny) {
         this.name = name;
         this.age = age;
         this.color = color;
         this.isFunny = isFunny;
     }

    public void setAge(int age) {
       this.age = age;
    }

    public int getAge(){
         return this.age;
    }

    public boolean getIsFunny(){
         return this.isFunny;
    }

    public void resetAge() {
         this.setAge(0);
    }

}
