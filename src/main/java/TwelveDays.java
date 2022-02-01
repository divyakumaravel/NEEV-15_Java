import java.util.Scanner;

class TwelveDays {
    private final String[] days = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    private final String[] stuff = {"a Partridge in a Pear Tree","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
    private StringBuilder finalString = new StringBuilder();
    StringBuilder verse(int verseNumber) {

        finalString = new StringBuilder("On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ");
        StringBuilder s = new StringBuilder();
        if(verseNumber == 1){
            s = new StringBuilder(stuff[verseNumber - 1] + ".");
        }else{
            for(int i=verseNumber-1; i>=0; i--) {
                if(i-1 == -1 ) {
                    s.append("and ").append(stuff[i]).append(".");
                }else {
                    s.append(stuff[i]).append(", ");
                }
            }
        }
        finalString.append(s).append('\n');
        return finalString;
    }

    StringBuilder verse(int startVerse, int endVerse) {

        finalString= new StringBuilder();

        for(int verseNumber = startVerse; verseNumber<=endVerse; verseNumber++) {
            String verse = "On the "+days[verseNumber-1]+" day of Christmas my true love gave to me: ";
            StringBuilder s = new StringBuilder();
            if(verseNumber == 1){
                s = new StringBuilder(stuff[verseNumber - 1] + ".\n\n");
            }else{
                if(verseNumber!=endVerse){
                    for(int i=verseNumber-1; i>=0; i--) {
                        if(i-1 == -1 ) {
                            s.append("and ").append(stuff[i]).append(".\n\n");
                        }else {
                            s.append(stuff[i]).append(", ");
                        }
                    }
                }else{
                    for(int i=verseNumber-1; i>=0; i--) {
                        if(i-1 == -1 ) {
                            s.append("and ").append(stuff[i]).append(".\n");
                        }else {
                            s.append(stuff[i]).append(", ");
                        }
                    }
                }
            }
            verse+=s;
            finalString.append(verse);
        }

        return finalString;
    }

    StringBuilder verse() {

        finalString= new StringBuilder();

        for(int verseNumber = 1; verseNumber<=12; verseNumber++) {
            String verse = "On the "+days[verseNumber-1]+" day of Christmas my true love gave to me: ";
            StringBuilder s = new StringBuilder();
            if(verseNumber == 1){
                s = new StringBuilder(stuff[verseNumber - 1] + ".\n\n");
            }else{
                if(verseNumber!=12){
                    for(int i=verseNumber-1; i>=0; i--) {
                        if(i-1 == -1 ) {
                            s.append("and ").append(stuff[i]).append(".\n\n");
                        }else {
                            s.append(stuff[i]).append(", ");
                        }
                    }
                }else{
                    for(int i=verseNumber-1; i>=0; i--) {
                        if(i-1 == -1 ) {
                            s.append("and ").append(stuff[i]).append(".\n");
                        }else {
                            s.append(stuff[i]).append(", ");
                        }
                    }
                }
            }
            verse+=s;
            finalString.append(verse);
        }
        return finalString;
    }

    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();
        StringBuilder song;
        Scanner scanner = new Scanner(System.in);

        //Single verse
        System.out.print("Enter a verse number ");
        final int verseNumber = scanner.nextInt();
        song = twelveDays.verse(verseNumber);
        System.out.println("Verse number " + verseNumber + ":");
        System.out.println(song);

        //From initial verse to final verse
        System.out.print("Enter initial verse number ");
        final int initialVerse = scanner.nextInt();
        System.out.print("Enter final verse number ");
        final int finalVerse = scanner.nextInt();
        song = twelveDays.verse(initialVerse,finalVerse);
        System.out.println("Verses from " + initialVerse + " to " + finalVerse + ":");
        System.out.println(song);

        // The song
        song = twelveDays.verse();
        System.out.println("The Song :");
        System.out.println(song);

    }
}

