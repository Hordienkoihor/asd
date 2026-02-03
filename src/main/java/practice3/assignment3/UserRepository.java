package practice3.assignment3;

import java.util.Arrays;
import java.util.Optional;

/*
* Чому не слід використовувати Optional у параметрах та полях:
*
*   При передачі аргумента Optional у метод і
*   відсутності обробки для кейсу коли опшионал буде емпті
*   метод викене виключення
*
*   Так само і з полями, якщо певний метод буде брати поле опшинал з об'єкту і не обробляти
*
*
*
* */

public class UserRepository {

    private User[] users = new User[]{
            new User(1, "example@ukr.net"),
            new User(2, "example2@ukr.net"),
            new User(3, "example3@ukr.net")
    };

    /*шукає через стріми юзера з певним email*/
    Optional<User> findByEmail(String email) {
        return Arrays.stream(users).filter((u) -> u.email.equals(email)).findFirst();
    }


    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        /*явно неіснуючий юзер*/
        Optional<User> foundUser = userRepository.findByEmail("not-example@ukr.net");

//        foundUser.orElseThrow(() -> new RuntimeException("User not found"));

        User orElse = foundUser.orElseGet(() -> new User(0, "DIDNT FIND"));
        System.out.println(foundUser);
        System.out.println(orElse.email);
    }

}
