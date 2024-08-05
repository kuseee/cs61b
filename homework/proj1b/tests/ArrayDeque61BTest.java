import jh61b.utils.Reflection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class ArrayDeque61BTest {

     @Test
     @DisplayName("ArrayDeque61B has no fields besides backing array and primitives")
     void noNonTrivialFields() {
         List<Field> badFields = Reflection.getFields(ArrayDeque61B.class)
                 .filter(f -> !(f.getType().isPrimitive() || f.getType().equals(Object[].class) || f.isSynthetic()))
                 .toList();

         assertWithMessage("Found fields that are not array or primitives").that(badFields).isEmpty();
     }



     @Test
    public void AddFirstTest1(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        array.addFirst(5);
        array.addFirst(6);
        array.addFirst(7);
        array.addFirst(8);
        array.addFirst(9);
        array.addFirst(1);
        array.addFirst(10);
        assertThat(array.toList()).containsExactly(10,1,9,8,7,6,5).inOrder();
    }

    @Test
    public void AddLastTest1(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        array.addLast(5);
        array.addLast(6);
        array.addLast(7);
        array.addLast(8);
        array.addLast(9);
        array.addLast(1);
        array.addLast(10);
        assertThat(array.toList()).containsExactly(5,6,7,8,9,1,10).inOrder();
    }

    @Test
    public void AddFirstAndLastTest1(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        array.addFirst(5);
        array.addLast(6);
        array.addLast(7);
        array.addFirst(8);
        array.addLast(9);
        array.addLast(1);
        array.addFirst(10);
        assertThat(array.toList()).containsExactly(10,8,5,6,7,9,1).inOrder();
    }

    @Test
    public void IsEmptyTest1(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        array.addLast(5);
        array.addLast(6);
        array.addLast(7);
        array.addLast(8);
        array.addLast(9);
        array.addLast(1);
        array.addLast(10);
        boolean expected = false;
        assertThat(array.isEmpty()).isEqualTo(expected);
    }

    @Test
    public void IsEmptyTest2(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        boolean expected = true;
        assertThat(array.isEmpty()).isEqualTo(expected);
    }

    @Test
    public void SizeTest1(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        array.addLast(5);
        array.addLast(6);
        array.addLast(7);
        array.addLast(8);
        array.addLast(9);
        array.addLast(1);
        array.addLast(10);
        int expected = 7;
        assertThat(array.size()).isEqualTo(expected);
    }

    @Test
    public void SizeTest2(){
        Deque61B<Integer> array = new ArrayDeque61B<>();
        int expected = 0;
        assertThat(array.size()).isEqualTo(expected);
    }






}

