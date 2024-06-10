

package org.apache.commons.cli;


public interface CommandLineParser {

    
    CommandLine parse(Options options, String[] arguments) throws ParseException;

    
    

    
    CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException;

    
    
}
