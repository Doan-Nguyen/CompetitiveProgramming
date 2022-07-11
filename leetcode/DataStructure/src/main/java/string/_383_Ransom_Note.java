package string;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] charRansomNote = ransomNote.toCharArray();
        char[] charMagazine = magazine.toCharArray();
        //
        int[] arrId = new int[123];
        //
        for (int i = 0; i < charRansomNote.length; i++){
            arrId[(int) charRansomNote[i]]++;
        }
        //
        for (int j = 0; j < charMagazine.length; j++){
            arrId[(int) charMagazine[j]]--;
        }
        //
        for (int id: arrId){
            if (id > 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote,magazine);
        System.out.println(result);
    }
}
