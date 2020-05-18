public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User kate = new User("Kate", 20);
        User anna = new User("Anna", 25);
        User mike = new User("Mike", 45);
        User david = new User("David", 65);

        User[] users = {kate, anna, mike, david};

        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result = (result + users[i].getAge()) / users.length;
            return result;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < result) {
                System.out.println(users[i].getName());
            }
        }
    }
}
