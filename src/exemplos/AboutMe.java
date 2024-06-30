package exemplos;

public class AboutMe {
    public static void main(String[] args) {
        String name = "Alexandre Lorena";
        int age = 49;
        String course = "Software Engineering";
        String languages = "Java, Python, JavaScript, TypeScript";
        String hobbies = "programming, music, movies, series";

        personalInfo(name, age, course, languages, hobbies);
    }

    private static void personalInfo(String name, int age, String course, String languages, String hobbies) {
        System.out.println("Name: " + name + " | Age: " + age);
        System.out.println("Academic education: " + course);
        System.out.println("Languages: " + languages);
        System.out.println("Hobbies: " + hobbies);
    }
}
