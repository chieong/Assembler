public class Li extends Instructions {
    public Li(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[2], 6);
        formatCode = String.format("%sXXX%s%s%s", i.substring(0, 4), fitWidth(asmParts[1], 3), i.substring(4), "1111");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
