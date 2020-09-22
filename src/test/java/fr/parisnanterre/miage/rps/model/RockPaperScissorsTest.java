package fr.parisnanterre.miage.rps.model;



import org.testng.annotations.*;


import static fr.parisnanterre.miage.rps.model.RPSEnum.*;

import static fr.parisnanterre.miage.rps.model.RPSEnum.ROCK;
import static fr.parisnanterre.miage.rps.model.RPSEnum.PAPER;
import static fr.parisnanterre.miage.rps.model.Result.*;
import static org.junit.Assert.assertEquals;



public class RockPaperScissorsTest {
/*
    RockPaperScissors rps;
    @AfterMethod
    public void tearDown(){
        rps = null;
    }

    @BeforeMethod
    public void setUp() {
        rps = new RockPaperScissors();
    }



   // @Parameters({"papier","pierre"})

    @DataProvider(name="winData")
    public Object[][] createWinData(){
        return new Object[][]{
                {ROCK,SCISSORS},
                {PAPER,ROCK},
                {SCISSORS,PAPER}
        };
    }
    @DataProvider(name="tieData")
    public Object[][] createTieData(){
        return new Object[][]{
                {ROCK,ROCK},
                {PAPER,PAPER},
                {SCISSORS,SCISSORS}
        };

    }
    @DataProvider(name="lostData")
    public Object[][] createLostData(){
        return new Object[][]{
                {SCISSORS,ROCK},
                {ROCK,PAPER},
                {PAPER,SCISSORS}
        };
    }


    @Test(dataProvider = "winData")

    public void testWinPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.Play(p1,p2), WIN);

    }
    @Test(dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.Play(p1,p2), TIE);
    }

    @Test(dataProvider = "lostData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.Play(p1,p2), LOST);
    }




*/
}
