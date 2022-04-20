package novi.basics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// ArrayList

        ArrayList<String> textList = new ArrayList<>();

        textList.add("This ");
        textList.add("is ");
        textList.add("an ");
        textList.add("ArrayList!");
        textList.add("Testing");

        textList.remove(4);

        System.out.println(textList);

    }
}
