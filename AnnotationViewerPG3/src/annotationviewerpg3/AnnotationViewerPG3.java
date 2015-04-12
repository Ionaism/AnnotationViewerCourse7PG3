/*
 *Date of creation: 23-3-2015
 *Last update: 12-4-2015
 *Authors: Rowan Knobel, Mike Aaldering, Thijn van Kempen
 *
 *This application is made for the purpose of viewing and creating annotations from and for a sequence, and save them in a database.
 *It will also allow the user to take said sequences and annotations out of the database to alter them.
 *
 *This application is not completed, and is at the moment only meant as a proof of concept.
 *
 *Currently known bugs: 
 * 1. When a part of a sequence is highlighted in a text area, and if one wants to highlight a sequence in a different area, you have to make sure you
 *de-highlight the sequence in the first text area. Otherwise the selected highlight will be the former highlighted sequence.
 *
 * 2. The database can only be connected to with a localhost, which means it requires a program like XAMPP to work. 
 */
package annotationviewerpg3;


public class AnnotationViewerPG3 {

    /**
     *This is the main class. It functions to initiate the creation of the user interface.
     */
    public static void main(String[] args) {
        new CreateGUI().setVisible(true);
    }
    
}
