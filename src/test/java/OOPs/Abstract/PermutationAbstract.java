package OOPs.Abstract;
import OOPs.Interface.Permutation;

public abstract class PermutationAbstract implements Permutation {
    public abstract String swapString(String arr, int i, int j);
    public abstract void generatePermutation(String arr, int start, int end);
}
