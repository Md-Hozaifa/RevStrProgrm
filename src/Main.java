public class Main {
    public static void main(String[] args) {



        String str="String";

        int i=0, li=str.length()-1;
        String rev="";

        while (li>=0){
            rev+=str.charAt(li);
            li--;

        }

        System.out.println("Original String :"+str);
        System.out.println("Your Reversed String is :"+rev);


    }
}