package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {

    private ScoreCalculateur uneQuestion;

    @Before
    public void setUp() throws Exception {
        List<Integer> list= new ArrayList<Integer>(Arrays.asList(1,2,3));
        // given :: un objet de Type QuestionAChoixMultiple
        uneQuestion = new ScoreCalculateur("un énoncé à réponse multiple", list);
    }

    @Test
    public void calculeScore() {
        //les valeurs 1 et 4, on obtient 0 comme résultat ;
        assertEquals(0f,  uneQuestion.getScoreForIndice(1,4), 0f)
        //les valeurs 2 et 3, on obtient 2*100/3 à 0,01 près comme résultat ;
        assertEquals(2*100f/3,  uneQuestion.getScoreForIndice(2,3), 0.01f);
        //les valeurs 2, 3 et 5, on obtient 100 à 0,01 près comme résultat.
        assertEquals(100f,  uneQuestion.getScoreForIndice(1,2,3), 0.01f)

    }


}