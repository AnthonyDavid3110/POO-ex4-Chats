public class Main {
    public static void main(String... args) {
        for (int i = 0; i < 5; ++i)
            new Cat().mreow();

        Cat.info();

        System.out.println("J'obtiens le chat #3");
        Cat c = Cat.get(3);
        c.mreow();

        c = new Cat();
        c.mreow();
        c.info(); // mauvaise idée, préférer Cat.info();

        Cat.mreowAll();
    }
}