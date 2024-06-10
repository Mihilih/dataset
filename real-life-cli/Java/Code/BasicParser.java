

package org.apache.commons.cli;


@Deprecated
public class BasicParser extends Parser {
    
    @Override
    protected String[] flatten(@SuppressWarnings("unused") final Options options, final String[] arguments,
        @SuppressWarnings("unused") final boolean stopAtNonOption) {
        
        return arguments;
    }
}
