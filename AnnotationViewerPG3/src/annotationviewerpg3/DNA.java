/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewerpg3;

/**
 *.
 * @author Rowan
 */
public class DNA extends Sequence{
    public String getComplement() {
        int sequence_id = 0;
        String seq = this.getSequence(sequence_id);
        int counter = 0;
        seq = seq.replace("A", "1");
        seq = seq.replace("G", "2");
        seq = seq.replace("T", "A");
        seq = seq.replace("C", "G");
        seq = seq.replace("1", "T");
        seq = seq.replace("2", "C");

        return seq;
    }
}
