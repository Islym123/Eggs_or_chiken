package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создаем потоки с помощью лямбда-выражений
        Thread chickenThread = new Thread(() -> System.out.println("Курица"));
        Thread eggThread = new Thread(() -> System.out.println("Яйцо"));

        // Запускаем потоки
        chickenThread.start();
        eggThread.start();

        // Ждем завершения потоков с использованием метода join()
        chickenThread.join();
        eggThread.join();

        // Проверяем, кто завершился первым
        String winner = chickenThread.isAlive() ? "Яйцо" : "Курица";
        System.out.println("Спор выиграло " + winner + "!");
    }
}