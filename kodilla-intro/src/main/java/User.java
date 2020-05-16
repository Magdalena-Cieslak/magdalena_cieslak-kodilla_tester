public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(String name) {
        return name;
    }
    public int getAge(int age) {
        return age;
    }

    public static void main(String[] args) {
        User kate = new User("Kate", 20);
        User anna = new User("Anna", 25);
        User mike = new User("Mike", 45);
        User david = new User("David", 65);

        User[] users = {kate, anna, mike, david};

        int result = 0;
        for(int i = 0; i < users.length; i++) {
            result = result + users[i]; //nie wiem jak odwołać się tutaj do zmiennej "age", żeby sumowała się tylko ta zmienna?

        }



    }

}
