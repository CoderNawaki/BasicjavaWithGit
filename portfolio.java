package BasicjavaWithGit;

public class portfolio {
    public static void main(String[] args) {

        String details=personDetails("lama", 28, "Tokyo");
        System.out.println("Followings are my details");
        System.out.println(details);
    }

    public static String personDetails(String name, int age, String address) {

        String details = name + " " + age + " " + address;

        return details;

    }

}