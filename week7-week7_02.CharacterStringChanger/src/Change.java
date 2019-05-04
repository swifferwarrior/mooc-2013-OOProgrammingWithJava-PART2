
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString){
        String newCharacterString = "";
        
        for(int i = 0; i < characterString.length(); i++){
            char letter = characterString.charAt(i);
            
            if(letter == this.fromCharacter){
                newCharacterString += this.toCharacter;
            } else {
                newCharacterString += letter;
            }
        }
        
        return newCharacterString;
        //returns the changed version of the given character string.
    }
}
