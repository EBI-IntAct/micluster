package uk.ac.ebi.enfin.mi.cluster.score;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Assert;

/**
 * User: rafael
 * Date: 08-Jun-2010
 * Time: 11:42:47
 */
public class TestSaveScore extends TestCase {
    private static String bout = "Bad output for";
    static Logger logger = Logger.getLogger(TestSaveScore.class);
    public void testSaveScores(){
        InteractionClusterScore ics = new InteractionClusterScore();
        ics.addMIQLQuery("P04637");
        ics.addQuerySource("IntAct");
        ics.saveScores();
        Assert.assertTrue(ics.getInteractionMapping().size() > 0);
    }
}
