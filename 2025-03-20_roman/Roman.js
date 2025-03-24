class Roman {
    constructor() {
        this.number = 0;
    }

    setNumber(number) {
        this.number = number;
    }

    convertIntoRoman() {
        const numbers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
        const inRoman = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"];

        let numberInRoman = "";
        let tempNumber = this.number;

        for (let i = 0; i < numbers.length; i++) {
            while (tempNumber >= numbers[i]) {
                tempNumber -= numbers[i];
                numberInRoman += inRoman[i];
            }
        }
        return numberInRoman;
    }
}

// Testen des Codes
const converter = new Roman();
converter.setNumber(173); // gewünschte Zahl hier eingeben

if (converter.number < 1 || converter.number > 3999) {
    console.log("Number has to be between 1 and 3999!");
} else {
    console.log("Roman Number: " + converter.convertIntoRoman());
}
