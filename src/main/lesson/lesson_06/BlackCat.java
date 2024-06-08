package lesson_06;

class BlackCat extends Cat {

    private String behavior;

    BlackCat(String name, String color, int age, String behavior) {
        super(name, color, age);
        this.behavior = behavior;
    }

    String getBehavior() {
        return this.behavior;
    }

}
