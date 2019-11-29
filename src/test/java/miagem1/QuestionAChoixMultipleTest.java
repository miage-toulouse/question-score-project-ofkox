package miagem1;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private QuestionAChoixMultiple uneQuestion;

    @Before
    public void setUp() throws Exception {
        List<Integer> list= new ArrayList<Integer>(Arrays.asList(2,3,5));
        // given :: un objet de Type QuestionAChoixMultiple
        uneQuestion = new QuestionAChoixMultiple("un énoncé à réponse multiple", list);
    }

    /**
     * Test of getEnonce method, of class QuestionAChoixMultiple.
     */
    @Test
    public void testGetEnonce() {
        // When : on demande l'énoncé à la question
        String resEnonce = uneQuestion.getEnonce();
        // then : l'énoncé est non null
        assertNotNull(resEnonce);
        // and : l'énoncé est bien celui fourni à la construction
        assertEquals(resEnonce, "un énoncé à réponse multiple");
    }

    /**
     * Test of getScoreForIndice method, of class QuestionAChoixMultiple.
     */
    @Test
    public void testGetScoreForIndice() {
        // then : le score obtenu est 33.33 pour chaque bonne réponse sur 100
        assertEquals(33.33f,  uneQuestion.getScoreForIndice(2), 0.01f);
        // then : le score obtenu est 0 pour une mauvaise réponse
        assertEquals(0f,  uneQuestion.getScoreForIndice(1), 0.001f);
    }
}