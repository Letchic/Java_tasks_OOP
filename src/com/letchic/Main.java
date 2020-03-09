package com.letchic;

public class Main {
    public static void main(String[] args) {
        //Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5, "blue");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        circle1.setRadius(2);
        circle1.setColor("yellow");
        System.out.println(circle1);
        System.out.println(circle1.getArea());

        //Rectangle
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10f,5f);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimetr());
        rectangle1.setWidth(4);
        rectangle1.setLength(3);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());


        //Employee
        Employee employee = new Employee(1,"Petr", "Ivanov", 100000);
        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        employee.riseSalary(25);
        System.out.println(employee);

        //Book
        Author[] twelveChairsAuthor = {new Author("Ilya Ilf",'m'),new Author("Yevgeni Petrov",'m')};
        Book twelveChairs = new Book("The Twelve Chairs",twelveChairsAuthor,532d);
        System.out.println(twelveChairs);
        System.out.println(twelveChairs.getAutorNames());
        Author[] warPeaceAutor = {new Author("Leo Tolstoy",'m')};
        Book warPeace = new Book("War and Peace",warPeaceAutor,1200d);
        System.out.println(warPeace);
        warPeace.setPrice(1750);
        warPeace.setQty(10);
        System.out.println(warPeace);
    }
}
