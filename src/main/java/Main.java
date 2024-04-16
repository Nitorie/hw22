public class Main {
    public static void main(String[] args) {
        System.out.println("-------------");

        System.out.println(task1(1));
        System.out.println(task1(0));
        System.out.println(task1(-3));

        System.out.println("-------------");

        System.out.println(task2(1));
        System.out.println(task2(0));
        System.out.println(task2(-3));

        System.out.println("-------------");

        System.out.println(task3(1));
        System.out.println(task3(0));
        System.out.println(task3(-3));

        System.out.println("-------------");

        System.out.println(task4(1));
        System.out.println(task4(0));
        System.out.println(task4(-3));

        System.out.println("-------------");

        System.out.println(task5(1));
        System.out.println(task5(0));
        System.out.println(task5(-3));

        System.out.println("-------------");

        System.out.println(task6(1));
        System.out.println(task6(0));
        System.out.println(task6(-3));

        System.out.println("-------------");

        System.out.println(task7(12, 3));

        System.out.println("-------------");

        System.out.println(task8(1, 1));
        System.out.println(task8(3, 5));

        System.out.println("-------------");

        System.out.println(task9(true));
        System.out.println(task9(false));

        System.out.println("-------------");

        System.out.println(task10(true));
        System.out.println(task10(false));

        System.out.println("-------------");

        System.out.println(task11(5));
        System.out.println(task11(-3));

        System.out.println("-------------");

        System.out.println(task12(5));
        System.out.println(task12(0));
        System.out.println(task12(-3));
        System.out.println(task12(2));

        System.out.println("-------------");

        System.out.println(task13(1, 3));
        System.out.println(task13(0, 6));
        System.out.println(task13(3, 5));

        System.out.println("-------------");

        System.out.println(task14(12, 23));
        System.out.println(task14(2, 11));
        System.out.println(task14(8, 4));

        System.out.println("-------------");

        System.out.println(task15(2));

        System.out.println("-------------");

        System.out.println(task16(23));

        System.out.println("-------------");

        System.out.println(task17(8));

        System.out.println("-------------");

        System.out.println(task18("abcde"));

        System.out.println("-------------");

        System.out.println(task19("12345"));

        System.out.println("-------------");

        System.out.println(task20("892"));

        System.out.println("-------------");

        System.out.println(task21("123330"));
    }

    static String task1(int a1) {
        if (a1 == 0) {
            return "Right";
        } else {
            return "Nope";
        }
    }

    static String task2(int a2) {
        if (a2 > 0) {
            return "Right";
        } else {
            return "Nope";
        }
    }

    static String task3(int a3) {
        if (a3 < 0) {
            return "Right";
        } else {
            return "Nope";
        }
    }

    static String task4(int a4) {
        if (a4 >= 0) {
            return "Right";
        } else {
            return "Nope";
        }
    }

    static String task5(int a5) {
        if (a5 <= 0) {
            return "Right!";
        } else {
            return "Nope!";
        }
    }

    static String task6(int a6) {
        if (a6 != 0) {
            return"Right!";
        } else {
            return "Nope!";
        }
    }

    static String task7(int a7, int test) {
        if (a7 == test) {
            return "Right!";
        } else {
            return "Nope!";
        }
    }

    static String task8(int a8, int test) {
        if (a8 == test) {
            return "Right!";
        } else {
            return "Nope!";
        }
    }

    static String task9(boolean test) {
        return (test ? "True" : "False");
    }

    static String task10(boolean test) {
        return (test ? "False" : "True");
    }

    static String task11(int a) {
        if (a > 0 && a < 5) {
            return "Right!";
        } else {
            return "Nope!";
        }
    }

    static int task12(int a) {
        if (a == 0 || a == 2) {
            return a + 7;
        } else {
            return a / 10;
        }
    }

    static int task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            return a + b;
        } else {
            return a - b;
        }
    }

    static String task14(int a, int b) {
        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            return "Right!";
        } else {
            return "Nope!";
        }
    }

    static String task15(int num) {
        String result = "";

        switch (num) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Лето";
                break;
            case 4:
                result = "Осень";
                break;
        }

        return result;
    }

    static String task16(int day) {
        if (day >= 1 && day <= 10) {
            return ("Перша декада");
        } else if (day > 10 && day <= 20) {
            return ("Друга декада");
        } else if (day > 20 && day <= 30) {
            return ("Третя декада");
        } else {
            return ("Четверта декада");
        }
    }

    static String task17(int month) {
        if (month >= 1 && month <= 3) {
            return ("Зима");
        } else if (month > 3 && month <= 6) {
            return ("Лето");
        } else if (month > 6 && month <= 9) {
            return ("Весна");
        } else if (month > 9 && month <= 12) {
           return ("Осень");
        }
        return "Неправильний місяц";
    }
    static String task18(String title) {
        if (title.charAt(2) == 'a'){
            return ("Yes");
        } else {
            return ("No");
        }
    }
    static String task19(String number) {
        char firstChar = number.charAt(0);
        if (firstChar == '1' || firstChar == '2' || firstChar == '3') {
            return ("Yes");
        } else {
            return ("Nope");
        }
    }
    static int task20(String number) {
       int firstNumber = number.charAt(0) - '0';
        int secondNumber = number.charAt(1) - '0';
        int thirdNumber = number.charAt(2) - '0';
        int sum = firstNumber + secondNumber + thirdNumber;
        return (sum);
    }
    static String task21(String number) {
        int sum1 = number.charAt(0) - '0' + number.charAt(1) - '0' + number.charAt(2) - '0';
        int sum2 = number.charAt(3) - '0' + number.charAt(4) - '0' + number.charAt(5) - '0';

        if (sum1 == sum2) {
            return ("Yes");
        } else {
            return ("Nope");
        }
    }
}