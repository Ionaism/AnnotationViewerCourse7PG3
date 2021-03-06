/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewerpg3;

/**
 * This class functions to create DNA objects, which will be used to contain information as soon as we get the database up and running. 
 */
public class DNA extends Sequence{
    public static String getComplement(String seq) {
        /*
         * This function returns the complement sequence of an input nucleotide sequence.
         */
        seq = seq.replace("A", "1");
        seq = seq.replace("G", "2");
        seq = seq.replace("T", "A");
        seq = seq.replace("C", "G");
        seq = seq.replace("1", "T");
        seq = seq.replace("2", "C");

        return seq;
    }
}
