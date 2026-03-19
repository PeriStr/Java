import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
// Δημιουργεια κλασης PupilList που χρησημοποιει την συλλογη hasmap με κλειδι τον αριθμο μητρωου καθε φοιτητη
public class PupilList {
	// Μεταβλητη στιγμιοτυπου pupils και  τυπος δεδομενων που αποθηκευοντε στην συλλογη δηλαδη αλφαριθμητικα 
    private Map<String, Pupil> pupils;
    // Κατασκευαστης που αρχικοποιει την μεταβλητη pupils με την συλλογη η οποια συλλογη ειναι κενη
    public PupilList() {
        pupils = new HashMap<>();
    }
    // Δημιουργεια μεθοδου getPuppils η οποια δημιουργει μια arraylist για την αποθηκευση τιμων στην συλλογη με την μεθοδο values της arraylist
    public  List<Pupil> getPupils() {
    	 return new ArrayList<>(pupils.values());
    }
    // Δημιουργεια μεθοδου addPupil() η οποια δεχετε ως παρεμετρο μια μεταβλητη τυπου pupil και με την μεθοδο put της συλλογης hasmap και καλοντας μεσα σε αυτην την μεθοδο getRegistrationNumber() προσθετει μαθητες στην συλλογη 
    public void addPupil(Pupil pupil) {
        pupils.put(pupil.getRegistrationNumber(), pupil);
    }
    // Δημιουργεια μεθοδου removePupil() η οποια δεχετε ως παραμετρο μια συμβολοσειρα δηλαδη τους αριθμους μητρωου και με την μεθοδο remove αφαιρει το συγκεκριμενο αντικειμνο απο την συλλογη
    public void removePupil(String registrationNumber) {
        pupils.remove(registrationNumber);
    }
    // Δημιουργεια μεθοδου searchPupil() η οποια δεχετε ως παραμετρο μια συμβολοσειρα δηλαδη τους αριθμους μητρωου και με την μεθοδο get αναζηταει το συγκεκριμενο αντικειμνο στην συλλογη
    public Pupil searchPupil(String registrationNumber) {
        return pupils.get(registrationNumber);
    }
}
