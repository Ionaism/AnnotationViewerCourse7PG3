
package annotationviewerpg3;

import java.util.HashMap;

/**
 * This class functions to create Sequence objects, which will be used to contain information as soon as we get the database up and running. 
 */
public class Sequence {
    String complete_sequence;
    String organism_name;
    
    public String setSequence(String sequence, String organism){
        /*
         * This function will allow the creation of a Sequence object, with associated sequence and organism variables.
         */
        this.complete_sequence = sequence;
        this.organism_name = organism;
        return null;
    }
    
    public String getSequence(int sequence_id){
        /*
         * This function will allow the user to retrieve the associated sequence variable from a Sequence object.
         */
        String sequence = null;
        
        return sequence;
    }
    
    public String getOrganism(int sequence_id){
        /*
         * This function will allow the user to retrieve the associated organism variable from a Sequence object.
         */
        String organism = null;
        
        return organism;
    }
    public static String getTranslation(String sequence){
        /*
         * This function returns the protein translation from a received nucleotide sequence.
         */
        int counter = 0;
        String[] seqArray = sequence.split("");
        String seq = "";
        HashMap<String, String> aminoacids;
        aminoacids = new HashMap();
        aminoacids.put("TTT","F");
        aminoacids.put("TTC","F");
        aminoacids.put("TTA","L");
        aminoacids.put("TTG","L");
        aminoacids.put("TCT","S");
        aminoacids.put("TCC","S");
        aminoacids.put("TCA","S");
        aminoacids.put("TCG","S");
        aminoacids.put("TAT","Y");
        aminoacids.put("TAC","Y");
        aminoacids.put("TAA","*");
        aminoacids.put("TAG","*");
        aminoacids.put("TGT","C");
        aminoacids.put("TGC","C");
        aminoacids.put("TGA","*");
        aminoacids.put("TGG","W");
        aminoacids.put("CTT","L");
        aminoacids.put("CTC","L");
        aminoacids.put("CTA","L");
        aminoacids.put("CTG","L");
        aminoacids.put("CCT","P");
        aminoacids.put("CCC","P");
        aminoacids.put("CCA","P");
        aminoacids.put("CCG","P");
        aminoacids.put("CAT","H");
        aminoacids.put("CAC","H");
        aminoacids.put("CAA","Q");
        aminoacids.put("CAG","Q");
        aminoacids.put("CGT","R");
        aminoacids.put("CGC","R");
        aminoacids.put("CGA","R");
        aminoacids.put("CGG","R");
        aminoacids.put("ATT","I");
        aminoacids.put("ATC","I");
        aminoacids.put("ATA","I");
        aminoacids.put("ATG","M");
        aminoacids.put("ACT","T");
        aminoacids.put("ACC","T");
        aminoacids.put("ACA","T");
        aminoacids.put("ACG","T");
        aminoacids.put("AAT","N");
        aminoacids.put("AAC","N");
        aminoacids.put("AAA","K");
        aminoacids.put("AAG","K");
        aminoacids.put("AGT","S");
        aminoacids.put("AGC","S");
        aminoacids.put("AGA","R");
        aminoacids.put("AGG","R");
        aminoacids.put("GTT","V");
        aminoacids.put("GTC","V");
        aminoacids.put("GTA","V");
        aminoacids.put("GTG","V");
        aminoacids.put("GCT","A");
        aminoacids.put("GCC","A");
        aminoacids.put("GCA","A");
        aminoacids.put("GCG","A");
        aminoacids.put("GAT","D");
        aminoacids.put("GAC","D");
        aminoacids.put("GAA","E");
        aminoacids.put("GAG","E");
        aminoacids.put("GGT","G");
        aminoacids.put("GGC","G");
        aminoacids.put("GGA","G");
        aminoacids.put("GGG","G");

        while (counter <= sequence.length()){
            try{
            String nucleotides = seqArray[counter] + seqArray[counter+1] + seqArray[counter+2];
            String aminoacid = aminoacids.get(nucleotides);
            seq = seq + aminoacid;
            counter = counter + 3;
            }
            catch (IndexOutOfBoundsException ex){
                return seq;
            }
        }
        return seq;
    }
}
