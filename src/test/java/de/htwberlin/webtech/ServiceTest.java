package de.htwberlin.webtech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Mock
    private StickmanRepository repo;

    @InjectMocks
    private StickmanService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialisiert die Mocks
    }

    @Test
    void testGetAll() {
        Stickman s1 = new Stickman("Yessir", "Hat1", "Top1", "Bot1");
        Stickman s2 = new Stickman("Nosir", "Hat2", "Top2", "Bot2");

        when(repo.findAll()).thenReturn(Arrays.asList(s1, s2));

        List<Stickman> result = service.getAll();

        assertEquals(2, result.size());
        assertEquals("Yessir", result.get(0).getName());
        assertEquals("Nosir", result.get(1).getName());
    }

    @Test
    void testSave() {
        Stickman input = new Stickman("Maybesir", "Hat3", "Top3", "Bot3");

        when(repo.save(input)).thenReturn(input);

        Stickman saved = service.save(input);

        assertEquals("Maybesir", saved.getName());
        assertEquals("Hat3", saved.getHat());
        assertEquals("Top3", saved.getTop());
        assertEquals("Bot3", saved.getBot());
    }

    @Test
    void testGetById() {
        Stickman s = new Stickman("Perhapssir", "Hat4", "Top4", "Bot4");
        s.setId(7L);

        when(repo.findById(7L)).thenReturn(java.util.Optional.of(s));

        Stickman result = service.getById(7L);

        assertNotNull(result);
        assertEquals("Perhapssir", result.getName());
    }
}
