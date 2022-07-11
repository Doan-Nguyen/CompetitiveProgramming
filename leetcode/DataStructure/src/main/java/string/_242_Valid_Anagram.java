package string;

public class _242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] charRansomNote = s.toCharArray();
        char[] charMagazine = t.toCharArray();
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
            if (id != 0){
                return false;
            }
        }
        return true;
    }
}
