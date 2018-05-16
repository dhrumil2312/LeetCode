public class ComplexMultiplication {

    public static void main(String[] args) {
        String a = "78+-76i";
        String b = "-86+72i";

        String[] aArray = a.split("\\+");
        String[] bArray = b.split("\\+");

        aArray[1] = aArray[1].replaceAll("i","");
        bArray[1] = bArray[1].replaceAll("i","");

        int real_part = (Integer.parseInt(aArray[0]) * Integer.parseInt(bArray[0])) - (Integer.parseInt(aArray[1]) * Integer.parseInt(bArray[1]));
        int imaginary_part = (Integer.parseInt(aArray[0]) * Integer.parseInt(bArray[1])) + (Integer.parseInt(aArray[1]) * Integer.parseInt(bArray[0]));

        System.out.println(real_part);
        System.out.println(real_part+"+" +imaginary_part+"i");

    }
}

