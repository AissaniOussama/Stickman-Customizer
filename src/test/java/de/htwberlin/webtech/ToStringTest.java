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

        //"System under test" aufsetzen
        Stickman stickman = new Stickman(name, hat, top, bot);
        stickman.setId(33L);

        //Erwartetes Ergebnis
        String expected = "Stickman{id=33, name='Stickman', hat='Hat1', top='Top1', bot='Bot1'}";

        //Tatsächliches Ergebnis
        String actual = stickman.toString();

        //Vergleich
        assertEquals(expected, actual);
    }
}

