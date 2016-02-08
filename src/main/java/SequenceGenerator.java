/**
 * Created by katie on 2/8/16.
 */
public class SequenceGenerator {
    //0 to 30 ascii faces. print out full sequence, or print out odd numbered faces
    //write a new method for iterate sequence that accepts an array/array list and returns a string of faces
    //private array of faces in other object. getter method --- sends index of face, returns string face
    boolean isOddNumber = false;
    boolean isLetter = false;
    //call method using two ints and a selection "odd" or "all" and a selection "numbers" "letters" or "faces"
    public String createSequence(int startRange, int endRange, String oddOrAll, String numbersLettersOrFaces) {
        //defaults to all. sets boolean to true if odds are selected
        if (oddOrAll.equals("odd")) {
            isOddNumber = true;
        }
        //defaults to numbers. sets boolean to true if letters are selected
        if (numbersLettersOrFaces.equals("letters")) {
            isLetter = true;
        }
        //calls overloaded method if faces are selected
        if (numbersLettersOrFaces.equals("faces")) {
            //instantiates a new face collection object
            FaceCollection emojis = new FaceCollection();
            //calls overloaded method using face collection as argument
            return iterateSequence(startRange, endRange, emojis);

        }
        //calls regular method if no face collection is needed
        return iterateSequence(startRange, endRange);


    }

    //default method for returning just letters or numbers
    public String iterateSequence(int startRange, int endRange) {

        String sequence = "";

        for (int i = startRange; i <= endRange; i++) {
            if (isLetter) {
                sequence += ((char) (i)) + " ";
            } else {
                if (!isOddNumber) {
                    sequence += i + " ";
                } else {
                    if (i % 2 == 1) {
                        sequence += i + " ";
                    }
                }
            }

        }

        return sequence;
    }
    //overloaded method that also accepts a face collection argument
    public String iterateSequence(int startRange, int endRange, FaceCollection emojis) {
        String sequence = "";

        for (int i = startRange; i < endRange; i++) {
            //returns all faces
            if (!isOddNumber) {
                sequence += emojis.getEmojis(i) + " ";
            } else {
                //returns odd faces only
                if (i % 2 == 1) {
                    sequence += emojis.getEmojis(i) + " ";
                }
            }
        }


        return sequence;
    }

    public static void main(String[] args) {

    }

}