package psidev.psi.mi.jami.cluster.io.input;

import psidev.psi.mi.jami.model.Interaction;
import psidev.psi.mi.jami.tab.io.parser.BinaryLineParser;
import psidev.psi.mi.jami.tab.io.parser.ParseException;

import java.io.InputStream;

/**
 * Created by maitesin on 12/06/2014.
 */
public class MitabClusterInput extends AbstractClusterInput {

    /************************/
    /***   Constructors   ***/
    /************************/
    public MitabClusterInput(InputStream input) {
        this.parser = new BinaryLineParser(input);
        this.next = null;
        this.first = true;
    }

    /**************************/
    /***   Public Methods   ***/
    /**************************/
    @Override
    public Interaction next(){
        if (first) {
            first = false;
            try {
                setUpFirstNext();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Interaction current = this.next;
        try {
            this.next = this.parser.MitabLine();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return current;
    }

    @Override
    public boolean hasNext() {
        if (first) {
            return ! this.parser.hasFinished();
        }
        else {
            return this.next != null;
        }
    }

    /***************************/
    /***   Private Methods   ***/
    /***************************/
    private void setUpFirstNext() throws ParseException {
        this.next = this.parser.MitabLine();
    }

    /******************************/
    /***   Private Attributes   ***/
    /******************************/
    private boolean first;
    private Interaction next;
    private BinaryLineParser parser;

}
