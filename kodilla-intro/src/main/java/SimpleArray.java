public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "MAgda";
        names[1] = "Kasia";
        names[2] = "Zosia";
        names[3] = "Ola";
        names[4] = "Ula";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera");
        System.out.println(numberOfElements);
        System.out.println("elementów");

    }
}
