public class Call extends Instructions {
    public Call(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[1], 6);
        formatCode = String.format("%sXXXXXX%s%s", i.substring(0, 4), i.substring(4), "1001");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
