package ödev1;
import java.util.Arrays;

public class sequenceoperations {



public static int[] straightenAndSequalize(int[][] jaggedArray) {

    return Arrays.stream(jaggedArray)
                 .flatMapToInt(Arrays::stream)
                 .sorted()
                 .toArray();
}


public static int[] Collectsequences(int[] sequence1, int[] sequence2) {
    int[] sumSequence = new int[Math.min(sequence1.length, sequence2.length)];
    for (int i = 0; i < sumSequence.length; i++) {
        sumSequence[i] = sequence1[i] + sequence2[i];
    }
    return sumSequence;
}


public static int[] multiplysequences(int[] sequence1, int[] sequence2) {
    int[] multiplysequence = new int[Math.min(sequence1.length, sequence2.length)];
    for (int i = 0; i < multiplysequence.length; i++) {
    	multiplysequence[i] = sequence1[i] * sequence2[i];
    }
    return multiplysequence;
}

public static void main(String[] args) {

    int[][] sequence1 = { {3, 5, 1}, {4, 6} };
    int[][] sequence2 = { {2, 8}, {7, 3, 9} };

    int[] SequentialSequence1 = straightenAndSequalize(sequence1);
    int[] SequentialSequence2 = straightenAndSequalize(sequence2);

    
    int[] sumSequence = Collectsequences(SequentialSequence1, SequentialSequence2);
    int[] multiplysequence = multiplysequences (SequentialSequence1, SequentialSequence2);

    
    System.out.println("Sequential Sequence 1: " + Arrays.toString(SequentialSequence1));
    System.out.println("Sequential Sequence 2: " + Arrays.toString(SequentialSequence2));
    System.out.println("Sum Sequence: " + Arrays.toString(sumSequence));
    System.out.println("Multiply Sequence: " + Arrays.toString(multiplysequence));
}
}