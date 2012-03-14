import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import uk.ac.ebi.enfin.mi.score.distribution.MiscoreDistribution;
import uk.ac.ebi.enfin.mi.score.distribution.MiscoreDistributionFromCsvScores;
import java.io.IOException;


/**
 * User: rafael
 * Date: 07-Jun-2010
 * Time: 16:35:17
 */
public class TestScoreCsv {
    static Logger logger = Logger.getLogger(TestScoreCsv.class);

    @Test
    @Ignore
    public void testScore() throws IOException {
        String scores = "0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.683472,0.558037,0.76561326,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.5871889,0.43887317,0.5221931,0.43887317,0.6631005,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.6230328,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.43887317,0.61847615,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.719498,0.683472,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.43887317,0.67817634,0.43887317,0.6230328,0.558037,0.43887317,0.558037,0.43887317,0.43887317,0.558037,0.6230328,0.6230328,0.43887317,0.558037,0.6230328,0.61847615,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.43887317,0.6834719,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.683472,0.5435199,0.6834719,0.43887317,0.6415244,0.61847615,0.61847615,0.43887317,0.43887317,0.43887317,0.6230328,0.6834719,0.80590516,0.61847615,0.6834719,0.40116468,0.82505727,0.43887317,0.43887317,0.558037,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.72958726,0.43887317,0.6230328,0.558037,0.558037,0.43887317,0.43887317,0.43887317,0.54351985,0.43887317,0.43887317,0.72958726,0.43887317,0.43887317,0.43887317,0.61847615,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.2677602,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.40116468,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.72958726,0.43887317,0.43887317,0.43887317,0.40116468,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.71347433,0.43887317,0.43887317,0.6085157,0.43887317,0.43887317,0.43887317,0.43887317,0.6085157,0.43887317,0.43887317,0.5221931,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.6230328,0.43887317,0.6761282,0.43887317,0.6761282,0.2677602,0.43887317,0.43887317,0.43887317,0.6631005,0.43887317,0.2677602,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.6230328,0.43887317,0.43887317,0.6230328,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.558037,0.43887317,0.43887317,0.40116468,0.43887317,0.7919472,0.43887317,0.59810466,0.5221931,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.2677602,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.74317217,0.43887317,0.43887317,0.43887317,0.43887317,0.52423286,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.7752996,0.4985391,0.34505215,0.43887317,0.40116468,0.4985391,0.43887317,0.40116468,0.719498,0.43887317,0.43887317,0.558037,0.683472,0.558037,0.40116468,0.558037,0.558037,0.6230328,0.43887317,0.40116468,0.40116468,0.40116468,0.36784992,0.63892347,0.43887317,0.40116468,0.36784992,0.5435199,0.40116468,0.40116468,0.40116468,0.43887317,0.40116468,0.43887317,0.43887317,0.40116468,0.558037,0.36784992,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.558037,0.558037,0.40116468,0.5892287,0.60206676,0.40116468,0.43887317,0.43887317,0.40116468,0.40116468,0.43887317,0.54351985,0.40116468,0.558037,0.558037,0.36784992,0.40116468,0.40116468,0.60164154,0.40116468,0.43887317,0.43887317,0.558037,0.4890447,0.40116468,0.40116468,0.40116468,0.43887317,0.40116468,0.40116468,0.52423286,0.40116468,0.558037,0.558037,0.43887317,0.43887317,0.34505215,0.558037,0.43887317,0.6761282,0.43887317,0.558037,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.72958726,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.40116468,0.43887317,0.558037,0.36784992,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6224311,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.40116468,0.40116468,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.558037,0.43887317,0.5435199,0.34505215,0.43887317,0.43887317,0.6230328,0.43887317,0.72958726,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6834719,0.43887317,0.43887317,0.5272462,0.43887317,0.43887317,0.40116468,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.6230328,0.43887317,0.5272462,0.43887317,0.43887317,0.43887317,0.5272462,0.43887317,0.40116468,0.43887317,0.40116468,0.36784992,0.43887317,0.54351985,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.40116468,0.60851574,0.40116468,0.36784992,0.43887317,0.52423286,0.40116468,0.36784992,0.43887317,0.40116468,0.43887317,0.40116468,0.54351985,0.40116468,0.40116468,0.40116468,0.43887317,0.43887317,0.40116468,0.60151035,0.36784992,0.40116468,0.6447328,0.64987016,0.5079592,0.43887317,0.72958726,0.43887317,0.558037,0.40116468,0.40116468,0.6230328,0.43887317,0.6230328,0.43887317,0.43887317,0.6230328,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.43887317,0.2677602,0.5272462,0.43887317,0.43887317,0.43887317,0.5272462,0.43887317,0.43887317,0.64138645,0.558037,0.5272462";
        MiscoreDistribution mD = new MiscoreDistributionFromCsvScores(scores);
//        mD.createChart("//scratch//tmp//scoreDistributionTest.png");
        mD.createChart();
    }

}
