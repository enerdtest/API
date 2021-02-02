package OOPs.Abstract;

import OOPs.Interface.AllCharsSame;

public abstract class CheckAllCharsSame implements AllCharsSame {
    public boolean allChars(String str) {
      return false;
    }

    @Override
    public void defaultMessage() {
        System.out.println("Override default message from Interface! ");
    }
}
