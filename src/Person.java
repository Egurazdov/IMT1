public class Person {
    Double weight;
    Double height;
    Double imt;
    Double idealWeight;

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                ", imt=" + imt +
                ", delta=" + idealWeight +
                '}';
    }

    public Person(Double weight, Double height) {
        this.weight = weight;
        this.height = height;
        this.imt = weight / height / height;
        this.idealWeight = 20.8 * height * height;
    }


}
