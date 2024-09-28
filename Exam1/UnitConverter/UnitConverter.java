public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length != 3) {
            return "ERROR";
        }
        String inputPara = args[0];
        String outputPara = args[1];
        int value;
        try {
            value = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR";
        }

        switch (inputPara) {
            case "celsius":
                return String.format("%.2f", (value * 9.0 / 5.0) + 32);
            case "fahrenheit":
                return String.format("%.2f", (value - 32) * 5.0 / 9.0);
            case "kilometers":
                return String.format("%.2f", (value / 1.609));
            case "miles":
                return String.format("%.2f", (value * 1.609));
            default:
                return "ERROR";
        }
    }
}
