

package org.apache.commons.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;


public class TypeHandler {
    
    public static Class<?> createClass(final String classname) throws ParseException {
        try {
            return Class.forName(classname);
        } catch (final ClassNotFoundException e) {
            throw new ParseException("Unable to find the class: " + classname);
        }
    }

    
    public static Date createDate(final String str) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
    public static File createFile(final String str) {
        return new File(str);
    }

    
    public static File[] createFiles(final String str) {
        
        
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
    public static Number createNumber(final String str) throws ParseException {
        try {
            if (str.indexOf('.') != -1) {
                return Double.valueOf(str);
            }
            return Long.valueOf(str);
        } catch (final NumberFormatException e) {
            throw new ParseException(e.getMessage());
        }
    }

    
    public static Object createObject(final String classname) throws ParseException {
        final Class<?> cl;

        try {
            cl = Class.forName(classname);
        } catch (final ClassNotFoundException cnfe) {
            throw new ParseException("Unable to find the class: " + classname);
        }

        try {
            return cl.newInstance();
        } catch (final Exception e) {
            throw new ParseException(e.getClass().getName() + "; Unable to create an instance of: " + classname);
        }
    }

    
    public static URL createURL(final String str) throws ParseException {
        try {
            return new URL(str);
        } catch (final MalformedURLException e) {
            throw new ParseException("Unable to parse the URL: " + str);
        }
    }

    
    @SuppressWarnings("unchecked") 
    public static <T> T createValue(final String str, final Class<T> clazz) throws ParseException {
        if (PatternOptionBuilder.STRING_VALUE == clazz) {
            return (T) str;
        }
        if (PatternOptionBuilder.OBJECT_VALUE == clazz) {
            return (T) createObject(str);
        }
        if (PatternOptionBuilder.NUMBER_VALUE == clazz) {
            return (T) createNumber(str);
        }
        if (PatternOptionBuilder.DATE_VALUE == clazz) {
            return (T) createDate(str);
        }
        if (PatternOptionBuilder.CLASS_VALUE == clazz) {
            return (T) createClass(str);
        }
        if (PatternOptionBuilder.FILE_VALUE == clazz) {
            return (T) createFile(str);
        }
        if (PatternOptionBuilder.EXISTING_FILE_VALUE == clazz) {
            return (T) openFile(str);
        }
        if (PatternOptionBuilder.FILES_VALUE == clazz) {
            return (T) createFiles(str);
        }
        if (PatternOptionBuilder.URL_VALUE == clazz) {
            return (T) createURL(str);
        }
        throw new ParseException("Unable to handle the class: " + clazz);
    }

    
    public static Object createValue(final String str, final Object obj) throws ParseException {
        return createValue(str, (Class<?>) obj);
    }

    
    public static FileInputStream openFile(final String str) throws ParseException {
        try {
            return new FileInputStream(str);
        } catch (final FileNotFoundException e) {
            throw new ParseException("Unable to find file: " + str);
        }
    }
}
