//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введіть перше число: ");
//        int num1 = scanner.nextInt();
//
//       System.out.print("Введіть друге число: ");
//       int num2 = scanner.nextInt();
//
//      System.out.print("Введіть третє число: ");
//       int num3 = scanner.nextInt();
//
//
//       int max = Math.max(Math.max(num1, num2), num3);
//        int min = Math.min(Math.min(num1, num2), num3);
//
//        int middle = num1 + num2 + num3 - max - min;
//
//     System.out.println(max + " " + middle + " " + min);

//    scanner.close();
//   }
// }

// import java.util.Scanner;

// public class CompareNames {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введіть перше ім'я: ");
//        String ім'я1 = scanner.nextLine();
//
//       System.out.print("Введіть друге ім'я: ");
//       String ім'я2 = scanner.nextLine();
//
//
//       if (ім'я1.equals(ім'я2)) {
//           System.out.println("Імена ідентичні");
//      }
//       else if (ім'я1.length() == ім'я2.length()) {
//          System.out.println("Довжини імен рівні");
//      }

//       scanner.close();
//   }
// }


import Java.util.Scanner;

//public class TriangleExistence {
//    public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);

//     System.out.print("Введіть довжину сторони a: ");
//     double a = scanner.nextDouble();
//
//    System.out.print("Введіть довжину сторони b: ");
//     double b = scanner.nextDouble();
//
//     System.out.print("Введіть довжину сторони c: ");
//   double c = scanner.nextDouble();
//
//
//    if (a + b > c && a + c > b && b + c > a) {
//       System.out.println("Трикутник існує");
//   } else {
//       System.out.println("Такого трикутника не існує");
// }


// scanner.close();
// }
//  }


//import java.util.Scanner;

//public class Main {
//  public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Введіть три цілих числа:");
//     int num1 = scanner.nextInt();
//     int num2 = scanner.nextInt();
//    int num3 = scanner.nextInt();
//
//   if (num1 == num2 || num1 == num3) {
//     System.out.print(num1 + " ");
// }
//
//   if (num2 == num3) {
//       System.out.print(num2 + " ");
//   }





// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//
//   System.out.println("Введіть три числа:");
//  double num1 = scanner.nextDouble();
//   double num2 = scanner.nextDouble();
//   double num3 = scanner.nextDouble();
//
//  double middleNumber;
//
//    if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
//      middleNumber = num1;
//   } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
//       middleNumber = num2;
//    } else {
//      middleNumber = num3;
//  }
//
//   System.out.println("Середнє число: " + middleNumber);
//
//  scanner.close();
// }
// }
//
//      if (num1 != num2 && num1 != num3 && num2 != num3) {
//         System.out.println("Немає пар рівних чисел.");
//  }
//
//  scanner.close();
//   }



// import java.util.Scanner;

// public class Main {
//  public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//
//      System.out.print("Введіть ім'я: ");
//       String name = scanner.nextLine();
//
//     System.out.print("Введіть рік народження (у форматі yyyy): ");
//       int year = scanner.nextInt();
//
//       System.out.print("Введіть місяць народження (у форматі mm): ");
//      int month = scanner.nextInt();
//
//      System.out.print("Введіть день народження (у форматі dd): ");
//     int day = scanner.nextInt();
//
//     System.out.println("Мене звати " + name + ". Я народився " + day + "." + month + "." + year + ".");

//   scanner.close();
//   }
// }



