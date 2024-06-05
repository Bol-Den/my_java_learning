package lesson_06;

class DogApp {

    public static void main(String[] args) {
        Dog borbos = new Dog("borbos", 2,"black and white", true);

        System.out.println(borbos.getAge());
        borbos.resetAge();
        System.out.println(borbos.getAge());

    }
}
