package org.example.testingdemo.service;

import org.example.testingdemo.model.User;
import org.example.testingdemo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    // ✅ Inject IMPLEMENTATION, not interface
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testGetUserById() {

        User user = new User(1, "Thulasi");

        when(userRepository.findById(1)).thenReturn(user);

        User result = userService.getUserById(1);

        assertEquals(1, result.getId());
        assertEquals("Thulasi", result.getName());
    }
}
