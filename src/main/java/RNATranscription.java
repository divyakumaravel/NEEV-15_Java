import java.util.Scanner;

class RnaTranscription {
    private enum strand {
        G("C"),
        C("G"),
        A("U"),
        T("A");

        private final String equivalentStrand;
        strand(String equivalentStrand){
            this.equivalentStrand = equivalentStrand;
        }
    }
    StringBuilder transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for(int i=0; i<dnaStrand.length(); i++){
            String dna = String.valueOf(dnaStrand.charAt(i));
            rnaStrand.append(strand.valueOf(dna).equivalentStrand);
        }
        return rnaStrand;
    }

    public static void main(String[] args) {
        RnaTranscription rnaTranscription = new RnaTranscription();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the DNA strand that needs to be transcribed ");
        String dnaStrand = scanner.next();
        System.out.println(rnaTranscription.transcribe(dnaStrand));
    }
}
