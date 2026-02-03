package practice3.assignment3;

public class User {
    int id;
    String email;

    User(){}

    User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    String getEmail(){
        return email;
    }
}
