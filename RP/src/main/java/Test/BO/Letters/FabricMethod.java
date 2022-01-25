package Test.BO.Letters;

public class FabricMethod {
    public static Letter createFirstLetter () {
        Letter letter = LetterOne.getLetter();
        return letter;
    }
    public static Letter createSecondLetter () {
        Letter letter = LetterTwo.getLetter();
        return letter;
    }
}
