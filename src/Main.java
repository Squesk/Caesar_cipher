public class Main {

    public static void main(String[] args) {

        int key = 7;   // You can also input for example key = -4 and it will work as backward Caesar cipher
        String word = "SauSaGe";

        Caesar_cipher(key,word);

    }

    public static void Caesar_cipher(int key, String word)
    {
        int size = word.length();

        word = word.toUpperCase();

        StringBuilder New_Word = new StringBuilder();

        for(int i=0; i<size; i++)
        {
            int letter_as_number = word.charAt(i) + key;


            if(letter_as_number > 90)
            {
                int difference = 90 - word.charAt(i);
                int new_key = key - difference;

                New_Word.append((char) (64+new_key));

            }
            else if(letter_as_number < 65)
            {
                int difference = word.charAt(i) - 65;
                int new_key = key + difference;

                New_Word.append((char) (91+new_key));
            }
            else
            {
                New_Word.append((char) letter_as_number);
            }







        }

        System.out.println(New_Word.toString().toString());

    }

}