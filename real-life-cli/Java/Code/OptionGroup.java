

package org.apache.commons.cli;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class OptionGroup implements Serializable {
    
    private static final long serialVersionUID = 1L;

    
    private final Map<String, Option> optionMap = new LinkedHashMap<>();

    
    private String selected;

    
    private boolean required;

    
    public OptionGroup addOption(final Option option) {
        
        
        optionMap.put(option.getKey(), option);

        return this;
    }

    
    public Collection<String> getNames() {
        
        return optionMap.keySet();
    }

    
    public Collection<Option> getOptions() {
        
        return optionMap.values();
    }

    
    public String getSelected() {
        return selected;
    }

    
    public boolean isRequired() {
        return required;
    }

    
    public void setRequired(final boolean required) {
        this.required = required;
    }

    
    public void setSelected(final Option option) throws AlreadySelectedException {
        if (option == null) {
            
            selected = null;
            return;
        }

        
        
        
        if (selected != null && !selected.equals(option.getKey())) {
            throw new AlreadySelectedException(this, option);
        }
        selected = option.getKey();
    }

    
    @Override
    public String toString() {
        final StringBuilder buff = new StringBuilder();

        final Iterator<Option> iter = getOptions().iterator();

        buff.append("[");

        while (iter.hasNext()) {
            final Option option = iter.next();

            if (option.getOpt() != null) {
                buff.append("-");
                buff.append(option.getOpt());
            } else {
                buff.append("--");
                buff.append(option.getLongOpt());
            }

            if (option.getDescription() != null) {
                buff.append(" ");
                buff.append(option.getDescription());
            }

            if (iter.hasNext()) {
                buff.append(", ");
            }
        }

        buff.append("]");

        return buff.toString();
    }
}
