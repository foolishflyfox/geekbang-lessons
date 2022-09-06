package ioc.java.bean;

import org.apache.commons.beanutils.BeanUtils;

import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

/**
 * @author benfeihu
 */
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);

        Stream.of(beanInfo.getPropertyDescriptors()).forEach(
                propertyDescriptor -> {
                    System.out.println(propertyDescriptor.toString());
                    Class<?> propertyType = propertyDescriptor.getPropertyType();
                    String propertyName = propertyDescriptor.getName();
                    if ("age".equals(propertyName)) {
                        propertyDescriptor.setPropertyEditorClass(StringToIntegerPropertyEditor.class);
//                        propertyDescriptor.createPropertyEditor()
                    }
                }
        );
        Person person = new Person();
        BeanUtils.setProperty(person, "age", "123");
        System.out.println(person);
    }

    static class StringToIntegerPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            Integer value = Integer.valueOf(text);
            setValue(value);
        }
    }
}
