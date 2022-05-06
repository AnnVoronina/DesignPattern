package Singleton;

import java.util.ArrayList;
import java.util.List;

// Класс логер реализует паттерн Singleton
public class Logger {
    protected int num = 1;
    protected List<String> logList = new ArrayList<>();

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    // В этом поле храним ссылку на единственный объект этого класса который будем отдавать пользователям
    private static Logger logger;

    // Запрещаем пользователям пользоваться конструктором нашего класса
    private Logger() {}

    // Пользователи которым нужен объект нашего класса получают всегда один и тот же объект, который мы храним
    // в приватном статичном поле, которое мы заполняем в этом методе если оно до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
        public void showLog() {
            logList.forEach(System.out::println);
        }

}

