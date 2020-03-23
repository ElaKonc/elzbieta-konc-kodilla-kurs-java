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
    public void testAddOneFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);

        shapeCollector.addFigure(triangle);

        int size = shapeCollector.getShapesSize();

        Assert.assertEquals(1, size);
    }

    @Test
    public void testAddMoreFigures() {
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
        Assert.assertFalse(shape1.contains(shape2));
    }

    @Test
    public void testRemoveSameTypeFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle("triangle", 2,3);
        Triangle triangle2 = new Triangle("triangle", 3,2);
        Triangle triangle3 = new Triangle("triangle",2,4);

        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(triangle3);

        int sizeAddList = shapeCollector.getShapesSize();

        shapeCollector.removeFigure(triangle1);
        int sizeRemoveList = shapeCollector.getShapesSize();

        Assert.assertTrue(sizeAddList>sizeRemoveList);
        Assert.assertEquals(shapeCollector.getFigure(0), triangle2);
        Assert.assertEquals(shapeCollector.getFigure(1), triangle3);
    }

    @Test
    public void testRemoveNotExistingFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);
        Shape circle1 = new Circle("circle 1",5);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        List<Shape> shapesCollect = new ArrayList<Shape>();
        shapesCollect.add(triangle);
        shapesCollect.add(circle);
        shapesCollect.add(square);

        List<Shape> shapeList = shapeCollector.showFigures();

        int sizeAddList = shapeCollector.getShapesSize();

        shapeCollector.removeFigure(circle1);

        int sizeRemoveList = shapeCollector.getShapesSize();

        Assert.assertEquals(sizeAddList, sizeRemoveList);
        Assert.assertEquals(shapesCollect.toString(), shapeList.toString());
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

        Assert.assertEquals(circle, result);
        Assert.assertNull(shapeCollector.getFigure(-1));
        Assert.assertNull(shapeCollector.getFigure(3));
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
        Assert.assertFalse(shapeList.isEmpty());
    }
}