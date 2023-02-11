package myhomework.OOP;

public class Run {
    public static void main(String[] args) {
        User user = new User( "user", "a125k");
        User user1 = new User( "lirik", "d54treq");
        User user2 = new User( "elenka", "fgo157p");

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println();


        User[] masUser = {user, user1, user2};
        for (int i = 0; i < masUser.length; i++) {
            System.out.println(masUser[i]);
        }

        System.out.println();

        System.out.println(masUser.length);

        user.setId(254);
        user.setLogin("sveta");
        user.setPassword();

        System.out.println(user.getId() + " " + user.getLogin() + " " + user.getPassword());

        user.setLogin("poiu");
        System.out.println(user.getLogin());






    }
}
