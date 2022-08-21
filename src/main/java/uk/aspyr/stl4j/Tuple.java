/*
 * =============================================================================
 * 
 *   Copyright (c) 2010, Aspyr
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package uk.aspyr.stl4j;

import java.io.Serializable;
import java.util.*;


/**
 * Abstract base class for all tuple classes.
 *
 * @author Darren Bell
 */
public abstract class Tuple implements Serializable, Comparable<Tuple> {

    private static final long serialVersionUID = 5431085632328343101L;
    
    private final Object[] valueArray;
    private final List<Object> valueList;

    protected Tuple(final Object... values) {
        super();
        this.valueArray = values;
        this.valueList = Arrays.asList(values);
    }

    /**
     * Return the size of the tuple.
     *
     * @return the size of the tuple.
     */
    public int size() {
        return valueArray.length;
    }

    /**
     * Get the value at a specific position in the tuple. This method
     * has to return object, so using it you will lose the type-safety you 
     * get with the <tt>getValueX()</tt> methods.
     *
     * @param pos the position of the value to be retrieved.
     * @return the value
     */
    public final Object get(final int pos) {
        if (pos >= size()) {
            throw new IllegalArgumentException(
                    "Cannot retrieve position " + pos + " in " + this.getClass().getSimpleName() + 
                    ". Positions for this class start with 0 and end with " + (size() - 1));
        }
        return this.valueArray[pos];
    }

    public final Iterator<Object> iterator() {
        return this.valueList.iterator();
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + ":" + this.valueList.toString();
    }

    public final boolean contains(final Object value) {
        for (final Object val : this.valueList) {
            if (val == null) {
                if (value == null) {
                    return true;
                }
            } else {
                if (val.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean containsAll(final Collection<?> collection) {
        if (collection == null) {
            throw new NullPointerException("Values collection cannot be null");
        }
        for (final Object value : collection) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(final Object... values) {
        if (values == null) {
            throw new NullPointerException("Values array cannot be null");
        }
        for (final Object value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public final int indexOf(final Object value) {
        int i = 0;
        for (final Object val : this.valueList) {
            if (val == null) {
                if (value == null) {
                    return i;
                }
            } else {
                if (val.equals(value)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public final int lastIndexOf(final Object value) {
        for (int i = size() - 1; i >= 0; i--) {
            final Object val = this.valueList.get(i);
            if (val == null) {
                if (value == null) {
                    return i;
                }
            } else {
                if (val.equals(value)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final List<Object> toList() {
        return Collections.unmodifiableList(new ArrayList<Object>(this.valueList));
    }

    public final Object[] toArray() {
        return this.valueArray.clone();
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.valueList == null) ? 0 : this.valueList.hashCode());
        return result;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tuple other = (Tuple) obj;
        return Objects.equals(this.valueList, other.valueList);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public int compareTo(final Tuple o) {
        
        final int tLen = this.valueArray.length;
        final Object[] oValues = o.valueArray;
        final int oLen = oValues.length;
        
        for (int i = 0; i < tLen && i < oLen; i++) {
            
            final Comparable tElement = (Comparable)this.valueArray[i];
            final Comparable oElement = (Comparable)oValues[i];
            
            final int comparison = tElement.compareTo(oElement);
            if (comparison != 0) {
                return comparison;
            }
            
        }
        
        return (Integer.valueOf(tLen)).compareTo(Integer.valueOf(oLen));
        
    }
    
    
    
}
