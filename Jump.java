public class Jump extends Instructions {
    public Jump(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[1], 6);
        formatCode = String.format("%sXXXXXX%s%s", i.substring(0, 4), i.substring(4), "1000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
