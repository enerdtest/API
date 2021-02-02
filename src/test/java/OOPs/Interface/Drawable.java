package OOPs.Interface;

public interface Drawable {
    void draw();
    default void message(){
        System.out.println("Default message from Interface");
    }
}
