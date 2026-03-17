package Tutorial_1.Question_1;

public class TelephoneTester {
    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("03", "79676300");
        Telephone telephone2 = new Telephone("03", "79676301");
        Telephone telephone3 = new Telephone("03", "79676302");
        Telephone telephone4 = new Telephone("03", "79676303");
        Telephone telephone5 = new Telephone("03", "79676304");

        Telephone[] telephones = { telephone1, telephone2, telephone3, telephone4, telephone5 };
        for (int i = 0; i < 5; i++) {
            System.out.println(telephones[i].makeFullNumber());
        }
    }
}
