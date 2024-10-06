public class Main {
    public static void main(String[] args) {
        Person max = new Person(71.1, 1.76);
        Person lex = new Person(95.2, 1.82);
        Person san = new Person(90.3, 1.73);
        System.out.println("Максим, Ваш ИМТ: " + round(max.imt) + ", Ваша цель на следующую неделю: " + 1000*round((max.weight - max.idealWeight) / 25) + " граммов");
        System.out.println("Алексей, Ваш ИМТ: " + round(lex.imt) + ", Ваша цель на следующую неделю: " + 1000*round((lex.weight - lex.idealWeight) / 25)+ " граммов");
        System.out.println("Александр, Ваш ИМТ: " + round(san.imt) + ", Ваша цель на следующую неделю: " + 1000*round((san.weight - san.idealWeight) / 25)+ " граммов");
    }

    static Double round( Double arg) {

        return Math.round(arg*100.0)/100.0;
    }
}