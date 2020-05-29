package sergey.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    private static String[] masWords = new String[0];
    private static int[] masCount = new int[0];

    public static void main(String[] args) {
        String text = "Привет меня зовут Сергей, мой адрес электронной почты " +
                "naumenkosergeyns@gmail.com! Но у меня есть еще один ящик - naymchik@yandex.ru" +
                "также вам могли сказать что есть еще один ящик naymchik@tut.by, но это не мой, а моего брата" +
                "Привет меня зовут Сергей, мой адрес электронной почты " +
                "naumenkosergeyns@gmail.com! Но у меня есть еще один ящик - naymchik@yandex.ru" +
                "также вам могли сказать что есть еще один ящик naymchik@tut.by, но это не мой, а моего брата" +
                "Привет меня зовут Сергей, мой адрес электронной почты " +
                "naumenkosergeyns@gmail.com! Но у меня есть еще один ящик - naymchik@yandex.ru" +
                "также вам могли сказать что есть еще один ящик naymchik@tut.by, но это не мой, а моего брата" +
                "Привет меня зовут Сергей, мой адрес электронной почты " +
                "naumenkosergeyns@gmail.com! Но у меня есть еще один ящик - naymchik@yandex.ru" +
                "также вам могли сказать что есть еще один ящик naymchik@tut.by, но это не мой, а моего брата" +
                "Привет меня зовут Сергей, мой адрес электронной почты " +
                "naumenkosergeyns@gmail.com! Но у меня есть еще один ящик - naymchik@yandex.ru" +
                "также вам могли сказать что есть еще один ящик naymchik@tut.by, но это не мой, а моего брата";


//        Pattern email = Pattern.compile("(\\w{4,})@(yandex|gmail)\\.(ru|com|by)");
//
//        couterPattern(email, text);
        Pattern pattern = Pattern.compile("[А-Яа-яЁё]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            serch(word);
        }
        for (int i = 0; i < masWords.length; i++) {
            System.out.println(masWords[i]+"="+masCount[i]);
        }
    }



    static void serch(String word){
        for (int i = 0; i < masWords.length; i++) {
            if(word.equals(masWords[i])){
                masCount[i]++;
                return;
            }
        }
        String[] words=new String[masWords.length+1];
        int[] count = new int[masCount.length+1];
        System.arraycopy(masWords,0,words,0,masWords.length);
        System.arraycopy(masCount,0,count,0,masCount.length);
        masWords=words;
        masWords[masWords.length-1]=word;
        masCount=count;
        masCount[masCount.length-1]=1;
    }

    public static void couterPattern(Pattern pattern, String text) {
        Matcher matcher = pattern.matcher(text);

        int counterYndex = 0;
        int counterGmail = 0;
        while (matcher.find()) {
            if (matcher.group(2).equals("gmail"))
                counterGmail++;
            else if (matcher.group(2).equals("yandex")) {
                counterYndex++;

            }
            System.out.println(text.indexOf(matcher.group()));

        }
        System.out.println("Email gmail: " + counterGmail);
        System.out.println("Email yandex: " + counterYndex);
    }
}
