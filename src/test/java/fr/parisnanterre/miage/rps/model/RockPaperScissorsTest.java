package fr.parisnanterre.miage.rps.model;



import org.testng.annotations.*;

import static fr.parisnanterre.miage.rps.model.Result.LOST;

import static fr.parisnanterre.miage.rps.model.RPSEnum.*;

import static fr.parisnanterre.miage.rps.model.RPSEnum.ROCK;
import static fr.parisnanterre.miage.rps.model.RPSEnum.PAPER;
import static fr.parisnanterre.miage.rps.model.Result.TIE;
import static org.junit.Assert.assertEquals;

import org.testng.asserts.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;
    @AfterMethod
    public void tearDown(){
        rps = null;
    }

    @BeforeMethod
    public void setUp() {
        rps = new RockPaperScissors();
    }

    /* it's me mario 2  */

   // @Parameters({"papier","pierre"})

    @DataProvider(name="winData")
    public Object[][] createWinData(){
        return new Object[][]{
                {rps.Play(ROCK,SCISSORS)},
                {rps.Play(PAPER,ROCK)},
                {rps.Play(SCISSORS,PAPER)}
        };
    }

    @Test(dataProvider = "winData")

    /*
    public void testWinPlay(String p1, String p2) {
        //assertEquals(rps.play(Play.valueOf("PAPER"), Play.valueOf("ROCK")), TIE)
        assertEquals(rps.Play(PAPER,ROCK), LOST);
    }

    public void testTiePlay(String p1, String p2) {
        assertEquals(rps.Play(ROCK,ROCK), TIE);
    }
    */


}
