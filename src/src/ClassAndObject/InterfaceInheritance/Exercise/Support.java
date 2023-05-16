package ClassAndObject.InterfaceInheritance.Exercise;

import ClassAndObject.GenerateMethod.Hero;

public class Support extends Hero implements Healer{
    @Override
    public void heal(){
        System.out.println("使用治疗术");
    }
}
