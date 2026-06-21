package MakerPlanQuestions;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 22;
        String rank = "Freshy";
        double salary = 80000.0;
        float MembFee = 1499.0f;

        double bonus = salary * 0.12;
        int annualBonus = (int)bonus;

        System.out.println("===============================");
        System.out.println("Welcome to Coding Guild");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fee: " + MembFee);
        System.out.println("Annual Bonus: " + annualBonus);
        System.out.println("Thank You!!!!!");
        System.out.println("===============================");
    }
}
