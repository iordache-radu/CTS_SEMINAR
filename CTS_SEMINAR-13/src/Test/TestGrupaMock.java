package Test;
import Clase.Grupa;
import Clase.IStudent;
import Clase.Student;
import Test.Categori.GetPromovabilitateCategory;
import Test.Dubluri.DummyStudent;
import Test.Dubluri.FakeStudent;
import Test.Dubluri.StubStudent;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestGrupaMock {

    @Test
    public void testAdaugaStudent(){
        IStudent student=new DummyStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getStudenti().size());
    }


    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitate(){
        IStudent student=new StubStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getPromovabilitate(),0.001);
    }


    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateFakeStudent(){
        Grupa grupa=new Grupa(1081);
        for(int i=0;i<8;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(false);
           grupa.adaugaStudent(student);
        }

        for(int i=0;i<2;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(true);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.8,grupa.getPromovabilitate(),0.01);


    }
}
