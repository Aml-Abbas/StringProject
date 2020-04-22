import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MAIN {
    public static void main(String[] args){

        String [] words={"Aml","Lubna","Hasan","Nidal", "Ihsan"};

        if (words[0].equalsIgnoreCase(words[1])){

        }
        //ignorerar inte uppercase
        if (words[0].startsWith("Am")){
            System.out.println("yes strat with it");
        }
        if (words[0].endsWith("ml")){
            System.out.println("yes ends with it");
        }
        //a negativ if the letter isnt in the word
        //we can have more than a letter
        //gives the begining of the first letter
        System.out.println(words[2].indexOf("s"));
        //start search from the third letter
        //System.out.println(words[2].indexOf("s",3),);
        String s= "Aml";
        String b=" Abbas";
        String d="   Ab      bas   ";

        System.out.println(s.concat(b));
        //ignorerar inte uppercase
        System.out.println(s.replace("Aml","Lubna"));
        System.out.println(s);

        //only empty spacese at the sides of the word
        System.out.println(d.trim());
        System.out.println(d);

        //change list to array to be easy to add and change to the list
        LinkedList<String> list= new LinkedList<>(Arrays.asList(words));
        //or
        LinkedList<String> list2= new LinkedList<>(Arrays.asList(words));
        //take a list and sort it
        Collections.sort(list2);
        //sort in the oppit side
        Collections.sort(list,Collections.reverseOrder());

        //convert back to array after adding things
        words= list.toArray(new String[list.size()]);

        Character[] characters={'a','b','c','d','r'};
        List<Character> list3= Arrays.asList(characters);

        //revers the list
        Collections.reverse(list3);

        //copy the second list to the first one of the same param
        Collections.copy(list,list2);

        //fill Collection with crap
        Collections.fill(list3,'X');
        for (Character c:list3){
            System.out.println(c+" ");
        }
       // Collections.addAll(list,list2);

        //return the time to find the srting
        System.out.println(Collections.frequency(list2,"Nidal"));

        //true if they have no items in common
        boolean todf= Collections.disjoint(list,list2);

        
    }

}
