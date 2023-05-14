package kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

}

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        List<Integer> diffList = sortArray();
        this.maximumDifference = diffList.get(diffList.size() - 1) - diffList.get(0);
    }

    //sort array in ascending order
    public List<Integer> sortArray(){
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            sortedList.add(elements[i]);
        }
        sortedList.sort(null);
        return sortedList;
    }

}