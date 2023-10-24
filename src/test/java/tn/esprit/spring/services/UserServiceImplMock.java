package tn.esprit.spring.services;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@Test
public void testRetrieveUser() {
Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(user));
User user1 = userService.retrieveUser("2");
Assertions.assertNotNull(user1);
}

