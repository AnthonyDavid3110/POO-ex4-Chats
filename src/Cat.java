import java.util.LinkedList;

class Cat
{
    private int id;
    private static LinkedList<Cat> cats = new LinkedList<>();

    public Cat() {
        id = count(); // Les ids des chats commencent à 0
        System.out.println("Nouveau chat (" + id + ")");
        cats.add(this);
    }

    public static int count() {
        return cats.size();
    }
    public static void info() { // possible d’acceder à nb mais pas id
        System.out.println(count() + " chats crees");
    }
    public void mreow() {
        System.out.println("le chat #" + id + " miaule…");
    }

    public static Cat get(int id) {
        return (Cat) cats.get(id);
    }

    public static void mreowAll() {
        for (Cat c : cats) c.mreow();
    }

}