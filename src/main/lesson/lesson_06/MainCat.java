package lesson_06;

class MainCat {

    public static void main(String[] args) {

        BlackCat blackCat = new BlackCat("john", "pink", 25, "serious");

        String blackCatName = blackCat.getName();
        System.out.println(blackCatName);

        String blackCatBehavior = blackCat.getBehavior();
        System.out.println(blackCatBehavior);

    }
}
