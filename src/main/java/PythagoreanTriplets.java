import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTriplets {

    private final int base;
    private final int height;
    private final int hypotenuse;

    public PythagoreanTriplets(int base, int height, int hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public List<PythagoreanTriplets> tripletBuilder(int sum) {
        if(sum % 2 != 0) return Collections.emptyList();
        ArrayList<PythagoreanTriplets> pythagoreanTriplets = new ArrayList<>();
        for(int i = 1; i <= sum/3; i++)
            for(int j = i+1; j <= sum/2; j++) {
                int k = sum - i - j;
                if (k*k == (i*i + j*j))
                    pythagoreanTriplets.add(new PythagoreanTriplets(i, j, k));
            }
        return pythagoreanTriplets;
    }

    public static void main(String[] args) {
        PythagoreanTriplets pythagoreanTriplets = new PythagoreanTriplets(0,0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sum ");
        int sum =  scanner.nextInt();
        List<PythagoreanTriplets> tripletList = pythagoreanTriplets.tripletBuilder(sum);
        for (PythagoreanTriplets triplet : tripletList) {
            System.out.print(triplet.base + " ");
            System.out.print(triplet.height + " ");
            System.out.print(triplet.hypotenuse + " ");
        }
    }
}
