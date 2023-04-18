package org.polars;

import java.util.List;
import java.util.Map;

import org.polars.util.FrameInitTypes;
import org.polars.util.Orientation;
import org.polars.util.SchemaDefinition;
import org.polars.util.SchemaDict;

/**
 * Representation of a Lazy computation graph/query against a DataFrame.
 * 
 * This allows for whole-query optimisation in addition to parallelism, and is
 * the preferred (and highest-performance) mode of operation for polars.
 */
public class LazyFrame {
    FrameInitTypes data;
    SchemaDefinition schema;
    SchemaDict schema_Overrides;
    Orientation orient;
    int inferSchemaLength = 100;
    boolean nanToNull = false;

    public LazyFrame(FrameInitTypes data, SchemaDefinition schema, SchemaDict schema_Overrides, Orientation orient,
            int inferSchemaLength, boolean nanToNull) {
        this.data = data;
        this.schema = schema;
        this.schema_Overrides = schema_Overrides;
        this.orient = orient;
        this.inferSchemaLength = inferSchemaLength;
        this.nanToNull = nanToNull;
    }

    public void approx_unique() {

    }

    public void bottom_k() {

    }

    public void cache() {

    }

    public void clear() {

    }

    public void copy() {

    }

    public void collect() {

    }

    public void describeOptimizedPlan() {

    }

    public void drop() {

    }

    public void dropNulls() {

    }

    public void explain() {

    }

    public void explode() {

    }

    public void fetch() {

    }

    public void fillNan() {

    }

    public void fillNull() {

    }

    public void filder() {

    }

    public void first() {

    }

    public void fromJson() {

    }

    public void groupBy() {

    }

    public void groupbyDynamic() {

    }

    public void groupByRolloing() {

    }

    public void head() {

    }

    public void inspect() {

    }

    public void interpolate() {

    }

    public void join() {

    }

    public void joinAsof() {

    }

    public void last() {

    }

    public void lazy() {

    }

    public void limit() {

    }

    public void map() {

    }

    public void max() {

    }

    public void mean() {

    }

    public void median() {

    }

    public void melt() {

    }

    public void mergeSorted() {

    }

    public void min() {

    }

    public void pipe() {

    }

    public void profile() {

    }

    public void quantile() {

    }

    public void readJson() {

    }

    public void rename() {

    }

    public void reverse() {

    }

    public void select() {

    }

    public void shift() {

    }

    public void shiftAndFill() {

    }

    public void showGraph() {

    }

    public void sinkIpc() {

    }

    public void sinkGraph() {

    }

    public void slice() {

    }

    public void sort() {

    }

    public void std() {
    }

    public void sum() {
    }

    public void tail() {
    }

    public void takeEvery() {
    }

    public void topK() {
    }

    public void unique() {
    }

    public void unnest() {
    }

    public void update() {
    }

    public void variance() {
    }

    public void withColumns() {
    }

    public void withContext() {
    }

    public void withRowCount() {
    }

    public void writeJson() {
    }

    public native List<String> getColumns();

    public native void getDtypes();

    public native Map<String, DataType> getSchema();

    /**
     * Get the width of the LazyFrame.
     * 
     * @return
     */
    public native int getWidth();

    public static class Builder {
        private FrameInitTypes data = null;
        private SchemaDefinition schema = null;
        private SchemaDict schemaOverrides = null;
        private Orientation orient = null;
        private int inferSchemaLength = 100;
        private boolean nanToNull = false;

        public Builder getBuilder() {
            return this;
        }

        /**
         * Two-dimensional data in various forms; dict input must contain Sequences,
         * Generators, or a range. Sequence may contain Series or other Sequences.
         * 
         * @param data
         * @return
         */
        public Builder setData(FrameInitTypes data) {
            this.data = data;
            return this;
        }

        /**
         * The DataFrame schema may be declared in several ways:
         * 
         * As a dict of {name:type} pairs; if type is None, it will be auto-inferred.
         * 
         * As a list of column names; in this case types are automatically inferred.
         * 
         * As a list of (name,type) pairs; this is equivalent to the dictionary form.
         * 
         * If you supply a list of column names that does not match the names in the
         * underlying data, the names given here will overwrite them. The number of
         * names given in the schema should match the underlying data
         * 
         * @param schema
         * @return
         */
        public Builder setSchema(SchemaDefinition schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Support type specification or override of one or more columns; note that any
         * dtypes inferred from the schema param will be overridden. underlying data,
         * the names given here will overwrite them.
         * 
         * The number of entries in the schema should match the underlying data
         * dimensions, unless a sequence of dictionaries is being passed, in which case
         * a _partial_ schema can be declared to prevent specific fields from being
         * loaded.
         * 
         * @param schema_Overrides
         * @return
         */
        public Builder setSchemaOverrides(SchemaDict schemaOverrides) {
            this.schemaOverrides = schemaOverrides;
            return this;
        }

        /**
         * Whether to interpret two-dimensional data as columns or as rows. If None, the
         * orientation is inferred by matching the columns and data dimensions. If this
         * does not yield conclusive results, column orientation is used.
         * 
         * @param orient
         * @return
         */
        public Builder setOrient(Orientation orient) {
            this.orient = orient;
            return this;
        }

        /**
         * Maximum number of rows to read for schema inference; only applies if the
         * input data is a sequence or generator of rows; other input is read as-is.
         * 
         * @param inferSchemaLength
         * @return
         */
        public Builder setInferSchemaLength(int inferSchemaLength) {
            this.inferSchemaLength = inferSchemaLength;
            return this;
        }

        /**
         * If the data comes from one or more numpy arrays, can optionally convert input
         * data np.nan values to null instead. This is a no-op for all other input data.
         * 
         * @param nanToNull
         * @return
         */
        public Builder setNanToNull(boolean nanToNull) {
            this.nanToNull = nanToNull;
            return this;
        }

        public LazyFrame build() {
            return new LazyFrame(data, schema, schemaOverrides, orient, inferSchemaLength, nanToNull);
        }
    }
}
