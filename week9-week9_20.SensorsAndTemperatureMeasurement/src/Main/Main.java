/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import application.*;

/**
 *
 * @author spoon
 */
public static void main(String[] args) {
  ConstantSensor ten = new ConstantSensor(10);
  ConstantSensor minusFive = new ConstantSensor(-5);

  System.out.println( ten.measure() );
  System.out.println( minusFive.measure() );

  System.out.println( ten.isOn() );
  ten.off();
  System.out.println( ten.isOn() );
}
