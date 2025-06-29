package de.htwberlin.webtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToStringTest {

    @Test
    void testToString() {

        String name = "Stickman";
        String hat = "Hat1";
        String top = "Top1";
        String bot = "Bot1";
        String owner = "Owner1"; // Hinzugefügt

        Stickman stickman = new Stickman(name, hat, top, bot);
        stickman.setOwner(owner); // Hinzugefügt
        stickman.setId(33L);

        String expected = "Stickman{id=33, name='Stickman', hat='Hat1', top='Top1', bot='Bot1', owner='Owner1'}"; // Hinzugefügt

        String actual = stickman.toString();

        assertEquals(expected, actual);
    }
}
