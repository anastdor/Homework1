
public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("Задание 1. Вывод значений переменных на консоль");

        byte coreAmount = 4;
        short memorySlot = 2;
        int memoryVolume = 8;
        long videoMemory = 6L;
        float processor = 2.10f;
        double price = 24000;
        char model = 6;
        boolean liquidFreezing = false;

        System.out.println("CoreAmount " + " " + coreAmount);
        System.out.println("MemorySlot " + " " + memorySlot);
        System.out.println("MemoryVolume " + " " + memoryVolume);
        System.out.println("VideoMemory " + " " + videoMemory);
        System.out.println("Processor " + " " + processor);
        System.out.println("Price " + " " + price);
        System.out.println("Model " + " " + model);
        System.out.println("LiquidFreezing " + " " + liquidFreezing);

        System.out.println("Задание 2. Расчет стоимости товара со скидкой");

        double penPrice = 100;
        double bookPrice = 200;
        double discountPercent = 15;
        double penBookPrice = penPrice + bookPrice;
        double discountValue = penBookPrice * discountPercent / 100;
        double discountPrice = penBookPrice - discountValue;

        System.out.println(penBookPrice);
        System.out.println(discountValue);
        System.out.println(discountPrice);

        System.out.println("Задание 3. Вывод слова JAVA");

        //Я не уверена, что это верная логика, поэтому написала только одну строчку. Если логичка верная, то я дополню остальные строчки.
        System.out.println("J " + " " + "a " + " v " + " " + " " + " v " + " a");

        System.out.println("Задание 4. Вывод min и max значений целых числовых типов");

        byte a = 127;
        short b = 32_767;
        int c = 2_147_483_647;
        long d = 9_223_372_036_854_775_807L;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(d);
        System.out.println(d++);
        System.out.println(d--);
        System.out.println(c++);
        System.out.println(c--);

        //Мне кажется это какая то фигня) Я понимаю, почему невозможно прибавить 1 (так как у нас и так макс значение?), но не понимаю, почему при декрементировании у нас роняет в минимальное значение. То есть я ожидала, что просто вычтиться единица, но получилось иначе)

        System.out.println("Задание 5. Перестановка значений переменных");

        int firstVariable = 2;
        int secondVariable = 5;



    }
}
