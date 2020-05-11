public class LeapYear {
    public static void main(String[] args) {
        int year = 198;

        System.out.println(year);

        if (year%4 > 0){
            System.out.println("Rok nie jest przestępny");
        } else if (year%100 > 0){
            System.out.println("Rok jest przestępny");
        } else if (year%400 > 0){
            System.out.println("Rok nie jest przestępny");
        } else{
            System.out.println("Rok jest przestępny");
        }
    }
}



