

package org.apache.commons.cli;


public class UnrecognizedOptionException extends ParseException {

    
    private static final long serialVersionUID = -252504690284625623L;

    
    private final String option;

    
    public UnrecognizedOptionException(final String message) {
        this(message, null);
    }

    
    public UnrecognizedOptionException(final String message, final String option) {
        super(message);
        this.option = option;
    }

    
    public String getOption() {
        return option;
    }
}
