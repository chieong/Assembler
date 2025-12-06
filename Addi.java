public class Addi extends Instructions {
    public Addi(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[3], 6);
        formatCode = String.format("%s%s%s%s%s", i.substring(0, 4), fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), i.substring(4), "0100");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
