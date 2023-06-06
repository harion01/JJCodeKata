package kata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20 {
    public void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int swapCount = this.doBubbleSort(a);
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));



        bufferedReader.close();
    }

    public int doBubbleSort(List<Integer> a){
        int swapCount = 0;
        for(int i = 0 ; i < a.size() ; i++){
            for(int j = 0 ; j < a.size() - 1 ; j++){
                if(a.get(j) > a.get(j + 1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swapCount++;
                }
            }
        }
        return swapCount;
    }


}
