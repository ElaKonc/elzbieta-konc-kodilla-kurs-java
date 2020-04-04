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

        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }

    @Test
    public void testAddThreeFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2,3);
        Shape circle = new Circle("ciricle", 2);
        Shape square = new Square("square",2);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        Assert.assertEquals(3, shapeCollector.showFigures().size());
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

        String shape1a = shapeCollector.getFigure(0).toString();
        String shape2a = shapeCollector.getFigure(1).toString();
        int sizeAddList = shapeCollector.showFigures().size();

        shapeCollector.removeFigure(circle);
        String shape1b = shapeCollector.getFigure(0).toString();
        String shape2b = shapeCollector.getFigure(1).toString();
        int sizeRemoveList = shapeCollector.showFigures().size();

        Assert.assertTrue(sizeAddList>sizeRemoveList);
        Assert.assertTrue(shape1a.contains(shape1b));
        Assert.assertFalse(shape2a.contains(shape2b));
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

        int sizeAddList = shapeCollector.showFigures().size();

        shapeCollector.removeFigure(triangle1);
        int sizeRemoveList = shapeCollector.showFigures().size();

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

        int sizeAddList = shapeCollector.showFigures().size();

        shapeCollector.removeFigure(circle1);

        int sizeRemoveList = shapeCollector.showFigures().size();

        Assert.assertEquals(sizeAddList, sizeRemoveList);
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