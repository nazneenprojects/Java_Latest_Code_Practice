public class StringRemoveVowels {

public static void main(String[] args) {
    String st = "Welcome To Germany, Nazneen";
   
    
    for (int i = 0; i < st.length(); i++) {
        char ch = st.charAt(i);

        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            continue;
        }
        System.out.println(ch);
    }

}

}