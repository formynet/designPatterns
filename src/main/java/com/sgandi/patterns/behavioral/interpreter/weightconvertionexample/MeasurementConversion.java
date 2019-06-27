package com.sgandi.patterns.behavioral.interpreter.weightconvertionexample;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeasurementConversion {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());
  private static final String PACKAGE =
      "com.sgandi.patterns.behavioral.interpreter.weightconvertionexample.";

  public static void main(String[] args) {

    // Create pop up window that asks for a question

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");

    // Add the question to the context for analysis

    ConversionContext question = new ConversionContext(questionAsked);

    String fromConversion = question.getFromConversion();

    String toConversion = question.getToConversion();

    double quantity = question.getQuantity();

    try {

      // Get class based on the from conversion string

      Class<?> tempClass = Class.forName(PACKAGE + fromConversion);

      // Get the constructor dynamically for the conversion string

      Constructor<?> con = tempClass.getConstructor();

      // Create a new instance of the object you want to convert from

      Object convertFrom = con.newInstance();

      // Define the method parameters expected by the method that
      // will convert to your chosen unit of measure

      Class[] methodParams = new Class[] {Double.TYPE};

      // Get the method dynamically that will be needed to convert
      // into your chosen unit of measure

      Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

      // Define the method parameters that will be passed to the above method

      Object[] params = new Object[] {Double.valueOf(quantity)};

      // Get the quantity after the conversion

      String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

      // Print the results

      String answerToQues = question.getResponse() + toQuantity + " " + toConversion;

      JOptionPane.showMessageDialog(null, answerToQues);

      // Closes the frame after OK is clicked

      frame.dispose();

    } catch (ClassNotFoundException e) {
      log.error("Class not found exception: ", e);
    } catch (NoSuchMethodException e) {
      log.error("NoSuchMethodException : ", e);
    } catch (SecurityException e) {
      log.error("SecurityException : ", e);
    } catch (InstantiationException e) {
      log.error("InstantiationException : ", e);
    } catch (IllegalAccessException e) {
      log.error("IllegalAccessException : ", e);
    } catch (IllegalArgumentException e) {
      log.error("IllegalArgumentException : ", e);
    } catch (InvocationTargetException e) {
      log.error("InvocationTargetException : ", e);
    }

  }

}
