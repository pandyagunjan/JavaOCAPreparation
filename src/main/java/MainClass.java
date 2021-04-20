import static java.lang.System.out;

public class MainClass {

    public static void main(String[] args) {
        Car myCar= new Car();
       // myCar.color="white";
        myCar.start();
        myCar.printDescription();

       // System.out.println(myCar.color);
        Car car1,car2,car3;
        car1 = new Car("red" , "Sedan");
        car2 = new Car("blue" , "Station Wagon");
        car3 = new Car("white" , "Coupe");

        car1.printDescription();
        car2.printDescription();
        car3.printDescription();
        Car.resetCounter();
        //car3.printDescription();
        out.println(Car.carCount);

        //Modifies and prints the updated color and type
        car3.customize("YELLOW" , "PILOT");


        //Static members if assigned to null , won't throw nullPointer exception.
        Math m = null;
        double result = m.floor(28.15); // Confusing code, but it works.
        out.println(result);

        //Should be written as
        double result1=Math.floor(28.15);


        byte b = -128;
        out.println(b);





    }

    package com.codility.tasks.invert;

import com.codility.tasks.invert.Inverter;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

    public class InverterTest {

        @Test public void shouldInvert() {
            //Given
            String expected = "elppa";
            //When
            String inverted = Inverter.invert("apple");
            //Then
            Assert.assertEquals(expected , inverted);


        }

        @Test public void shouldInvertCheckNotCorrect() {
            //Given
            String expected = "test";
            //When
            String inverted = Inverter.invert("test");
            //Then
            Assert.assertNotEquals(expected , inverted);
        }


        @Test public void shouldInvertCheckEmpty() {
            //Given
            String expected = "";
            //When
            String inverted = Inverter.invert("");
            //Then
            Assert.assertEquals(expected , inverted);
        }

        @Test public void shouldInvertCapitalLetter() {
            // Given
            String input = "Negentropy";
            String expected = "yportnegeN";
            // when
            String actual = Inverter.invert(input);
            // then
            Assert.assertEquals(expected, actual);
        }
        @Test public void shouldInvertOneCharacter() {
            // Given
            String input = "C";
            String expected = "C";
            // when
            String actual = Inverter.invert(input);
            // then
            Assert.assertEquals(expected, actual);
        }

//  @Test public void shouldInvertNull() {
//      // Given
//      String input ;
//      String expected ;
//  // when
//  console.log(Inverter.invert(input));
//  // then
//  Assert.assertEquals(expected, actual);
//   }


    }


    // The flow to initilize is
    // In - Line
    // Block
    // Constructor




}
