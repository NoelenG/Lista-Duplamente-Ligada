package br.noelen;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {
    ListaD list;
    private final static String nome1 = "Noelen";
    private final static String nome2 = "José";
    private final static String nome3 = "Josiel";

    @Before
    public void setup(){
        list = new ListaD();
    }
    @Test
    public void testIsEmpty() {
        Boolean validacao = list.isEmpty();
        assertTrue("It has to be empty", validacao);
    }
    @Test
    public void testInsertBegin() {
        list.insertBegin(nome1);
        list.insertBegin(nome2);
        assertEquals("name:"+nome2+";"+"name:" + nome1 + ";", list.displayForward());
        
    }
    @Test
    public void testInsertLast() {
        list.insertLast(nome1);
        list.insertLast(nome2);
        assertEquals("name:"+nome1+";"+"name:" + nome2 + ";", list.displayForward());
    }
    @Test
    public void testDeleteBegin() {
        list.insertLast(nome1);
        list.insertLast(nome2);
        No removed = list.deleteBegin();

        assertEquals(nome2, removed);
        assertEquals("name:"+nome2+";", list.displayForward());
    }
    @Test
    public void testDeleteLast() {
        list.insertLast(nome1);
        list.insertLast(nome2);
        No removed = list.deleteLast();

        assertEquals(nome1, removed);
        assertEquals("name:"+nome1+";", list.displayForward());
    }
    @Test
    public void testDisplayForward() {
       
    }
    @Test
    public void testDisplayBackward() {
        
    }


}
