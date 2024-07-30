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
}
