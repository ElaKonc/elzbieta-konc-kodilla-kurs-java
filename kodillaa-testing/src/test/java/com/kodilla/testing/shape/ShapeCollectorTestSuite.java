package com.kodilla.testing.shape;

import org.junit.*;
import java.util.*;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Początek testów");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Koniec testów");
    }

    @Before
    public void beforeSingleTest() {
        System.out.println("Start");
    }

    @After
    public void afterSingleTest() {
        System.out.println("Stop");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        int size = shapeCollector.getShapesSize();

        Assert.assertEquals(3, size);
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        String shape1 = shapeCollector.getFigure(1).toString();
        int sizeAddList = shapeCollector.getShapesSize();

        shapeCollector.removeFigure(circle);
        String shape2 = shapeCollector.getFigure(1).toString();
        int sizeRemoveList = shapeCollector.getShapesSize();

        Assert.assertTrue(sizeAddList>sizeRemoveList);
        Assert.assertNotEquals(shape1, shape2);
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        Shape result = shapeCollector.getFigure(1);

        Assert.assertEquals(new Circle("circle",2), result);
    }
    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        List<Shape> shapesCollect = new ArrayList<Shape>();
        shapesCollect.add(triangle);
        shapesCollect.add(circle);
        shapesCollect.add(square);

        List<Shape> shapeList = shapeCollector.showFigures();

        Assert.assertEquals(shapesCollect.toString(), shapeList.toString());
    }
}