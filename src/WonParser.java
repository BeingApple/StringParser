public class WonParser {
    private char[] charArray;
    private StringBuffer returnBalance;
    private Long inputBalance;

    public WonParser(Long inputBalance){
        this.inputBalance = inputBalance;
    }

    public void parseBalanceToString(){
        returnBalance = new StringBuffer();
        charArray = inputBalance.toString().toCharArray();

        returnBalance.append("￦");
        for(int i = 0 ; i < charArray.length ; i++){
            int index = charArray.length - i;
            if((index % 3) == 0 && index != charArray.length){
                returnBalance.append(",");
            }
            returnBalance.append(charArray[i]);
        }
    }

    public StringBuffer getReturnBalance() {
        return returnBalance;
    }
}
