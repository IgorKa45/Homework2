public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1"); //Задание 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        System.out.println("Задание 2"); //Задание 2
        dog = dog + 4;
        System.out.println("dog + 4 = " + dog);
        cat = cat + 4;
        System.out.println("cat + 4 = " + cat);
        paper = paper + 4;
        System.out.println("paper + 4 = " + paper);

        System.out.println("Задание 3"); //Задание 3
        dog = dog - 3.5;
        System.out.println("dog + 4 - 3.5 = " + dog);
        cat = cat - 1.6;
        System.out.println("cat + 4 - 1.6 = " + cat);
        paper = paper - 7639;
        System.out.println("paper + 4 - 7639 = " + paper);

        System.out.println("Задание 4"); //Задание 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("(friend + 2) / 7 = " + friend);

        System.out.println("Задание 5"); //Задание 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("(frog * 10)/3.5 = " + frog);
        frog = frog + 4;
        System.out.println("[(frog * 10)/3.5]+4 = " + frog);

        System.out.println("Задание 6"); //Задание 6
        var fighter1 = 78.2;
        System.out.println("Вес бойца 1 = " + 78.2 + " кг.");
        var fighter2 = 82.7;
        System.out.println("Вес бойца 2 = " + 82.7 + " кг.");
        var totalWeight = fighter1 + fighter2;
        System.out.println("Суммарный вес бойцов = " + totalWeight + " кг.");

        System.out.println("Задание 7"); //Задание 7
        var mod = fighter2 % fighter1;
        System.out.println("Остаток от деления между двумя весами = " + mod);

        System.out.println("Задание 8"); //Задание 8
        var hours =  640;
        var hoursForEmpoyee = 8;
        var employee = hours / hoursForEmpoyee;
        System.out.println("1.Всего работников в компании " + employee + " человек");
        employee =employee + 94;
        var hours2 = employee * 8;
        System.out.println("2.Если в компании работает " + employee + " человек, то всего " + hours2 + " часов работы может быть поделено между сотрудниками");
    }
}