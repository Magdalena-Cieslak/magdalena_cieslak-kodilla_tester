public class Person {

    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);

        if (adam.getName() != null) {
            adam.checkAndDisplay();
        }
    }
}
