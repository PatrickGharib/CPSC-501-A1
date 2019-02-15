/**
 * CPSC 501 A1
 * @author Patrick Abou Gharib
 * junit tests for player class
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class TestPlayer{
    @Test
    public void testConstructor(){
        assertNotNull(new Player());
        Player testPlayer1 = new Player();
        assertEquals(-1, testPlayer1.getHealth());
        assertEquals(-1, testPlayer1.getStrength());
        assertEquals(-1, testPlayer1.getIntelligence());
        assertEquals(-1, testPlayer1.getEvade());

    }

    @Test
    public void testGenerateMage(){
        Player testPlayer1 = new Player();
        testPlayer1.generateMage();

        assertTrue(testPlayer1.getHealth() >= 15);
        assertTrue(testPlayer1.getStrength() >= 15);
        assertTrue(testPlayer1.getIntelligence() >= 5);
        assertTrue(testPlayer1.getEvade() >= 5);

    }
    @Test
    public void testPlayerAttack(){
        Player testPlayer1 = new Player();
        testPlayer1.generateMage(); 
        Boss TestBoss1 = new Boss(testPlayer1);
        
        int testBossHPBeforeAttack = testBoss1.getHealth();
        testPlayer1.attack(1, testBoss1);
        int testBossHPAfterAttack = testBoss1.getHealth();
        assertTrue(testBossHPBeforeCounterAttack >= testBossHPAfterCounterAttack);
    }

    @Test
    public void testGenerateWarrior(){
        Player testPlayer1 = new Player();
        testPlayer1.generateWarrior();

        assertTrue(testPlayer1.getHealth() >= 15);
        assertTrue(testPlayer1.getStrength() >= 15);
        assertTrue(testPlayer1.getIntelligence() >= 5);
        assertTrue(testPlayer1.getEvade() >= 5);

    }
    @Test
    public void testPlayerAttack2(){
        Player testPlayer2 = new Player();
        testPlayer2.generateWarrior();
        Boss TestBoss2 = new Boss(testPlayer2);
        int testBossHPBeforeAttack = testBoss2.getHealth();
        testPlayer2.attack(2, testBoss2);
        int testBossHPAfterAttack = testBoss2.getHealth();
        assertTrue(testBossHPBeforeCounterAttack >= testBossHPAfterCounterAttack);
    }    
    @Test
    public void testGenerateTheif(){
        Player testPlayer1 = new Player();
        testPlayer1.generateTheif();

        assertTrue(testPlayer1.getHealth() >= 15);
        assertTrue(testPlayer1.getStrength() >= 15);
        assertTrue(testPlayer1.getIntelligence() >= 5);
        assertTrue(testPlayer1.getEvade() >= 5);

    }
    
    @Test
    public void testPlayerAttack3(){
        player testPlayer3 = new Player();
        testPlayer3.generateWarrior();
        Boss TestBoss3 = new Boss(testPlayer3);
        int testBossHPBeforeAttack = testBoss3.getHealth();
        testPlayer1.attack(1, testBoss3);
        int testBossHPAfterAttack = testBoss3.getHealth();
        assertTrue(testBossHPBeforeCounterAttack >= testBossHPAfterCounterAttack);

    }

}