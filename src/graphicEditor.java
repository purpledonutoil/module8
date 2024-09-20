interface Name {
    void name();
}

class Shape {
    public static void name(String name) {
        System.out.println("Shape name: " + name);
    }
}

class Circle extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("circle");
    }
}

class Square extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("Square");
    }
}

class Rectangle extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("rectangle");
    }
}

class Triangle extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("triangle");
    }
}

class Trapeze extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("trapeze");
    }
}


class Parallelepiped extends Shape implements Name {

    @Override
    public void name() {
        Shape.name("parallelepiped");
    }
}

class ShapeName extends Shape implements Name {
    private String shape;

    ShapeName(String shape) {
        this.shape = shape;
    }

    @Override
    public void name() {
        Shape.name(shape);
    }
}