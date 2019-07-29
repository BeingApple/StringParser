public class Main {

    public static void main(String[] args) {
        WonParser parser = new WonParser(3244343241L);
        parser.parseBalanceToString();
        System.out.println(parser.getReturnBalance());
    }
}
