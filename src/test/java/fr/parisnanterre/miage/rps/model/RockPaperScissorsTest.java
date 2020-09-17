package fr.parisnanterre.miage.rps.model;

//import org.testng.TestClass;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static fr.parisnanterre.miage.rps.model.Result.LOST;
import static fr.parisnanterre.miage.rps.model.Result.TIE;
import static org.testng.Assert.*;

//import static fr.parisnanterre.miage.rps.model.Play.*;

import static fr.parisnanterre.miage.rps.model.Play.ROCK;
import static fr.parisnanterre.miage.rps.model.Play.PAPER;
import static fr.parisnanterre.miage.rps.model.Play.SCISSORS;


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
    public void testPlay(String p1, String p2) {
        //assertEquals(rps.play(Play.valueOf("PAPER"), Play.valueOf("ROCK")), TIE)
        assertEquals(rps.play(PAPER,ROCK), LOST);


    }

}
