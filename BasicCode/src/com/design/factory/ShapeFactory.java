package com.design.factory;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 14:41
 * @description:
 */
public class ShapeFactory {

    /**
     * 根据给的类型名称，选择返回什么对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equals("Circle")){
            return new Circle();
        }else if(shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("Circle");
        shape.draw();
    }
}
