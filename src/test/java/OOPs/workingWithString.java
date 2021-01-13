package OOPs;

public class workingWithString {
    public void stringWithRegex(String str){
        StringBuffer alpha = new StringBuffer(),
                number = new StringBuffer(),
                special = new StringBuffer();
        for (int i = 0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)))
                number.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        System.out.println("Alphabet after splitting " + alpha);
        System.out.println("Number after splitting " + number);
        System.out.println("Special char after splitting " + special);
    }

}
