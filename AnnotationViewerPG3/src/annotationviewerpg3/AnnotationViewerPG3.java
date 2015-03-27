/*
 *Date of creation: 23-3-2015
 *Last update: 27-3-2015
 *Authors: Rowan Knobel, Mike Aaldering, Thijn van Kempen
 *
 *This application is made for the purpose of viewing and creating annotations from and for a sequence, and save them in a database.
 *It will also allow the user to take said sequences and annotations out of the database to alter them.
 *
 *This application is not completed, and is at the moment only meant as a proof of concept.
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
