package lesson_06;

class Cat {

    protected String name;
    protected String color;
    protected int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }

}
