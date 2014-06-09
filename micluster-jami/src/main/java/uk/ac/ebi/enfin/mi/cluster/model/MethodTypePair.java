package uk.ac.ebi.enfin.mi.cluster.model;

/**
 * A pair representing a detection method associated with an interaction type
 *
 * @author Marine Dumousseau (marine@ebi.ac.uk)
 * @version $Id$
 * @since <pre>01/04/11</pre>
 */

public class MethodTypePair {


    /**
     * The detection method
     */
    private String method;

    /**
     * The interaction type
     */
    private String type;

    public MethodTypePair(String method, String type){
        this.method = method;
        this.type = type;
    }
    public String getMethod() {
        return method;
    }

    public String getType() {
        return type;
    }

    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        MethodTypePair pair2 = (MethodTypePair) o;

        if ((method == null && pair2.getMethod() != null) || (method != null && pair2.getMethod() == null)){
             return false;
        }
        else if (method != null && !method.equalsIgnoreCase(pair2.getMethod())){
            return false;
        }

        if ((type == null && pair2.getType() != null) || (type != null && pair2.getType() == null)){
             return false;
        }
        else if (type != null && !type.equalsIgnoreCase(pair2.getType())){
            return false;
        }

        return true;
    }

    public int hashCode()
    {
        int result;
        result = (method != null ? method.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
