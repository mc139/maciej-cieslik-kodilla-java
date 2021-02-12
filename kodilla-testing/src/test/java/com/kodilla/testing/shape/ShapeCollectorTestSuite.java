package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static com.kodilla.testing.shape.ShapeCollector.shapes;

@DisplayName("Test suite for methods of ShapeCollector class")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for methods manipulating data")
    class TestForMethodsManipulatingData {

        @Test
        void testAddFigure() {
            //GIVEN
            ShapeCollector shapeCollector1 = new ShapeCollector(shapes);
            Shape square = new Square(8);
            Shape triangle = new Triangle(12, 6);
            Shape circle = new Circle(5);


            //WHEN
            shapeCollector1.addFigure(square);
            shapeCollector1.addFigure(triangle);
            shapeCollector1.addFigure(circle);

            Object expected =ShapeCollector.getFigure(0);


            //THEN
            Assertions.assertEquals(expected,triangle);

        }

        @Test
        void testRemoveFigure() {
            //GIVEN
            ShapeCollector shapeCollector1 = new ShapeCollector(shapes);
            Shape square = new Square(8);
            Shape triangle = new Triangle(12, 6);
            Shape circle = new Circle(5);

            //WHEN
            shapeCollector1.addFigure(square);
            shapeCollector1.addFigure(triangle);
            shapeCollector1.addFigure(circle);
            shapeCollector1.removeFigure(square);
            shapeCollector1.removeFigure(circle);

            //THEN

            Assertions.assertEquals(triangle, shapeCollector1.getFigure(0));
        }
    }

    @Nested
    @DisplayName("Test for methods reading data")
    class TestForMethodsReadingData {
        @Test
        void testGetFigure() {
            //GIVEN
            ShapeCollector shapeCollector2 = new ShapeCollector(shapes);
            Shape square = new Square(8);


            //WHEN
            shapeCollector2.addFigure(square);
            Object actual = ShapeCollector.getFigure(0);
            Object expected = square;
            //THEN
            Assertions.assertEquals(expected, actual);

        }

        @Test
        void testShowFigures() {

            //GIVEN
            ShapeCollector shapeCollector2 = new ShapeCollector(shapes);
            Shape square = new Square(8);
            Shape triangle = new Triangle(12, 6);
            Shape circle = new Circle(5);

            //WHEN
            shapeCollector2.addFigure(square);
            shapeCollector2.addFigure(triangle);
            shapeCollector2.addFigure(circle);
            String expected = "Square,Triangle,Circle,";
            String actual = shapeCollector2.showFigures();
            //THEN
            Assertions.assertEquals(expected, actual);

        }
    }

}
