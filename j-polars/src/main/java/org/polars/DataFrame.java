package org.polars;

/**
 * Two-dimensional data structure representing data as a table with rows and columns.
 */
public class DataFrame {

    /**
     * Apply a custom/user-defined function (UDF) over the rows of the DataFrame.
     */

    private Long dataFramePointer = null;

    public DataFrame() {

    }
    
    public void apply() {

    }

    public void bottomK() {

    }

    public void clear() {

    }

    public void deepCopy() {

    }

    public void correlation() {

    }

    public void describe() {

    }

    public void drop() {

    }

    public void dropInPlace() {

    }

    public void dropNulls() {

    }

    public void estimatedNulls() {

    }

    public void estimatedSize() {

    }

    public void explode() {

    }

    public void extend() {

    }

    public void fillNan() {

    }

    public void fillNull() {

    }

    public void filter() {

    }
    /**
     * Find the index of a column by name. 
     */
    public Integer findIdxByName(String name) {
        return null;
    }

    public void fold() {

    }

    @Override
    public boolean equals(Object dataFrame) {
        return false;
    }

    public void getColumn() {

    }

    public void getColumns() {

    }

    public void glimpse() {

    }

    public void groupBy() {

    }

    public void groupByDynamic() {

    }

    public void groupByRolling() {

    }

    public void hashRows() {

    }

    public void head() {

    }

    public void hstack() {

    }

    public void insertAtIdx() {

    }

    public void isDuplicated() {

    }

    public boolean empty() {
        return false;
    }

    private native boolean polars_empty();

}