package tn.esprit.spring.services;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class UserServiceImplMock {
  User user = new User("f1", "l1", new Date(), Role.ADMINISTRATEUR);
List<User> listUsers = new ArrayList<User>() {
{
add(new User("f2", "l2", new Date(), Role.ADMINISTRATEUR));
add(new User("f3", "l3", new Date(), Role.ADMINISTRATEUR));
}
};
}

