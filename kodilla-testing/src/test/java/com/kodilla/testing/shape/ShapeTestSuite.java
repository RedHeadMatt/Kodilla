package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

class ShapeTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }



    @DisplayName("Check addFigure() method")
    @Test
    void testAddFigureMethod() {

        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(5);

        shapeCollector.addFigure(circle);
        Assertions.assertEquals("CIRCLE", shapeCollector.getFigure(0).getShapeName());
    }

    @Nested
    @DisplayName("Test another values")
    class AnotherTestSuite{

        @BeforeEach
        public void before() {
            System.out.println("Test Case: begin");
        }

        @AfterEach
        public void after() {
            System.out.println("Test Case: end");
        }

        @BeforeAll
        public static void beforeAll() {
            System.out.println("Test Suite: begin");
        }

        @AfterAll
        public static void afterAll() {
            System.out.println("Test Suite: end");
        }

        void testAddFigureMethod(){
            ShapeCollector shapeCollector = new ShapeCollector();

            Square square = new Square(20);

            shapeCollector.addFigure(square);
            Assertions.assertEquals("SQUARE", shapeCollector.getFigure(0).getShapeName());

        }

    }




    @DisplayName("Check removeFigure() method & getFigure()")
    @Test
    void testRemoveFigureMethod() {

        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 15);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        shapeCollector.removeFigure(circle);

        Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
    }

    @DisplayName("Check showFigures() method")
    @Test
    void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 15);
        Square square = new Square(20);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        shapeCollector.showFigures();

        Assertions.assertEquals("CIRCLETRIANGLESQUARE", shapeCollector.showFigures());

    }


}
