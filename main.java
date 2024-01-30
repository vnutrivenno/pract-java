import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShashlikRecipe {

    public static void main(String[] args) {
        // Ввод граммовок
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество грамм мяса: ");
        double meat = scanner.nextDouble();

        System.out.print("Введите количество грамм лука: ");
        double onion = scanner.nextDouble();

        System.out.print("Введите количество грамм помидоров: ");
        double tomato = scanner.nextDouble();

        System.out.print("Введите количество грамм масла: ");
        double oil = scanner.nextDouble();

        System.out.print("Введите количество грамм специй: ");
        double spices = scanner.nextDouble();

        // Написание полного способа приготовления
        String recipe = 
            "Рецепт приготовления шашлыка:\n\n" +
            "Ингредиенты:\n" +
            "- Мясо: %.2f г\n" +
            "- Лук: %.2f г\n" +
            "- Помидоры: %.2f г\n" +
            "- Масло: %.2f г\n" +
            "- Специи: %.2f г\n\n" +
            "Шаги приготовления:\n" +
            "1. Нарежьте мясо, лук и помидоры на кусочки.\n" +
            "2. Приготовьте маринад, смешав масло и специи.\n" +
            "3. Замаринуйте мясо, лук и помидоры в подготовленном маринаде.\n" +
            "4. Нанизывайте мясо, лук и помидоры на шпажки.\n" +
            "5. Обжаривайте шашлык на гриле или мангале до готовности.\n\n" +
            "Приятного аппетита!\n";

        // Запись в txt файл
        try (FileWriter writer = new FileWriter("рецепт_шашлыка.txt")) {
            writer.write(String.format(recipe, meat, onion, tomato, oil, spices));
            System.out.println("Рецепт успешно записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
