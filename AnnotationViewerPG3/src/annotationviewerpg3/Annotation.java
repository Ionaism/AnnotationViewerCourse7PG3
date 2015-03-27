
package annotationviewerpg3;

import java.util.ArrayList;

/**
 * This class functions to create Annotation objects, which will be used to contain information as soon as we get the database up and running. 
 */
public class Annotation {
    String annotation_sequence;
    int annotation_start;
    int annotation_end;
    String strand_type;
    
    public String setAnnotation(String sequence, int start, int end, String strand){
        /*
         * This function will allow the creation of an Annotation object, with associated sequence, sequence start, sequence end and strand type variables.
         */
        this.annotation_sequence = sequence;
        this.annotation_start = start;
        this.annotation_end = end;
        this.strand_type = strand;
        return null;
    }

    public String getAnnotation(int annotation_id){
        /*
         * This function will allow the user to retrieve the associated variables from an Annotation object.
         */
        String table_annotation_start = null;
        String table_annotation_end = null;
        String table_strand_type = null;
        
        ArrayList<String> annotation_properties = new ArrayList<String>();
        annotation_properties.add(table_annotation_start);
        annotation_properties.add(table_annotation_end);
        annotation_properties.add(table_strand_type);
        return annotation_sequence;
    }
}

