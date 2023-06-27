import java.util.HashMap;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        
       HashMap<Character,Character> map =new HashMap<>();
        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
        for(char letter:dnaStrand.toCharArray()){
            rnaStrand+=map.get(letter);
        }
        return rnaStrand;
    }

}
