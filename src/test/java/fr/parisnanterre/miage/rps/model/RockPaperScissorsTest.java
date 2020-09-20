package fr.parisnanterre.miage.rps.model;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static fr.parisnanterre.miage.rps.model.Result.LOST;

import static fr.parisnanterre.miage.rps.model.RPSEnum.*;

import static fr.parisnanterre.miage.rps.model.RPSEnum.ROCK;
import static fr.parisnanterre.miage.rps.model.RPSEnum.PAPER;
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

    @Parameters({"papier","pierre"})

    @Test
    public void testWinPlay(String p1, String p2) {
        //assertEquals(rps.play(Play.valueOf("PAPER"), Play.valueOf("ROCK")), TIE)
        assertEquals(rps.Play(ROCK,ROCK), LOST);


    }

}
