/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewerpg3;

import java.util.ArrayList;

/**
 *
 * @author Rowan
 */
public class Annotation {
    String annotation_sequence;
    int annotation_start;
    int annotation_end;
    String strand_type;
    
    public String setAnnotation(String sequence, int start, int end, String strand){
        this.annotation_sequence = sequence;
        this.annotation_start = start;
        this.annotation_end = end;
        this.strand_type = strand;
        return null;
    }

    public String getAnnotation(int annotation_id){
        
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

