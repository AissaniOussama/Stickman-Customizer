package de.htwberlin.webtech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServiceTest {

    @Autowired
    private StickmanService service;

    @MockBean
    private StickmanRepository repository;

    @Test
    void testGetAll() {
        Stickman s1 = new Stickman("Yessir", "Hat1", "Top1", "Bot1");
        Stickman s2 = new Stickman("Nosir", "Hat2", "Top2", "Bot2");

        when(repository.findAll()).thenReturn(Arrays.asList(s1, s2));

        List<Stickman> result = service.getAll();

        assertEquals(2, result.size());
        assertEquals("Yessir", result.get(0).getName());
        assertEquals("Nosir", result.get(1).getName());
    }

    @Test
    void testSave() {
        Stickman input = new Stickman("Maybesir", "Hat3", "Top3", "Bot3");

        when(repository.save(input)).thenReturn(input);

        Stickman result = service.save(input);

        assertEquals("Maybesir", result.getName());
        assertEquals("Hat3", result.getHat());
    }
}
