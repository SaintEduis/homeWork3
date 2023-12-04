public class Main {
    public static void main(String[] args) {
        //First exercise
        byte firstNumber = 1;
        short secondNumber = 128;
        int thirdNumber = 32768;
        long fourthNumber = 2147483648L;
        float fifthNumber = 0.1234567f;
        double sixthNumber = 0.123456789101112d;

        System.out.println("Значение переменной с типом byte равно " + firstNumber);
        System.out.println("Значение переменной с типом short равно " + secondNumber);
        System.out.println("Значение переменной с типом int равно " + thirdNumber);
        System.out.println("Значение переменной с типом long равно " + fourthNumber);
        System.out.println("Значение переменной с типом float равно " + fifthNumber);
        System.out.println("Значение переменной с типом double равно " + sixthNumber);

        //Second exercise
        float firstNumb = 27.12f;
        long secondNumb = 987678965549L;
        float thirdNumb = 2.786f;
        short fourthNumb = 569;
        short fifthNumb = -159;
        short sixth = 27897;
        byte seventhNumb = 67;

        //Third exercise
        byte firstClassNumb = 23;
        byte secondClassNumb = 27;
        byte thirdClassNumb = 30;
        short paperNumb = 480;
        int sumClassNumb = firstClassNumb + secondClassNumb + thirdClassNumb;
        //Вместо этого (строка 32) можно было сразу создать переменную типа <byte> <sumClassNum> = 23 + 27 + 30
        int oneStudentPaper = paperNumb / sumClassNumb;

        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги");

        //Fourth exercise
        byte bottleInTwoMinutes = 16;
        int bottleInTwentyMinutes = bottleInTwoMinutes * 10;
        int bottleInOneDay = bottleInTwentyMinutes * 72;
        int bottleInThreeDay = bottleInOneDay * 3;
        int bottleInOneMonth = bottleInThreeDay * 10;

        System.out.println("За двадцать минут машина произвела " + bottleInTwentyMinutes + " штук бутылок");
        System.out.println("За один день машина произвела " + bottleInOneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottleInThreeDay + " штук бутылок");
        System.out.println("За тридцать дней машина произвела " + bottleInOneMonth + " штук бутылок");

        //Fifth exercise
        byte totalCansOfPaint = 120;
        byte whitePaintForCabinet = 2;
        byte brownPaintForCabinet = 4;
        int whiteCansOfPaint = totalCansOfPaint / (whitePaintForCabinet + brownPaintForCabinet) * whitePaintForCabinet;
        int brownCansOfPaint = totalCansOfPaint / (whitePaintForCabinet + brownPaintForCabinet) * brownPaintForCabinet;
        int cabinetNumber = totalCansOfPaint / (whitePaintForCabinet + brownPaintForCabinet);

        System.out.println("В школе, где " + cabinetNumber + " классов, нужно " + whiteCansOfPaint + " банок белой краски и "
                + brownCansOfPaint + " банок коричневой каски");

        //Sixth exercise
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        float totalWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        float totalWeightKg = totalWeight / 1000;

        System.out.printf("Вес спортзавтрака в граммах: %.0f", totalWeight);
        System.out.printf("\nВес спортзавтрака в килограммах: %.2f\n", totalWeightKg);

        //Seventh exercise
        short totalWeightFotSportsman = 7000;
        int daysIf250g = totalWeightFotSportsman / 250;
        int daysIf500g = totalWeightFotSportsman / 500;
        int averageDays = (daysIf250g + daysIf500g) / 2;

        System.out.println("При ежеденвной потере 250 грамм спортсмен похудеет через " + daysIf250g + " дней");
        System.out.println("При ежеденвной потере 500 грамм спортсмен похудеет через " + daysIf500g + " дней");
        System.out.println("В среднем потребуется " + averageDays + " дней");

        //Eighth exercise
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double newMashaSalary = mashaSalary * 1.1;
        double newDenisSalary = denisSalary * 1.1;
        double newKristinaSalary = kristinaSalary * 1.1;
        double mashaYearSalary = (newMashaSalary - mashaSalary) * 12;
        double denisYearSalary = (newDenisSalary - denisSalary) * 12;
        double kristinaYearSalary = (newKristinaSalary - kristinaSalary) * 12;

        System.out.printf("Маша теперь получает %.0f рублей. Годовой доход вырос на %.0f\n", newMashaSalary, mashaYearSalary);
        System.out.printf("Денис теперь получает %.0f рублей. Годовой доход вырос на %.0f\n", newDenisSalary, denisYearSalary);
        System.out.printf("Кристина теперь получает %.0f рублей. Годовой доход вырос на %.0f\n", newKristinaSalary, kristinaYearSalary);
    }
}