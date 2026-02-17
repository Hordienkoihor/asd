package practice6.assignment1;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * за srp кожен клас має відповідати за одну логічну задачу.
 * Цей відповідає за роботу з юзером
 * */
public class ShopUserService {
    private final List<String> users = new ArrayList<>();

    public void registerUser(String email) {
        if (!users.contains(email)) {
            users.add(email);
        }
    }
}
