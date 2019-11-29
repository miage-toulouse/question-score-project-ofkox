/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miagem1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class QuestionAChoixExclusifTest {
    
    private QuestionAChoixExclusif uneQuestion;
    
    
    public QuestionAChoixExclusifTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }   
    
    @Before
    public void setUp() throws Exception {
        // given :: un objet de Type QuestionAChoixEclsif
        
        uneQuestion = new QuestionAChoixExclusif("un énoncé",2);
    }
   
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEnonce method, of class QuestionAChoixExclusif.
     */
    @Test
    public void testGetEnonce() {
        // When : on demande l'énoncé à la question
        String resEnonce = uneQuestion.getEnonce();
        // then : l'énoncé est non null
        assertNotNull(resEnonce);
        // and : l'énoncé est bien celui fourni à la construction
        assertEquals(resEnonce, "un énoncé");
    }

    /**
     * Test of getScoreForIndice method, of class QuestionAChoixExclusif.
     */
    @Test
    public void testGetScoreForIndice() {
        // When : un étudiant fourni l'indice correspondant à la bonne réponse
        int indiceEtudiant = 2;
        // and : on demande le calcule du score 
        Float resScore =uneQuestion.getScoreForIndice(indiceEtudiant); 
        // then : le score obtenu est 100 pour une bonne réponse
        assertEquals(new Float(100f), resScore);
        // when : un étudiant fourni l'indice correspondant à une mauvaise réponse
        indiceEtudiant = 3;
        // and : on demande le calcule du score 
        resScore = uneQuestion.getScoreForIndice(indiceEtudiant); 
        // then : le score obtenu est 0 pour une mauvaise réponse
        assertEquals(new Float(0f), resScore);
    }
    
}
