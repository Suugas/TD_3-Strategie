import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestTableauEntier {

    private TableauEntier tableauEntier;
    private int[][] t;

    @BeforeEach
    void setUp() {
        t = new int[][]{
            {1, 2, 3},
            {4, 5, 6}
        };
        tableauEntier = new TableauEntier(t);
    }

    @Test
    void testGetLargeur() {
        assertEquals(2, tableauEntier.getLargeur());
    }

    @Test
    void testGetLongueur() {
        assertEquals(3, tableauEntier.getLongueur());
    }

    @Test
    void testValeurA() {
        assertEquals(1, tableauEntier.valeurA(0, 0));
        assertEquals(2, tableauEntier.valeurA(0, 1));
        assertEquals(3, tableauEntier.valeurA(0, 2));
        assertEquals(4, tableauEntier.valeurA(1, 0));
        assertEquals(5, tableauEntier.valeurA(1, 1));
        assertEquals(6, tableauEntier.valeurA(1, 2));
    }

    @Test
    void testIterateurLigne() {
        ParcoursLigne it = tableauEntier.iterateurLigne();
        assertTrue(it.hasNext());

        int[] attendu = {1, 2, 3, 4, 5, 6};
        for (int val : attendu) {
            assertTrue(it.hasNext());
            assertEquals(val, it.next());
        }

        assertFalse(it.hasNext());
        assertThrows(NoSuchElementException.class, it::next);
    }

    @Test
    void testTableauVide() {
        TableauEntier vide = new TableauEntier(new int[0][0]);
        assertEquals(0, vide.getLargeur());
        assertEquals(0, vide.getLongueur());

        ParcoursLigne itVide = vide.iterateurLigne();
        assertFalse(itVide.hasNext());
        assertThrows(NoSuchElementException.class, itVide::next);
    }
}
