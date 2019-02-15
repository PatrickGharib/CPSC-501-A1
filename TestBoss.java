/**
 * CPSC 501 A1
 * @author Patrick Abou Gharib
 * junit tests for bos class
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class TestBoss{
    @Test
    public void testIfCharacterAttributesIsFunctioningInConstructor(){
        assertNotNull(new boss());
        Boss testBoss1 = new Boss();
        assertEquals(-1, testBoss1.getHealth());
        assertEquals(-1, testBoss1.getStrength());
        assertEquals(-1, testBoss1.getAccuracy());
    }
    @Test
    public void testBossSetter(){
        assertNotNull(new boss());
        Boss testBoss1 = new Boss();
        assertEquals(15, testBoss.setStrength(15));
        assertEquals(15, testBoss.setHealth(15));
    }@Test
    public void testBossSetter(){
        assertNotNull(new boss());
        Boss testBoss1 = new Boss();
        assertEquals(50, testBoss.setStrength(50));
        assertEquals(50, testBoss.setHealth(50));
    }
    @Test
    public void testBossSetter(){
        assertNotNull(new boss());
        Boss testBoss1 = new Boss();
        assertEquals(60, testBoss.setStrength(60));
        assertEquals(60, testBoss.setHealth(60));
    }
    @Test
    public void testBossStatsGenerator(){
        Player testPlayer1 = new player();
        player.generateMage();
        Boss testBoss1 = new Boss(testPlayer1);
        assertEquals(testBoss1.getHealth(),(testPlayer1.getHealth()*20));
        assertEquals(testBoss1.getStrength(), (testPlayer1.getStrength() * 2));
        assertTrue(testBoss1.getAccuracy() < 100);
        assertTrue(testBoss1.getAccuracy() > 0);
        assertNotEquals(-1,boss.getAccuracy);
    }

    @Test
    public void testBossCounterAttack(){
        Player testPlayer1 = new Player();
        testPlayer1.generateMage();
        Boss TestBoss1 = new Boss(testPlayer1);
        int testPlayersHPBeforeCounterAttack = testPlayer1.getHealth();
        testBoss1.counterAttack(testPlayer1);
        int testPlayersHPAfterCounterAttack = testPlayer1.getHealth();
        assertTrue(testPlayersHPBeforeCounterAttack >= testPlayersHPAfterCounterAttack);

    }

}
