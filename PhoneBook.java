import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== دفتر تلفن ===");
            System.out.println("1. افزودن نام");
            System.out.println("2. افزودن شماره");
            System.out.println("3. نمایش تمام اسامی و شمارهها");
            System.out.println("4. خروج");
            System.out.print("لطفاً گزینه مورد نظر را انتخاب کنید: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // مصرف \n باقیمانده از ورودی

            switch (choice) {
                case 1:
                    System.out.print("نام را وارد کنید: ");
                    String name = scanner.nextLine();
                    names.add(name);
                    System.out.println("نام با موفقیت اضافه شد.");
                    break;

                case 2:
                    if (names.isEmpty()) {
                        System.out.println("لطفاً ابتدا یک نام اضافه کنید (گزینه 1).\n");
                    } else {
                        System.out.print("شماره را وارد کنید: ");
                        String number = scanner.nextLine();
                        numbers.add(number);
                        System.out.println("شماره با موفقیت اضافه شد.");
                    }
                    break;

                case 3:
                    System.out.println("\nلیست دفتر تلفن:");
                    if (names.isEmpty() || numbers.isEmpty() || names.size() != numbers.size()) {
                        System.out.println("دفتر تلفن خالی است یا مقادیر ناقص است.");
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println((i + 1) + ". " + names.get(i) + " - " + numbers.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("خروج از برنامه. خدا نگهدار!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("گزینه نامعتبر! لطفاً مجدداً تلاش کنید.");
            }
        }

        scanner.close();
    }
}
