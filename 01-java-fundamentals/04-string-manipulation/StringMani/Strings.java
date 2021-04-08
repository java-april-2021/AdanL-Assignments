public class Strings{
    public String trimAndConcat(String word1,String word2){
        return word1.trim().concat(word2.trim());
    }
    public Integer IndexOrNull(String word, char o){
        
        if(word.indexOf(o)==-1){
            return null;
        }
        return word.indexOf(o);
    }
    public Integer IndexOrNull(String input, String substring){
        if(input.indexOf(substring)==-1){
            return null;
        }
        return input.indexOf(substring);
    }
    public String concatSubstring(String input, int idxA, int idxB, String replacement) {
        String substr;
        try{
            substr = input.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "whoops!";
        }

        return substr.concat(replacement);
    }
}