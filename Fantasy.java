package midterm.luka_shamatava_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // Change studentName to your name
    private String studentName;

    // Constructor
    public Fantasy(String Lukashamatava) {
        this.studentName = Lukashamatava;
    }

    // Implementing toString method
    @Override
    public String toString() {
        return "Fantasy written by: " + studentName;
    }

    // Implementing abstract methods from AbstractFantasy
    @Override
    public String getKnife1() {
        return "Excalibur"; // Return a meaningful value
    }

    @Override
    public String getThread2() {
        return "Golden thread"; // Return a meaningful value
    }

    // Implementing methods from Dream interface
    @Override
    public String methodHat3(String argInheritance5) {
        return "Dream hat: " + argInheritance5; // Return a meaningful value
    }

    @Override
    public List<String> methodWing4(String argLanguage6) {
        // Create a list and add some meaningful elements
        List<String> wings = List.of("Feathered wings", "Dragon wings");
        return wings;
    }

    // Integrated main method
    public static void main(String[] args) {
        // Create an instance of Fantasy with your name
        Fantasy fantasy = new Fantasy("Luka Shamatava");

        // Call toString method
        System.out.println(fantasy);

        // Call abstract methods from AbstractFantasy
        System.out.println("Knife: " + fantasy.getKnife1());
        System.out.println("Thread: " + fantasy.getThread2());

        // Call methods from Dream interface
        System.out.println(fantasy.methodHat3("Top hat"));
        List<String> wings = fantasy.methodWing4("Java");
        System.out.println("Wings:");
        for (String wing : wings) {
            System.out.println("- " + wing);
        }
    }
}
