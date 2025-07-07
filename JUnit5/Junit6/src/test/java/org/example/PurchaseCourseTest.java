package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest {

    @Test
    void testproceedWithCourse() {
        PurchaseCourse pc=new PurchaseCourse();
        boolean status=pc.proceedWithCourse(new JavaCourse());
        assertTrue(status);
    }
}