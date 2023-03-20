package com.easy.life;

public class Fields {
    public String someField = "";
    public int someOtherField = 1;

    public void SomeMethod() {
        Clazz clazz = new Clazz();
        String someField = "sameName, different variable";
        someOtherField = 6;
        String someOtherField = "empty";
        someOtherField = someField.length();
        int a = someField.split(":").clone().getClass().getName().length();
        clazz.field.value = "ads";
        someField = "";
        // this.someField = someField;
        // clazz.theOtherMethod(a);
        // theOtherMethod(a);
        // this.theOtherMethod(a);
    }

    public void theOtherMethod(int a) {
        // int someOtherField = 1;
        int b = a + someOtherField;
    }

}
