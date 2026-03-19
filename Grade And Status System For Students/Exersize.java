
import java.util.Scanner;
// Κυριως προγραμμα main 
public class Exersize {
    public static void main(String[] args) {
    	// Δημιοθργεια αντικειμενων 
    	// Δημιουργεια αντικειμενου τυπου scanner για διαβασμα τιμων
        Scanner input = new Scanner(System.in);
        // Δημιουργεια αντικειμενου τυπου PupilList 
        PupilList pupilList = new PupilList();
     // Δημιουργεια αντικειμενου τυπου PupilLyceum
        PupilLyceum pupilLyceum = new PupilLyceum();
     // Δημιουργεια αντικειμενου τυπου pupilGymnasium
        PupilGymnasium pupilGymnasium = new PupilGymnasium();
        // Εμφανιση μενου επιλογων 
        while (true) {
            System.out.println("Menu:");
            System.out.println("a) Insert a gymnasium student:");
            System.out.println("b) Insert a lyceum student:");
            System.out.println("c) Print the status of all gymnasium students:");
            System.out.println("d) Print the status of all lyceum students:");
            System.out.println("e) Searching of a student using his registration number and print his status:");
            System.out.println("f) Deleat student after search him with registration number:");
            System.out.println("choice:");
            // Διαβασμα επιλογης
            String choice = input.nextLine();
           // Περιπτωσεις χρησημοποιοντας την switch
            switch (choice) {
                case "a":
                	 System.out.println("Insert a gymnasium student:");
                	 // Δημιουργεια αντικειμενου τυπου pupilGymnasium
                	    PupilGymnasium newPupilGymnasium = new PupilGymnasium();
                	    // Κληση μεθοδων set() της κλασης PupilGymnasium για εισαγωγη στοιχειων των μαθητων
                	    newPupilGymnasium.setName();
                	    newPupilGymnasium.setSurname();
                	    newPupilGymnasium.setRegistrationNumber();
                	    newPupilGymnasium.setSchool();
                	    newPupilGymnasium.setClassroom();
                	    newPupilGymnasium.setGrade();
                	    // Αποθηκευση των στοιχειων στην συλλογη με την μεθοδο addpupil()
                	    pupilList.addPupil(newPupilGymnasium); 
                	    System.out.println("Do you want to insert another student? YES/NO");
                	    // Διαβασμα επιλογης
                	    choice = input.nextLine();
                	    // Επαναλαμβανεται το συγκεκριμενο τμημα κωδικα μεχρι να πατησει YES χρηστης
                	    while(choice.equalsIgnoreCase("YES")){   
                	    	 // Δημιουργεια αντικειμενου τυπου pupilGymnasium
                	        PupilGymnasium anotherNewPupilGymnasium = new PupilGymnasium();
                	        // Κληση μεθοδων set() της κλασης PupilGymnasium για εισαγωγη στοιχειων των μαθητων
                	        anotherNewPupilGymnasium.setName();
                	        anotherNewPupilGymnasium.setSurname();
                	        anotherNewPupilGymnasium.setRegistrationNumber();
                	        anotherNewPupilGymnasium.setSchool();
                	        anotherNewPupilGymnasium.setClassroom();
                	        anotherNewPupilGymnasium.setGrade();
                	     // Αποθηκευση των στοιχειων στην συλλογη με την μεθοδο addpupil()
                	        pupilList.addPupil(anotherNewPupilGymnasium);  
                	        System.out.println("Do you want to insert another student? YES/NO");
                	     // Διαβασμα επιλογης
                	        choice = input.nextLine();
                	    }
                	    break;
                case "b":
                    System.out.println("Insert a lyceum student:");
                    // Δημιουργεια αντικειμενου τυπου PupilLyceum
                    PupilLyceum newPupilLyceum = new PupilLyceum();
                    // Κληση μεθοδων set() της κλασης PupilLyceum για εισαγωγη στοιχειων των μαθητων
                    newPupilLyceum.setName();
                    newPupilLyceum.setSurname();
                    newPupilLyceum.setRegistrationNumber();
                    newPupilLyceum.setSchool();
                    newPupilLyceum.setClassroom();
                    newPupilLyceum.setGrade();
                    // Αποθηκευση των στοιχειων στην συλλογη με την μεθοδο addpupil()
                    pupilList.addPupil(newPupilLyceum);
                    System.out.println("Do you want to insert another student? YES/NO");
                    // Διαβασμα επιλογης
                    choice = input.nextLine();
                    // Επαναλαμβανεται το συγκεκριμενο τμημα κωδικα μεχρι να πατησει YES χρηστης
                    while(choice.equalsIgnoreCase("YES")){
                    	 // Δημιουργεια αντικειμενου τυπου PupilLyceum
                    	 PupilLyceum anotherNewPupilLyceum = new PupilLyceum();
                    	 // Κληση μεθοδων set() της κλασης PupilGymnasium για εισαγωγη στοιχειων των μαθητων
                    	 anotherNewPupilLyceum.setName();
                    	 anotherNewPupilLyceum.setSurname();
                    	 anotherNewPupilLyceum.setRegistrationNumber();
                    	 anotherNewPupilLyceum.setSchool();
                    	 anotherNewPupilLyceum.setClassroom();
                    	 anotherNewPupilLyceum.setGrade();
                    	 // Αποθηκευση των στοιχειων στην συλλογη με την μεθοδο addpupil()
                         pupilList.addPupil(anotherNewPupilLyceum);
                         System.out.println("Do you want to insert another student? YES/NO");
                         // Διαβασμα επιλογης
                         choice = input.nextLine();
                    }
                    break;
                case "c":
                    System.out.println("Print the status of all gymnasium students:");
                    // Δημιουργει μια μεταβλητη τυπου pupil μεσα σε μια for και αναλογα με το ποσες φορες ο χρηστης εκανε εισαγωγη μαθητων επαναλαμπβανεται
                    for (Pupil pupil : pupilList.getPupils()) {
                    	// Εμφανιση ολων των στοιχειων των μαθητων γυμνασιου με την μεθοδο write()
                        if (pupil instanceof PupilGymnasium) {
                            pupil.write();
                        }
                    }
                    break;
                case "d":
                    System.out.println("Print the status of all lyceum students:");
                    // Δημιουργει μια μεταβλητη τυπου pupil μεσα σε μια for και αναλογα με το ποσες φορες ο χρηστης εκανε εισαγωγη μαθητων επαναλαμπβανεται
                    for (Pupil pupil : pupilList.getPupils()) {
                    	// Εμφανιση ολων των στοιχειων των μαθητων λυκειου με την μεθοδο write()
                        if (pupil instanceof PupilLyceum) {
                            pupil.write();
                        }
                    }
                    break;
                case "e":
                    System.out.println("Searching of a student using his registration number and print his status:");
                    System.out.println("Give the registration number of the student:");
                    // Διαβασμα αριθμου μητρωου
                    String registrationNumber = input.nextLine();
                    // Δημιουργεια μεταβλητης τυπου pupil και αναζητηση στην λιστα για τον αν υπαρχει ο αριθμος
                    Pupil pupil = pupilList.searchPupil(registrationNumber);
                    // Αν υπαρχει ο αριθμος εμφανιζεται ο συγκεκριμενος μαθητης με την μεθοδο write()
                    if(pupil != null){
                        pupil.write();
                    } else{
                        System.out.println("Student with this registration number not found.");
                    }
                    break;
                case "f":
                    System.out.println("Deleat student after search him with registration number:");
                    // δημιουργεια μεταβλητης τυπου pupil και εισαγωγη της τιμης null σε αυτην δηλαδη ειναι κενη
                    Pupil pupilToDeleat = null;
                    // Οσο η μεταβλητη ειναι ιση με το κενο επαναλαμβανεται το παρακατω τμημα κωδικα
                    while (pupilToDeleat == null) {
                    	 System.out.println("Give the registration number of the student:");
                    	 // Διαβασμα αριθμου μητρωου
                    	 registrationNumber = input.nextLine();
                    	 // Αναζητηση αν υπαρχει ο συγκεκριμενος αριθμος στην λιστα
                    	 pupilToDeleat = pupilList.searchPupil(registrationNumber);
                    	 // Αν βρεθει ο αριθμος διαγραφει τον μαθητη με την μεθοδο removePupil της συλλογης και εμφανιζει τα στοιχεια αυτου που διαγραφτηκε
                    	 if(pupilToDeleat != null) {
                    		 pupilList.removePupil(registrationNumber);
                 	        System.out.println("Student with registration number " + registrationNumber + " deleted.");
                 	        pupilToDeleat.write();
                    	 }
                    	 else {
                    		 System.out.println("Student with this registration number not found.");
                    	 }
                    }
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            System.out.println();
        }
    }
}