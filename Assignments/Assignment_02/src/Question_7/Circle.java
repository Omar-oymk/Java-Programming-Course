package Question_7;

// 7. Identify the problems in the following code:

//class Circle {
//    private double radius;
//
//    public Circle(double radius) {
//        radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getArea() {
//        return radius * radius * Math.PI;
//    }
//}
//
//class B extends Circle {
//    private double length;
//
//    B(double radius, double length) {
//        Circle(radius);
//        length = length;
//    }
//
//    @Override
//    public double getArea() {
//        return getArea() * length;
//    }
//}

// ANSWER:
/*
PROBLEM 1) in line 25: Circle(radius): u shouldn't invoke it like that u should instead invoke
super(radius) to call the parent's constructor

PROBLEM 2) in line 25: length = length: this will not make any change at all and will give only
a logical error cause u have to identify which length is the one that u want to assign the
argument to : so fix is this.length = length

PROBLEM 3) in line 32: the fn should call the parent's version then multiply it by length instead
now it is just doing recursion forever with no stopping condition which will cause
stack overflow and stop the whole program: fix: super.getArea()
 */
