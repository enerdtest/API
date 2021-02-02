package OOPs;

import OOPs.Interface.Drawable;

public class ModifyInterfaceDefaultMethod implements Drawable {
    @Override
    public void draw() {
        System.out.println("draw something! ");
    }
}
