/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewerpg3;

/**
 *
 * @author Rowan
 */
public class Sequence {
    String complete_sequence;
    String organism_name;
    
    public String setSequence(String sequence, String organism){
        this.complete_sequence = sequence;
        this.organism_name = organism;
        return null;
    }
    
    public String getSequence(int sequence_id){
        
        String sequence = null;
        
        return sequence;
    }
    
    public String getOrganism(int sequence_id){
        
        String organism = null;
        
        return organism;
    }
    
}
