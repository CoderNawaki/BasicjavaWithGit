package BasicjavaWithGit;

public class portfolio {
    public static void main(String[] args) {

        String details=personDetails("lama", 28, "Tokyo");
        System.out.println("Followings are my details");
        System.out.println(details);

        System.out.println("======");
        WorkingRemote();
    }

    public static String personDetails(String name, int age, String address) {

        String details = name + " " + age + " " + address;

        return details;

    }
    public static void WorkingRemote(){
        System.out.println("this month is remote working day");
        String world ="world";
        System.out.println(world);
    }

}