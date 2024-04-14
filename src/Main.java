public class Main {
    // Метод для создания объекта спорткара по заданному имени класса
    public static SportCar createObject(String className) {
        switch (className) {
            case "Bugatti":
                return new Bugatti(1.3, 450, 8.0);
            case "Ferrari":
                return new Ferrari(1.9, 320, "LaFerrari");
            case "McLaren":
                return new McLaren(1.7, 370, "Blue");
            default:
                return null;
        }
    }

    public static void main(String[] args){
        // Создание объектов с помощью метода createObject
        SportCar bugatti = createObject("Bugatti");
        SportCar ferrari = createObject("Ferrari");
        SportCar mclaren = createObject("McLaren");

        // Помещение объектов в массив
        SportCar[] cars = {bugatti, ferrari, mclaren};

        // Вызов метода print() для каждого объекта массива

        for (SportCar car : cars) {
            if (car instanceof Printable){
                ((Printable) car).print();
                System.out.println();
            }
        }
    }
}