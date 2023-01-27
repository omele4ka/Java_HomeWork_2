// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


public class HomeWork2 {

    public static void main(String[] args) {

        String str = "Does this string contains Java?";  // Задание 1. Вхождение в строке, содержащей все символы другой строки
        String subStr = "Java";
        System.out.println(str.toLowerCase().contains(subStr.toLowerCase()));

        StringBuilder strA = new StringBuilder("qwerty");  // Задание 2. Проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)
        StringBuilder strB = new StringBuilder("ytrewq");
        System.out.println(strA.toString().equalsIgnoreCase(strB.reverse().toString()));

        int a = 3;       // Задание 4
        int b = 56;
        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(sum);

        StringBuilder dif = new StringBuilder();
        dif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        System.out.println(dif);

        StringBuilder mult = new StringBuilder();
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult);

        StringBuilder division = new StringBuilder();
        float i = (float) a / b;
        division
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(i);
        System.out.println(division);

        int equalsIndexSum = sum.toString().indexOf("=");   // Задание 5.
        sum.deleteCharAt(equalsIndexSum);
        System.out.println(sum.insert(equalsIndexSum, "равно"));

        int equalsIndexDif = dif.toString().indexOf("=");
        dif.deleteCharAt(equalsIndexDif);
        System.out.println(dif.insert(equalsIndexDif, "равно"));

        int equalsIndexMult = mult.toString().indexOf("=");  // Задание 6.
        System.out.println(mult.replace(equalsIndexMult, (equalsIndexMult + 1), "равно"));

        long startEquals = System.currentTimeMillis();     // Задание 7.
        int equalsIndexDiv = division.toString().indexOf("=");
        System.out.println(division.replace(equalsIndexDiv, (equalsIndexDiv + 1), "равно"));
        long endEquals = System.currentTimeMillis();
        System.out.println(endEquals - startEquals);

        long startStr = System.currentTimeMillis();
        String equalsStr = new String();
        for (int j = 0; j < 10001; j++){
            equalsStr += "=";
        }
        long endStr = System.currentTimeMillis();
        System.out.println(endStr - startStr);

        long startBuild = System.currentTimeMillis();
        StringBuilder equals = new StringBuilder();
        for (int j = 0; j < 10001; j++) {
            equals.append("=");
        }
        long endBuild = System.currentTimeMillis();
        System.out.println(endBuild - startBuild);

    }
}