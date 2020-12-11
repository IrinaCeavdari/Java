import java.util.*;
public class Task14_5 {
    private static String[] article ={"the","a","one","some","any"};
    private static String[] noun={" boy"," girl"," dog"," town"," car"};
    private static String[] verb={" drove"," jmped"," ran"," walked","    skipped"};
    private static String[] preposition={" to"," from"," over"," under"," on"};


    public static void main(String args[]){


        System.out.println("the sentences picked at random are:");

        for(int i=0;i<=19;i++){
            System.out.println(makeSentence());
        }
    }

    public static String makeSentence(){
        Random rand = new Random();
        int[] index = new int[6];
        String sent = new String();

        for(int i=0;i<6;i++){
            index[i]= rand.nextInt(5);
        }
        sent = sent.concat(article[index[0]].concat(noun[index[1]].concat(verb[index[2]].concat(preposition[index[3]].concat(article[index[4]].concat(noun[index[5]]))))));
        return sent;
    }
}

