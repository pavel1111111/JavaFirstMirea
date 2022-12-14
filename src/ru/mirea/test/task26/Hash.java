package ru.mirea.test.task26;
import java.util.*;

public class Hash
{
    public static void main(String[] args)
    {
        Hashtable<String, String> dict = new Hashtable();
        dict.put("me", "a person. possibly");
        dict.put("you", "the one im talking to");
        dict.put("a dog", "a cute biting animal");
        dict.put("a cat", "the animal all strange people are so obsessed with");
        dict.put("hatsune miku", "a cool virtual songstress");
        dict.put("my works", "the most awful stuff u can possibly find-.-");

        Set<Map.Entry<String,String>> c = dict.entrySet();
        Iterator<Map.Entry<String,String>> iter = c.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> kv = iter.next();
            System.out.println(kv.getKey() + ": " + kv.getValue());
        }
        System.out.println();
        System.out.println("--testing--");
        System.out.println(dict.get("a dog"));
        System.out.println(dict.get("nothing"));

        dict.put("black", "a colour of my boots now");
        System.out.println(dict.get("black"));
        dict.remove("black");
        System.out.println(dict.get("black"));

    }

}