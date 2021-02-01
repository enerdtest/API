package OOPs.Algo;

import OOPs.Abstract.PermutationAbstract;

public class Permutations extends PermutationAbstract {
    @Override
    public String swapString(String arr, int i, int j) {
        char[] chars = arr.toCharArray();
        char temp;
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    @Override
    public void generatePermutation(String arr, int left, int right) {
        if (left == right)
            System.out.println(arr);
        else {
            for (int i = left; i <= right; i++) {
                    arr = swapString(arr, left, i);
                    generatePermutation(arr, left + 1, right);
                    arr = swapString(arr, right, i);
            }
        }
    }
}
