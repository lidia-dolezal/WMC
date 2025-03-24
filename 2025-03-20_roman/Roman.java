
public class Roman {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String convertIntoRoman() {
        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] inRoman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder numberInRoman = new StringBuilder();
        int tempNumber = this.number;
        for (int i = 0; i < numbers.length; i++) {
            while (tempNumber >= numbers[i]) {
                tempNumber -= numbers[i];
                numberInRoman.append(inRoman[i]);
            }
        }
        return numberInRoman.toString();
    }

    public static void main(String[] args) {
        Roman converter = new Roman();
        converter.setNumber(173); // gewünschte Zahl hier eingeben
        if (converter.number < 1 || converter.number > 3999) {
            System.out.println("Number has to be between 1 and 3999!");
        } else {
            System.out.println("Roman Number: " + converter.convertIntoRoman());
        }
    }
}