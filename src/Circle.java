class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double attributes() {
        return Math.PI * radius * radius;
    }
}
