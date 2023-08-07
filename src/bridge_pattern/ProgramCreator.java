package bridge_pattern;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = new Program[]{
                new BankProgram(new JavaCoder()),
                new StockProgram(new PyCoder())
        };
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
