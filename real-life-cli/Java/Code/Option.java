

package org.apache.commons.cli;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Option implements Cloneable, Serializable {

    
    public static final class Builder {

        
        private String option;

        
        private String description;

        
        private String longOption;

        
        private String argName;

        
        private boolean required;

        
        private boolean optionalArg;

        
        private int argCount = UNINITIALIZED;

        
        private Class<?> type = String.class;

        
        private char valueSeparator;

        
        private Builder(final String option) throws IllegalArgumentException {
            option(option);
        }

        
        public Builder argName(final String argName) {
            this.argName = argName;
            return this;
        }

        
        public Option build() {
            if (option == null && longOption == null) {
                throw new IllegalArgumentException("Either opt or longOpt must be specified");
            }
            return new Option(this);
        }

        
        public Builder desc(final String description) {
            this.description = description;
            return this;
        }

        
        public Builder hasArg() {
            return hasArg(true);
        }

        
        public Builder hasArg(final boolean hasArg) {
            
            argCount = hasArg ? 1 : Option.UNINITIALIZED;
            return this;
        }

        
        public Builder hasArgs() {
            argCount = Option.UNLIMITED_VALUES;
            return this;
        }

        
        public Builder longOpt(final String longOpt) {
            this.longOption = longOpt;
            return this;
        }

        
        public Builder numberOfArgs(final int numberOfArgs) {
            this.argCount = numberOfArgs;
            return this;
        }

        
        public Builder option(final String option) throws IllegalArgumentException {
            this.option = OptionValidator.validate(option);
            return this;
        }

        
        public Builder optionalArg(final boolean isOptional) {
            this.optionalArg = isOptional;
            return this;
        }

        
        public Builder required() {
            return required(true);
        }

        
        public Builder required(final boolean required) {
            this.required = required;
            return this;
        }

        
        public Builder type(final Class<?> type) {
            this.type = type;
            return this;
        }

        
        public Builder valueSeparator() {
            return valueSeparator('=');
        }

        
        public Builder valueSeparator(final char sep) {
            valueSeparator = sep;
            return this;
        }
    }

    
    public static final int UNINITIALIZED = -1;

    
    public static final int UNLIMITED_VALUES = -2;

    
    private static final long serialVersionUID = 1L;

    
    public static Builder builder() {
        return builder(null);
    }

    
    public static Builder builder(final String option) {
        return new Builder(option);
    }

    
    private final String option;

    
    private String longOption;

    
    private String argName;

    
    private String description;

    
    private boolean required;

    
    private boolean optionalArg;

    
    private int argCount = UNINITIALIZED;

    
    private Class<?> type = String.class;

    
    private List<String> values = new ArrayList<>();

    
    private char valuesep;

    
    private Option(final Builder builder) {
        this.argName = builder.argName;
        this.description = builder.description;
        this.longOption = builder.longOption;
        this.argCount = builder.argCount;
        this.option = builder.option;
        this.optionalArg = builder.optionalArg;
        this.required = builder.required;
        this.type = builder.type;
        this.valuesep = builder.valueSeparator;
    }

    
    public Option(final String option, final boolean hasArg, final String description) throws IllegalArgumentException {
        this(option, null, hasArg, description);
    }

    
    public Option(final String option, final String description) throws IllegalArgumentException {
        this(option, null, false, description);
    }

    
    public Option(final String option, final String longOption, final boolean hasArg, final String description) throws IllegalArgumentException {
        
        this.option = OptionValidator.validate(option);
        this.longOption = longOption;

        
        if (hasArg) {
            this.argCount = 1;
        }

        this.description = description;
    }

    
    boolean acceptsArg() {
        return (hasArg() || hasArgs() || hasOptionalArg()) && (argCount <= 0 || values.size() < argCount);
    }

    
    private void add(final String value) {
        if (!acceptsArg()) {
            throw new RuntimeException("Cannot add value, list full.");
        }

        
        values.add(value);
    }

    
    @Deprecated
    public boolean addValue(final String value) {
        throw new UnsupportedOperationException(
            "The addValue method is not intended for client use. " + "Subclasses should use the addValueForProcessing method instead. ");
    }

    
    void addValueForProcessing(final String value) {
        if (argCount == UNINITIALIZED) {
            throw new RuntimeException("NO_ARGS_ALLOWED");
        }
        processValue(value);
    }

    
    void clearValues() {
        values.clear();
    }

    
    @Override
    public Object clone() {
        try {
            final Option option = (Option) super.clone();
            option.values = new ArrayList<>(values);
            return option;
        } catch (final CloneNotSupportedException cnse) {
            throw new RuntimeException("A CloneNotSupportedException was thrown: " + cnse.getMessage());
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        final Option other = (Option) obj;
        return Objects.equals(longOption, other.longOption) && Objects.equals(option, other.option);
    }

    
    public String getArgName() {
        return argName;
    }

    
    public int getArgs() {
        return argCount;
    }

    
    public String getDescription() {
        return description;
    }

    
    public int getId() {
        return getKey().charAt(0);
    }

    
    String getKey() {
        
        return option == null ? longOption : option;
    }

    
    public String getLongOpt() {
        return longOption;
    }

    
    public String getOpt() {
        return option;
    }

    
    public Object getType() {
        return type;
    }

    
    public String getValue() {
        return hasNoValues() ? null : values.get(0);
    }

    
    public String getValue(final int index) throws IndexOutOfBoundsException {
        return hasNoValues() ? null : values.get(index);
    }

    
    public String getValue(final String defaultValue) {
        final String value = getValue();

        return value != null ? value : defaultValue;
    }

    
    public String[] getValues() {
        return hasNoValues() ? null : values.toArray(new String[values.size()]);
    }

    
    public char getValueSeparator() {
        return valuesep;
    }

    
    public List<String> getValuesList() {
        return values;
    }

    
    public boolean hasArg() {
        return argCount > 0 || argCount == UNLIMITED_VALUES;
    }

    
    public boolean hasArgName() {
        return argName != null && !argName.isEmpty();
    }

    
    public boolean hasArgs() {
        return argCount > 1 || argCount == UNLIMITED_VALUES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longOption, option);
    }

    
    public boolean hasLongOpt() {
        return longOption != null;
    }

    
    private boolean hasNoValues() {
        return values.isEmpty();
    }

    
    public boolean hasOptionalArg() {
        return optionalArg;
    }

    
    public boolean hasValueSeparator() {
        return valuesep > 0;
    }

    
    public boolean isRequired() {
        return required;
    }

    
    private void processValue(String value) {
        
        if (hasValueSeparator()) {
            
            final char sep = getValueSeparator();

            
            int index = value.indexOf(sep);

            
            while (index != -1) {
                
                if (values.size() == argCount - 1) {
                    break;
                }

                
                add(value.substring(0, index));

                
                value = value.substring(index + 1);

                
                index = value.indexOf(sep);
            }
        }

        
        add(value);
    }

    
    boolean requiresArg() {
        if (optionalArg) {
            return false;
        }
        if (argCount == UNLIMITED_VALUES) {
            return values.isEmpty();
        }
        return acceptsArg();
    }

    
    public void setArgName(final String argName) {
        this.argName = argName;
    }

    
    public void setArgs(final int num) {
        this.argCount = num;
    }

    
    public void setDescription(final String description) {
        this.description = description;
    }

    
    public void setLongOpt(final String longOpt) {
        this.longOption = longOpt;
    }

    
    public void setOptionalArg(final boolean optionalArg) {
        this.optionalArg = optionalArg;
    }

    
    public void setRequired(final boolean required) {
        this.required = required;
    }

    
    public void setType(final Class<?> type) {
        this.type = type;
    }

    
    @Deprecated
    public void setType(final Object type) {
        setType((Class<?>) type);
    }

    
    public void setValueSeparator(final char sep) {
        this.valuesep = sep;
    }

    
    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder().append("[ option: ");

        buf.append(option);

        if (longOption != null) {
            buf.append(" ").append(longOption);
        }

        buf.append(" ");

        if (hasArgs()) {
            buf.append("[ARG...]");
        } else if (hasArg()) {
            buf.append(" [ARG]");
        }

        buf.append(" :: ").append(description);

        if (type != null) {
            buf.append(" :: ").append(type);
        }

        buf.append(" ]");

        return buf.toString();
    }
}
