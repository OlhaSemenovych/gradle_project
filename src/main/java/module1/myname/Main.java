package module1.myname;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        User user = new User();
        log.info(user.createUserJson("Olha", "Semenovych"));

    }

}
