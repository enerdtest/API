package OOPs.Interface;

public interface AllCharsSame {
    boolean allChars(String str);
    default void defaultMessage(){
        System.out.println("Default Method from Interface!");
    }
}
