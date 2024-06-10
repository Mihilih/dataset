

package org.apache.commons.cli;


public class AlreadySelectedException extends ParseException {

    
    private static final long serialVersionUID = 3674381532418544760L;

    
    private final OptionGroup group;

    
    private final Option option;

    
    public AlreadySelectedException(final OptionGroup group, final Option option) {
        this("The option '" + option.getKey() + "' was specified but an option from this group " + "has already been selected: '" + group.getSelected() + "'",
            group, option);
    }

    
    public AlreadySelectedException(final String message) {
        this(message, null, null);
    }

    private AlreadySelectedException(final String message, final OptionGroup group, final Option option) {
        super(message);
        this.group = group;
        this.option = option;
    }

    
    public Option getOption() {
        return option;
    }

    
    public OptionGroup getOptionGroup() {
        return group;
    }
}
