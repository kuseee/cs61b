import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;


public class TestSort {
    @Test
    public void testSort(){
        String[] input ={"yaya","a","guig","nmhlhh"};
        String[] expected = {"a","guig","nmhlhh","yaya"};
        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void TestTheSmallest(){
        String[] input ={"yaya","a","guig","nmhlhh"};
        int expected = 1;
        int result = Sort.findsmallest(input,0);
        assertThat(result).isEqualTo(expected);

        expected = 1;
        result = Sort.findsmallest(input,1);
        assertThat(result).isEqualTo(expected);

        expected = 2;
        result = Sort.findsmallest(input,2);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void TestSwap(){
        String[] input ={"yaya","a","guig","nmhlhh"};
        String[] expected ={"yaya","guig","a","nmhlhh"};
        String[] result = Sort.swap(input,1,2);
        assertThat(result).isEqualTo(expected);
    }
}

