import java.util.Scanner;
// Δημιουργεια υποκλασης PupilLyceum που κληρονομει απο τις μεθοδους απο την υπερκλαση Pupil
public class PupilLyceum extends Pupil {
	//Μεταβλητες στιγμιοτυπου
	private String school;
	private String classroom;
	private double grade1;
	private double grade2;
	Scanner input = new Scanner(System.in);
	// Προεπιλεγμενος κατασκευαστης
	public PupilLyceum() {
		// Η δεσμευμενη λεξη super αναφερεται στην υπερκλαση και στις μεταβλητες στιγμιοτυπου που ειναι γραμμενες στον κατασκευαστη της
		super();
		this.school = "";
		this.classroom = "";
	}
	//Δημιουριγια κατασκευαστη και αρχικοποιηση των μεταβλητων στιγμιοτυπου με την δεσμευμενη λεξη this και ως ορισματα λαμβανει τις μεταβλητες στιγμιοτυπου
    public PupilLyceum(String name, String surname, String registrationNumber,String school,String classroom) {
    	// Η δεσμευμενη λεξη super αναφερεται στην υπερκλαση και στις μεταβλητες στιγμιοτυπου που ειναι γραμμενες στον κατασκευαστη της
       super(name, surname, registrationNumber);
       this.school = school;
       this.classroom = classroom;
    }
    // Μεθοδος write() εκτυπωνει τα στοιχεια των μαθητων μεσω των μεθοδων get των μεταβλητων @Overwrite
    public void write() {
    	// Η δεσμευμενη λεξη super καλει την μεθοδο write της υπερκλασης 
    	super.write();
    	System.out.println("The school is " + getSchool());
    	System.out.println("The classroom is " + getClassroom());
    	System.out.println("The grade of the first semester is " + grade1);
    	System.out.println("The grade of the second semester is " + grade2);
    	System.out.println("The average grade is " + getAverageGrade());
    }
    // Μεθοδος setGrade() που πρεπει να υπαρχει υποχρεοτικα εφοσον ειναι ορισμενη στην αφηρημενη κλαση ζηταει απο τον χρηστη τους βαθμους και ελεγχει εαν ειναι αναμεσα στο 0 και στο 20 εμφανιζοντασ καταλληλο μηνημα
    public void setGrade() {
        System.out.print("Enter grade for the first semester: ");
        // Διαβασμα των βαθμων 
        double grade1 = input.nextDouble();
        // Ελεγχος με επαναληψη για ορθη εισαγωγη τιμων
        while (grade1 < 0 || grade1 > 20) {
            System.out.println("Invalid grade! Grade must be between 0 and 20.Please enter again : ");
            grade1 = input.nextDouble();
        }
        // Αποθηκευση της τιμης
        this.grade1 = grade1;

        System.out.print("Enter grade for the first semester : ");
     // Διαβασμα των βαθμων 
        double grade2 = input.nextDouble();
        // Ελεγχος με επαναληψη για ορθη εισαγωγη τιμων
        while (grade2 < 0 || grade2 > 20) {
            System.out.println("Invalid grade! Grade must be between 0 and 20.Please enter again : ");
            grade2 = input.nextDouble();
        }
     // Αποθηκευση της τιμης
        this.grade2 = grade2;
    }
    // Δημιουργια  μεθοδου getAverageGrade() που πρεπει να υπαρχει υποχρεωτικα λογω της υπερκλασης και επιστρεφει τον μεσο ορο τησ βαθμολογιας που δοθηκε
    public double getAverageGrade() {
    	return (grade1 + grade2)/2;
    }
    // Getters & Setters
    public void setSchool() {
    	System.out.println("Enter the school of the student");
    	// Εισαγωγη ονοματοσ σχολειου
    	school = input.nextLine();
    	// Αποθηκευση ονοματος σχολειου
    	this.school = school;
    }
    public String getSchool() {
    	// Επιστροφη της τιμης της μεταβλητης school
    	return school;
    }
    public void setClassroom() {
        System.out.println("Enter the classroom of the student:");
        // Διαβασμα ονοματος ταξης
        classroom = input.nextLine();
        // Ελεγχος εγκυροτητας με επαναληψη και εμφανιση καταλληλου μυνηματος διοτι η μεταβλητη πρεπει να δεχεται μονο τις τιμες Α Β Γ  επιπλεον χρησημοποιειτε για τον ελεγχο η μεθοδος equalsegnorecase
        while (!classroom.equals("A") && !classroom.equals("B") && !classroom.equals("Γ")) {
            System.out.println("Invalid class level! Please enter again.");
            classroom = input.nextLine();
        }
        // Αποθηκευση της τιμης της μεταβλητης classroom
        this.classroom = classroom;
    }
    public String getClassroom(){
    	// Επιστροφη της τιμης της μεταβλητης classroom
    	return classroom;
    }
 }
