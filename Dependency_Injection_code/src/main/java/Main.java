import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, choose the example to run");
        System.out.println("1. Naive Implementation of Dependencies");
        System.out.println("2. Constructor Dependency Injection");
        System.out.println("3. Setter Dependency Injection");
        System.out.println("4. Interface Dependency Injection");
        System.out.println("5. Dependency Injection using Spring Framework with XML Configuration File");
        System.out.println("6. Dependency Injection using Spring Annotation");

        int option = sc.nextInt();
        switch (option){
            case 1:
                naiveImplementation.Main.main(new String[]{});
                break;

            case 2:
                constructorDependencyInjection.Main.main(new String[]{});
                break;

            case 3:
                setterDependencyInjection.Main.main(new String[]{});
                break;

            case 4:
                InterfaceDependencyInjection.Main.main(new String[]{});
                break;

            case 5:
                springXml.Main.main(new String[]{});
                break;

            case 6:
                springAnnotations.Main.main(new String[]{});
                break;

            default:
                System.out.println("Wrong Option");
                break;
        }
    }
}
